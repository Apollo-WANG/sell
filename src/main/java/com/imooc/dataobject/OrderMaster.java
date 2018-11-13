package com.imooc.dataobject;

import enums.OrderStatusEnum;
import enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 9:49 2018/11/8
 * @Modified By:
 */

@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    @Id
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    private Integer payStatus  = PayStatusEnum.WAIT.getCode();
    private Date createTime;
    private Date updateTime;
}