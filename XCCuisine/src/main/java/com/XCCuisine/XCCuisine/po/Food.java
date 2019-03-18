package com.XCCuisine.XCCuisine.po;

import lombok.Data;

import java.util.Date;

@Data
public class Food {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 图片链接
     */
    private String image;

    /**
     * 介绍
     */
    private String intro;

    /**
     * 详情
     */
    private String detail;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
