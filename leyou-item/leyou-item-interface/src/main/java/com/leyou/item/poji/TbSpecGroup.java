package com.leyou.item.poji;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_spec_group")
public class TbSpecGroup {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 商品分类id，一个分类下有多个规格组
     */
    private Long cid;

    /**
     * 规格组的名称
     */
    private String name;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商品分类id，一个分类下有多个规格组
     *
     * @return cid - 商品分类id，一个分类下有多个规格组
     */
    public Long getCid() {
        return cid;
    }

    /**
     * 设置商品分类id，一个分类下有多个规格组
     *
     * @param cid 商品分类id，一个分类下有多个规格组
     */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /**
     * 获取规格组的名称
     *
     * @return name - 规格组的名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置规格组的名称
     *
     * @param name 规格组的名称
     */
    public void setName(String name) {
        this.name = name;
    }
}