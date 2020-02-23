package com.ssm.dao;

import com.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/6 19:11
 */

public interface ITravellerDao {
    @Select("select * from traveller where id in(select travellerId from order_traveller where orderId=#{OrdersId})")
    public List<Traveller> findByOrdersId(String OrdersId);
}
