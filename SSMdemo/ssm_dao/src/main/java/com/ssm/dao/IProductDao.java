package com.ssm.dao;

import com.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/5 14:46
 */

public interface IProductDao {
    @Select("select * from product where id=#{id}")
    public Product findById(String id);
    @Select("select *from product")
    public List<Product> findAll();

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
}
