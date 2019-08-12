package com.leyou.item.service;

import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.poji.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 根据parentId查询子类目
     * @param pid
     * @return
     */
    public List<Category>  queryCaregoriesByPid(long pid){
        Category category = new Category();
        category.setParentId(pid);


        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("parentId",pid);
        return  this.categoryMapper.selectByExample(example);


       // return this.categoryMapper.select(category);
    }

}
