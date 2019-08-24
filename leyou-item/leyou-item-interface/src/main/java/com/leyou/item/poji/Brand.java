package com.leyou.item.poji;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_brand")
public class Brand {
    /**
     * 品牌id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 品牌名称
     */
    private String name;

    /**
     * 品牌图片地址
     */
    private String image;

    /**
     * 品牌的首字母
     */
    private String letter;

    /**
     * 获取品牌id
     *
     * @return id - 品牌id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置品牌id
     *
     * @param id 品牌id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取品牌名称
     *
     * @return name - 品牌名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置品牌名称
     *
     * @param name 品牌名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取品牌图片地址
     *
     * @return image - 品牌图片地址
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置品牌图片地址
     *
     * @param image 品牌图片地址
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取品牌的首字母
     *
     * @return letter - 品牌的首字母
     */
    public String getLetter() {
        return letter;
    }

    /**
     * 设置品牌的首字母
     *
     * @param letter 品牌的首字母
     */
    public void setLetter(String letter) {
        this.letter = letter;
    }
}