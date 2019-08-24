package com.leyou.item.poji;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_spec_param")
public class TbSpecParam {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 商品分类id
     */
    private Long cid;

    @Column(name = "group_id")
    private Long groupId;

    /**
     * 参数名
     */
    private String name;

    /**
     * 是否是数字类型参数，true或false
     */
    @Column(name = "`numeric`")
    private Boolean numeric;

    /**
     * 数字类型参数的单位，非数字类型可以为空
     */
    private String unit;

    /**
     * 是否是sku通用属性，true或false
     */
    private Boolean generic;

    /**
     * 是否用于搜索过滤，true或false
     */
    private Boolean searching;

    /**
     * 数值类型参数，如果需要搜索，则添加分段间隔值，如CPU频率间隔：0.5-1.0
     */
    private String segments;

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
     * 获取商品分类id
     *
     * @return cid - 商品分类id
     */
    public Long getCid() {
        return cid;
    }

    /**
     * 设置商品分类id
     *
     * @param cid 商品分类id
     */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /**
     * @return group_id
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * @param groupId
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取参数名
     *
     * @return name - 参数名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置参数名
     *
     * @param name 参数名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取是否是数字类型参数，true或false
     *
     * @return numeric - 是否是数字类型参数，true或false
     */
    public Boolean getNumeric() {
        return numeric;
    }

    /**
     * 设置是否是数字类型参数，true或false
     *
     * @param numeric 是否是数字类型参数，true或false
     */
    public void setNumeric(Boolean numeric) {
        this.numeric = numeric;
    }

    /**
     * 获取数字类型参数的单位，非数字类型可以为空
     *
     * @return unit - 数字类型参数的单位，非数字类型可以为空
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置数字类型参数的单位，非数字类型可以为空
     *
     * @param unit 数字类型参数的单位，非数字类型可以为空
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取是否是sku通用属性，true或false
     *
     * @return generic - 是否是sku通用属性，true或false
     */
    public Boolean getGeneric() {
        return generic;
    }

    /**
     * 设置是否是sku通用属性，true或false
     *
     * @param generic 是否是sku通用属性，true或false
     */
    public void setGeneric(Boolean generic) {
        this.generic = generic;
    }

    /**
     * 获取是否用于搜索过滤，true或false
     *
     * @return searching - 是否用于搜索过滤，true或false
     */
    public Boolean getSearching() {
        return searching;
    }

    /**
     * 设置是否用于搜索过滤，true或false
     *
     * @param searching 是否用于搜索过滤，true或false
     */
    public void setSearching(Boolean searching) {
        this.searching = searching;
    }

    /**
     * 获取数值类型参数，如果需要搜索，则添加分段间隔值，如CPU频率间隔：0.5-1.0
     *
     * @return segments - 数值类型参数，如果需要搜索，则添加分段间隔值，如CPU频率间隔：0.5-1.0
     */
    public String getSegments() {
        return segments;
    }

    /**
     * 设置数值类型参数，如果需要搜索，则添加分段间隔值，如CPU频率间隔：0.5-1.0
     *
     * @param segments 数值类型参数，如果需要搜索，则添加分段间隔值，如CPU频率间隔：0.5-1.0
     */
    public void setSegments(String segments) {
        this.segments = segments;
    }
}