package com.ssm.service;

import com.ssm.domain.Role;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/8 15:15
 */

public interface IRoleService {
    List<Role> findAll() throws Exception;

    void save(Role role);
}
