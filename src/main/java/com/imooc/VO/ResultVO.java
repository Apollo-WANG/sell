package com.imooc.VO;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 0:51 2018/11/8
 * @Modified By:
 */
import lombok.Data;

@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
}
