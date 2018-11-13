package com.imooc.service;

import com.imooc.dto.OrderDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 11:10 2018/11/8
 * @Modified By:
 */
public interface OrderService {
    OrderDto create(OrderDto orderDto);
    OrderDto findOne(String orderId);
    Page<OrderDto> findList(String buyerOpenid, Pageable pageable);
    OrderDto cancel(OrderDto orderDto);
    OrderDto finish(OrderDto orderDto);
    OrderDto paid(OrderDto orderDto);
}
