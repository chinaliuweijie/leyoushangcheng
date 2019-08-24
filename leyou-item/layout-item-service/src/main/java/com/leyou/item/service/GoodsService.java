package com.leyou.item.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leyou.common.pojo.PageResult;
import com.leyou.item.bo.SpuBo;
import com.leyou.item.mapper.*;
import com.leyou.item.poji.*;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GoodsService {

    @Autowired
    private TbSpuMapper spuMapper;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private TbSpuDetailMapper tbSpuDetailMapper;
    @Autowired
    private TbSkuMapper tbSkuMapper;
    @Autowired
    private TbStockMapper tbStockMapper;

    public PageResult<SpuBo> querySpuBoByPage(String key, Boolean saleable, Integer page, Integer rows) {

        Example example = new Example(TbSpu.class);
        Example.Criteria criteria = example.createCriteria();
        // 搜索条件
        if (StringUtils.isNotBlank(key)) {
            criteria.andLike("title", "%" + key + "%");
        }
        if (saleable != null) {
            criteria.andEqualTo("saleable", saleable);
        }

        // 分页条件
        PageHelper.startPage(page, rows);

        // 执行查询
        List<TbSpu> spus = this.spuMapper.selectByExample(example);
        PageInfo<TbSpu> pageInfo = new PageInfo<>(spus);

        List<SpuBo> spuBos = new ArrayList<>();
        spus.forEach(spu->{
            SpuBo spuBo = new SpuBo();
            // copy共同属性的值到新的对象
            BeanUtils.copyProperties(spu, spuBo);
            // 查询分类名称
            List<String> names = this.categoryService.queryNamesByIds(Arrays.asList(spu.getCid1(), spu.getCid2(), spu.getCid3()));
            spuBo.setCname(StringUtils.join(names, "/"));

            Brand brand = this.brandMapper.selectByPrimaryKey(spu.getBrandId());
            if(brand!=null){
                // 查询品牌的名称
                spuBo.setBname(brand.getName());
            }
            spuBos.add(spuBo);
        });

        return new PageResult<>(pageInfo.getTotal(), spuBos);

    }



    /**
     * 新增商品
     * @param spuBo
     */
    @Transactional
    public void saveGoods(SpuBo spuBo) {
        // 新增spu
        // 设置默认字段
        spuBo.setId(null);
        spuBo.setSaleable(true);
        spuBo.setValid(true);
        spuBo.setCreateTime(new Date());
        spuBo.setLastUpdateTime(spuBo.getCreateTime());
        this.spuMapper.insertSelective(spuBo);

        // 新增spuDetail
        TbSpuDetail spuDetail = spuBo.getTbSpuDetail();
        spuDetail.setSpuId(spuBo.getId());
        this.tbSpuDetailMapper.insertSelective(spuDetail);

        saveSkuAndStock(spuBo);
    }

    private void saveSkuAndStock(SpuBo spuBo) {
        spuBo.getTbSkus().forEach(sku -> {
            // 新增sku
            sku.setSpuId(spuBo.getId());
            sku.setCreateTime(new Date());
            sku.setLastUpdateTime(sku.getCreateTime());
            this.tbSkuMapper.insertSelective(sku);

            // 新增库存
            TbStock stock = new TbStock();
            stock.setSkuId(sku.getId());
            stock.setStock(sku.getStock());
            this.tbStockMapper.insertSelective(stock);
        });
    }

    /**
     * 根据spuId查询spuDetail
     * @param spuId
     * @return
     */
    public TbSpuDetail querySpuDetailBySpuId(Long spuId) {

        return this.tbSpuDetailMapper.selectByPrimaryKey(spuId);
    }



    /**
     * 根据spuId查询sku的集合
     * 需要注意的是，为了页面回显方便，我们一并把sku的库存stock也查询出来
     * @param spuId
     * @return
     */
    public List<TbSku> querySkusBySpuId(Long spuId) {
        TbSku sku = new TbSku();
        sku.setSpuId(spuId);
        List<TbSku> skus = this.tbSkuMapper.select(sku);
        skus.forEach(s -> {
            TbStock stock = this.tbStockMapper.selectByPrimaryKey(s.getId());
            s.setStock(stock.getStock());
        });
        return skus;
    }


    @Transactional
    public void updateGoods(SpuBo spu) {
        // 查询以前sku
        List<TbSku> skus = this.querySkusBySpuId(spu.getId());
        // 如果以前存在，则删除
        if(!CollectionUtils.isEmpty(skus)) {
            List<Long> ids = skus.stream().map(s -> s.getId()).collect(Collectors.toList());
            // 删除以前库存
            Example example = new Example(TbStock.class);
            example.createCriteria().andIn("skuId", ids);
            this.tbStockMapper.deleteByExample(example);

            // 删除以前的sku
            TbSku record = new TbSku();
            record.setSpuId(spu.getId());
            this.tbSkuMapper.delete(record);

        }
        // 新增sku和库存
        saveSkuAndStock(spu);

        // 更新spu
        spu.setLastUpdateTime(new Date());
        spu.setCreateTime(null);
        spu.setValid(null);
        spu.setSaleable(null);
        this.spuMapper.updateByPrimaryKeySelective(spu);

        // 更新spu详情
        this.tbSpuDetailMapper.updateByPrimaryKeySelective(spu.getTbSpuDetail());
    }

}