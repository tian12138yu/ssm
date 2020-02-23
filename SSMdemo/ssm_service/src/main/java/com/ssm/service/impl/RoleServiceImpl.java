package com.ssm.service.impl;

import com.ssm.dao.IRoleDao;
import com.ssm.domain.Role;
import com.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/8 15:17
 */
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao roleDao;

    public List<Role> findAll() throws Exception{
        return roleDao.findAll();
    }

    @Override
    public void save(Role role) {
        roleDao.sava(role);
    }
}
