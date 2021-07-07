package com.smxy.campus_recruit.service;

import com.smxy.campus_recruit.bean.CRUserAdmin;
import com.smxy.campus_recruit.bean.CRUserEq;
import com.smxy.campus_recruit.bean.CRUserStu;

/**
 * @author 张伟杰
 * @ClassName CRUserAdmin.java
 * @Description TODO
 * @createTime 2021年07月05日 11:30:00
 */
public interface CRUserAdminService {

    boolean add(CRUserAdmin userAdmin);
    boolean delete(Integer id);

    boolean update();
    boolean updateAll();

    CRUserStu verify(String username, String password);
}
