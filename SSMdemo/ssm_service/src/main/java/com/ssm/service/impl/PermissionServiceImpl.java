package com.ssm.service.impl;

import com.ssm.dao.IPermissionDao;
import com.ssm.domain.Permission;
import com.ssm.service.IPermissionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/8 15:33
 */
@Service
@Transactional
public class PermissionServiceImpl implements IPermissionService {
    private IPermissionDao iPermissionDao;
    @Override
    public List<Permission> findAll() {

        return iPermissionDao.findAll();
    }

    @Override
    public void save(Permission permission) {
        iPermissionDao.save(permission);
    }
}
