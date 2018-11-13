package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 9:54 2018/11/8
 * @Modified By:
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
    Page<OrderMaster> findAllByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
