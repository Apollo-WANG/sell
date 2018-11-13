package com.imooc.dto;

import lombok.Data;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 11:16 2018/11/8
 * @Modified By:
 */
@Data
public class CartDto {
    private String productId;
    private  Integer productQuantity;

    public CartDto(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
