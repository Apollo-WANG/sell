package com.imooc.converter;

import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDto;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 0:15 2018/11/13
 * @Modified By:
 */
public class OrderMaster2OderDTOConverter {

    public static OrderDto converter(OrderMaster orderMaster) {
        OrderDto orderDTO = new OrderDto();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDto> converter(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e ->
            converter(e)
        ).collect(Collectors.toList());
    }
}
