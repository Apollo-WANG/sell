package com.imooc.service.impl;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dto.OrderDto;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.service.OrderService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 15:05 2018/11/8
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    private final String OPENID = "open3245445657";

    private final String ORDER_ID = "1541662661898388952";
    @Test
    public void create() {
        OrderDto orderDTO = new OrderDto();
        orderDTO.setBuyerAddress("广东省深圳市南方科技大学");
        orderDTO.setBuyerName("xxx");
        orderDTO.setBuyerPhone("13713897xxx");
        orderDTO.setBuyerOpenid(OPENID);

        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail detail1 = new OrderDetail();
        detail1.setProductId("123456");
        detail1.setProductQuantity(1);

        orderDetailList.add(detail1);

        orderDTO.setOrderDetailList(orderDetailList);

        OrderDto result = orderService.create(orderDTO);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() {
        OrderDto result = orderService.findOne(ORDER_ID);
        Assert.assertEquals(ORDER_ID, result.getOrderId());
    }

    @Test
    public void findList() {
        PageRequest request = new PageRequest(0, 2);
        Page<OrderDto> orderDtoPage = orderService.findList(OPENID, request);
        Assert.assertNotEquals(0, orderDtoPage.getTotalElements());
    }

    @Test
    public void cancel() {
        OrderDto orderDto = orderService.findOne(ORDER_ID);
        OrderDto reuslt = orderService.cancel(orderDto);
        Assert.assertNotEquals(OrderStatusEnum.CANCEL.getCode(), reuslt.getOrderStatus());
    }

    @Test
    public void finish() {
        OrderDto orderDto = orderService.findOne(ORDER_ID);
        OrderDto reuslt = orderService.finish(orderDto);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(), reuslt.getOrderStatus());
    }

    @Test
    public void paid() {
        OrderDto orderDto = orderService.findOne(ORDER_ID);
        OrderDto reuslt = orderService.paid(orderDto);
        Assert.assertEquals(PayStatusEnum.SUCCESS.getCode(), reuslt.getPayStatus());
    }
}
