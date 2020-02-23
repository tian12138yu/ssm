package com.ssm.service;

import com.ssm.domain.Orders;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/6 15:38
 */

public interface IOrderService {
    List<Orders> findAll(int page,int size);

    Orders findById(String orderId);
}
