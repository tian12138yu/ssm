package com.ssm.service;

import com.ssm.domain.Product;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/5 14:48
 */

public interface IProductService {
    public List<Product> findAll(int page,int size);

    void sava(Product product);
}
