package com.imooc.enums;

import lombok.Getter;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 9:31 2018/11/8
 * @Modified By:
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功");

    private Integer code;
    private String message;
    PayStatusEnum(Integer code,String message){
        this.code=code;
        this.message = message;
    }
}
