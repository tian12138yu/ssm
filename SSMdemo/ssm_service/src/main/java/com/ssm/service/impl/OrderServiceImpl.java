package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.ssm.dao.IOrderDao;
import com.ssm.domain.Orders;
import com.ssm.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/6 15:40
 */
@Service
@Transactional
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IOrderDao iOrderDao;
    /**
     * pageNum是页码值，pagesize是每页显示条数
     */
    public List<Orders> findAll(int page,int size) {
        PageHelper.startPage(page,size);
        return iOrderDao.findAll();
    }

    @Override
    public Orders findById(String orderId) {
        return iOrderDao.findById(orderId);
    }
}
