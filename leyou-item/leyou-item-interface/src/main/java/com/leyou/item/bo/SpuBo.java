package com.leyou.item.bo;

import com.leyou.item.poji.TbSku;
import com.leyou.item.poji.TbSpu;
import com.leyou.item.poji.TbSpuDetail;

import java.util.List;

public class SpuBo extends TbSpu {

    private String cname;// 商品分类名称

    private String bname;// 品牌名称

    private TbSpuDetail tbSpuDetail;// 商品详情
    private List<TbSku> tbSkus;// sku列表

    public TbSpuDetail getTbSpuDetail() {
        return tbSpuDetail;
    }

    public void setTbSpuDetail(TbSpuDetail tbSpuDetail) {
        this.tbSpuDetail = tbSpuDetail;
    }

    public List<TbSku> getTbSkus() {
        return tbSkus;
    }

    public void setTbSkus(List<TbSku> tbSkus) {
        this.tbSkus = tbSkus;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
