package com.ssm.dao;

import com.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @Author tjy
 * @Date 2020/2/6 19:05
 */

public interface IMemberDao {
    @Select("select *from member where id=#{id}")
    public Member findById(String id);
}
