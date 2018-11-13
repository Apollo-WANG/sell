package enums;

import lombok.Getter;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 9:30 2018/11/8
 * @Modified By:
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消");

    private Integer code;
    private String message;
    OrderStatusEnum(Integer code,String message){
        this.code=code;
        this.message = message;
    }

}
