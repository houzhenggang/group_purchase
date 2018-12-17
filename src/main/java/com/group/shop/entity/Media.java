package com.group.shop.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Media {
    private Integer id;

    private String url;

    private Integer type;

    private Date createTime;

    private Date lastEditTime;


}