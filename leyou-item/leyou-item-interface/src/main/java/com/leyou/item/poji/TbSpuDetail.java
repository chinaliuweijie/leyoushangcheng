package com.leyou.item.poji;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_spu_detail")
public class TbSpuDetail {
    @Column(name = "spu_id")
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long spuId;

    /**
     * 通用规格参数数据
     */
    @Column(name = "generic_spec")
    private String genericSpec;

    /**
     * 特有规格参数及可选值信息，json格式
     */
    @Column(name = "special_spec")
    private String specialSpec;

    /**
     * 包装清单
     */
    @Column(name = "packing_list")
    private String packingList;

    /**
     * 售后服务
     */
    @Column(name = "after_service")
    private String afterService;

    /**
     * 商品描述信息
     */
    private String description;

    /**
     * @return spu_id
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * @param spuId
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * 获取通用规格参数数据
     *
     * @return generic_spec - 通用规格参数数据
     */
    public String getGenericSpec() {
        return genericSpec;
    }

    /**
     * 设置通用规格参数数据
     *
     * @param genericSpec 通用规格参数数据
     */
    public void setGenericSpec(String genericSpec) {
        this.genericSpec = genericSpec;
    }

    /**
     * 获取特有规格参数及可选值信息，json格式
     *
     * @return special_spec - 特有规格参数及可选值信息，json格式
     */
    public String getSpecialSpec() {
        return specialSpec;
    }

    /**
     * 设置特有规格参数及可选值信息，json格式
     *
     * @param specialSpec 特有规格参数及可选值信息，json格式
     */
    public void setSpecialSpec(String specialSpec) {
        this.specialSpec = specialSpec;
    }

    /**
     * 获取包装清单
     *
     * @return packing_list - 包装清单
     */
    public String getPackingList() {
        return packingList;
    }

    /**
     * 设置包装清单
     *
     * @param packingList 包装清单
     */
    public void setPackingList(String packingList) {
        this.packingList = packingList;
    }

    /**
     * 获取售后服务
     *
     * @return after_service - 售后服务
     */
    public String getAfterService() {
        return afterService;
    }

    /**
     * 设置售后服务
     *
     * @param afterService 售后服务
     */
    public void setAfterService(String afterService) {
        this.afterService = afterService;
    }

    /**
     * 获取商品描述信息
     *
     * @return description - 商品描述信息
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置商品描述信息
     *
     * @param description 商品描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }
}