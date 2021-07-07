package com.smxy.campus_recruit.service;

import com.smxy.campus_recruit.bean.CRUserEq;
import com.smxy.campus_recruit.bean.CRUserStu;

/**
 * @author 张伟杰
 * @ClassName CRUserEqService.java
 * @Description TODO
 * @createTime 2021年07月05日 11:30:00
 */
public interface CRUserEqService {

    boolean add(CRUserEq userEq);
    boolean delete(Integer id);

    boolean update(CRUserEq userEq);
    boolean updateAll(CRUserEq userEq);

    CRUserEq verify(String username, String password);

    CRUserEq getByUsername(String username);

    CRUserEq getByPhone(String phone);
}
