package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.ssm.dao.IProductDao;
import com.ssm.domain.Product;
import com.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/5 14:50
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAll(int page,int size) {
        PageHelper.startPage(page,size);
        return productDao.findAll();
    }

    @Override
    public void sava(Product product) {
        productDao.save(product);
    }
}
