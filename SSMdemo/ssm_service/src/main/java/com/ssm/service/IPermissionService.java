package com.ssm.service;

import com.ssm.domain.Permission;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/8 15:31
 */

public interface IPermissionService {
    List<Permission> findAll();

    void save(Permission permission);
}
