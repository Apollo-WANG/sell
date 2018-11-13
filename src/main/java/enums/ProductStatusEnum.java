package enums;

import lombok.Getter;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 0:38 2018/11/8
 * @Modified By:
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"上架"),DOWN(1,"下架");
    private Integer code;
    private String message;
    ProductStatusEnum(Integer code,String message){
        this.code=code;
        this.message = message;
    }
}
