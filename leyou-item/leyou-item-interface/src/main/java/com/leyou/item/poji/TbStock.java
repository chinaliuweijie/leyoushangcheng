package com.leyou.item.poji;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_stock")
public class TbStock {
    /**
     * 库存对应的商品sku id
     */
    @Id
    @Column(name = "sku_id")
    private Long skuId;

    /**
     * 可秒杀库存
     */
    @Column(name = "seckill_stock")
    private Integer seckillStock;

    /**
     * 秒杀总数量
     */
    @Column(name = "seckill_total")
    private Integer seckillTotal;

    /**
     * 库存数量
     */
    private Integer stock;

    /**
     * 获取库存对应的商品sku id
     *
     * @return sku_id - 库存对应的商品sku id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * 设置库存对应的商品sku id
     *
     * @param skuId 库存对应的商品sku id
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取可秒杀库存
     *
     * @return seckill_stock - 可秒杀库存
     */
    public Integer getSeckillStock() {
        return seckillStock;
    }

    /**
     * 设置可秒杀库存
     *
     * @param seckillStock 可秒杀库存
     */
    public void setSeckillStock(Integer seckillStock) {
        this.seckillStock = seckillStock;
    }

    /**
     * 获取秒杀总数量
     *
     * @return seckill_total - 秒杀总数量
     */
    public Integer getSeckillTotal() {
        return seckillTotal;
    }

    /**
     * 设置秒杀总数量
     *
     * @param seckillTotal 秒杀总数量
     */
    public void setSeckillTotal(Integer seckillTotal) {
        this.seckillTotal = seckillTotal;
    }

    /**
     * 获取库存数量
     *
     * @return stock - 库存数量
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存数量
     *
     * @param stock 库存数量
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }
}