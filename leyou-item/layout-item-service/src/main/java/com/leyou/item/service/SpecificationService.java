package com.leyou.item.service;

import com.leyou.item.mapper.TbSpecGroupMapper;
import com.leyou.item.mapper.TbSpecParamMapper;
import com.leyou.item.poji.TbSpecGroup;
import com.leyou.item.poji.TbSpecParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecificationService {

    @Autowired
    private TbSpecGroupMapper groupMapper;
    @Autowired
    private TbSpecParamMapper paramMapper;
    /**
     * 根据分类id查询分组
     * @param cid
     * @return
     */
    public List<TbSpecGroup> queryGroupsByCid(Long cid) {
        TbSpecGroup specGroup = new TbSpecGroup();
        specGroup.setCid(cid);
        return this.groupMapper.select(specGroup);
    }





    /**
     * 根据gid查询规格参数
     * @param gid
     * @return
     */
    public List<TbSpecParam> queryParams(Long gid, Long cid, Boolean generic, Boolean searching) {
        TbSpecParam record = new TbSpecParam();
        record.setGroupId(gid);
        record.setCid(cid);
        record.setGeneric(generic);
        record.setSearching(searching);
        return this.paramMapper.select(record);
    }
}