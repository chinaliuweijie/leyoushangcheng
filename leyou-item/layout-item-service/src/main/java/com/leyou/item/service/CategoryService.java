package com.leyou.item.service;

import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.poji.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
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

    /**
     * SelectByIdListMapper类的使用,首先他是一个接口,和通用mapper一样,需要被自定义的接口继承,这样就能使用sele****Mapeer的方法了.
     * 经常用的是selectByIdList(参数)方法 , 里面装的参数
     * 什么时候用呢? 当你这个参数是个list集合,这个list集里面又存储了任意个id, 这个方法会自动的遍历集合 ,根据每个id进行查询封装,返回一个list
     *  ————————————————
     * 版权声明：本文为CSDN博主「Nice康」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/weixin_42960380/article/details/81879528
     * @param ids
     * @return
     */
    public List<String> queryNamesByIds(List<Long> ids) {
        List<Category> list = this.categoryMapper.selectByIdList(ids);
        List<String> names = new ArrayList<>();
        for (Category category : list) {
            names.add(category.getName());
        }
        return names;
        // return list.stream().map(category -> category.getName()).collect(Collectors.toList());
    }
}
