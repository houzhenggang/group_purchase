package com.group.shop.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FreeBill {
    private Integer id;

    private Integer orderId;

    private Date createTime;

    private Date lastEditTime;

 
}