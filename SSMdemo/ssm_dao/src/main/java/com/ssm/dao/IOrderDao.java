package com.ssm.dao;

import com.ssm.domain.Member;
import com.ssm.domain.Orders;
import com.ssm.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/6 15:41
 */

public interface IOrderDao {
    @Select("select *from orders")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "ordNum", column = "ordNum"),
            @Result(property = "ordTime", column = "ordTime"),
            @Result(property = "ordStatus", column = "ordStatus"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "payType", column = "payType"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "product", column = "productId",javaType = Product.class,one=@One(select = "com.ssm.dao.IProductDao.findById"))

    })
    public List<Orders> findAll();

    @Select("select * from orders where id=#{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "ordNum", column = "ordNum"),
            @Result(property = "ordTime", column = "ordTime"),
            @Result(property = "ordStatus", column = "ordStatus"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "payType", column = "payType"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "product", column = "productId",javaType = Product.class,one=@One(select = "com.ssm.dao.IProductDao.findById")),
            @Result(property = "member", column = "memberId",javaType = Member.class,one=@One(select = "com.ssm.dao.IMemberDao.findById")),
            @Result(property = "travellers", column = "id",javaType = java.util.List.class,many=@Many(select = "com.ssm.dao.ITravellerDao.findByOrdersId"))


    })
    Orders findById(String id);
}
