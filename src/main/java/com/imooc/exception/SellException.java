package com.imooc.exception;

import enums.ResultEnum;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 11:21 2018/11/8
 * @Modified By:
 */
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
