package com.leyou.item.poji;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tb_sku")
public class TbSku {
    /**
     * sku id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * spu id
     */
    @Column(name = "spu_id")
    private Long spuId;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品的图片，多个图片以‘,’分割
     */
    private String images;

    /**
     * 销售价格，单位为分
     */
    private Long price;

    /**
     * 特有规格属性在spu属性模板中的对应下标组合
     */
    private String indexes;

    /**
     * sku的特有规格参数键值对，json格式，反序列化时请使用linkedHashMap，保证有序
     */
    @Column(name = "own_spec")
    private String ownSpec;

    /**
     * 是否有效，0无效，1有效
     */
    private Boolean enable;

    /**
     * 添加时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后修改时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;


    @Transient
    private Integer stock;// 库存

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取sku id
     *
     * @return id - sku id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置sku id
     *
     * @param id sku id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取spu id
     *
     * @return spu_id - spu id
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * 设置spu id
     *
     * @param spuId spu id
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * 获取商品标题
     *
     * @return title - 商品标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置商品标题
     *
     * @param title 商品标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取商品的图片，多个图片以‘,’分割
     *
     * @return images - 商品的图片，多个图片以‘,’分割
     */
    public String getImages() {
        return images;
    }

    /**
     * 设置商品的图片，多个图片以‘,’分割
     *
     * @param images 商品的图片，多个图片以‘,’分割
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     * 获取销售价格，单位为分
     *
     * @return price - 销售价格，单位为分
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置销售价格，单位为分
     *
     * @param price 销售价格，单位为分
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取特有规格属性在spu属性模板中的对应下标组合
     *
     * @return indexes - 特有规格属性在spu属性模板中的对应下标组合
     */
    public String getIndexes() {
        return indexes;
    }

    /**
     * 设置特有规格属性在spu属性模板中的对应下标组合
     *
     * @param indexes 特有规格属性在spu属性模板中的对应下标组合
     */
    public void setIndexes(String indexes) {
        this.indexes = indexes;
    }

    /**
     * 获取sku的特有规格参数键值对，json格式，反序列化时请使用linkedHashMap，保证有序
     *
     * @return own_spec - sku的特有规格参数键值对，json格式，反序列化时请使用linkedHashMap，保证有序
     */
    public String getOwnSpec() {
        return ownSpec;
    }

    /**
     * 设置sku的特有规格参数键值对，json格式，反序列化时请使用linkedHashMap，保证有序
     *
     * @param ownSpec sku的特有规格参数键值对，json格式，反序列化时请使用linkedHashMap，保证有序
     */
    public void setOwnSpec(String ownSpec) {
        this.ownSpec = ownSpec;
    }

    /**
     * 获取是否有效，0无效，1有效
     *
     * @return enable - 是否有效，0无效，1有效
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * 设置是否有效，0无效，1有效
     *
     * @param enable 是否有效，0无效，1有效
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * 获取添加时间
     *
     * @return create_time - 添加时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置添加时间
     *
     * @param createTime 添加时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后修改时间
     *
     * @return last_update_time - 最后修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param lastUpdateTime 最后修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}