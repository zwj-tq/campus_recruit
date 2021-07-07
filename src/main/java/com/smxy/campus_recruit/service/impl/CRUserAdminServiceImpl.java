package com.smxy.campus_recruit.service.impl;

import com.smxy.campus_recruit.bean.CRUserAdmin;
import com.smxy.campus_recruit.bean.CRUserStu;
import com.smxy.campus_recruit.service.CRUserAdminService;
import org.springframework.stereotype.Service;

/**
 * @author 张伟杰
 * @ClassName CRUserAdminServiceImpl.java
 * @Description TODO
 * @createTime 2021年07月05日 11:33:00
 */
@Service
public class CRUserAdminServiceImpl implements CRUserAdminService {
    @Override
    public boolean add(CRUserAdmin userAdmin) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public boolean updateAll() {
        return false;
    }

    @Override
    public CRUserStu verify(String username, String password) {
        return null;
    }
}
