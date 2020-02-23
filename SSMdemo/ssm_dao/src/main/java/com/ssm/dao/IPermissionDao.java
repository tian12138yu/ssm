package com.ssm.dao;

import com.ssm.domain.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/8 14:29
 */

public interface IPermissionDao {
    @Select("select * from permission where id in (select permissionid from role_permission where roleid=#{id})")
    List<Permission> findByRoleId(String id);

    @Select("select *from permission")
    List<Permission> findAll();

    @Insert("insert into permission(permissionName,url) values(#{permissionName},#{url})")
    void save(Permission permission);
}
