package com.smxy.campus_recruit.service;

import com.smxy.campus_recruit.bean.CRUserStu;

/**
 * @author 张伟杰
 * @ClassName CRUserStuService.java
 * @Description TODO
 * @createTime 2021年06月30日 16:19:00
 */
public interface CRUserStuService {

    boolean add(CRUserStu userStu);
    boolean delete(Integer id);
    boolean update(CRUserStu userStu);
    boolean updateAll(CRUserStu userStu);

    CRUserStu getById(Integer id);
    CRUserStu getByUsername(String username);
    CRUserStu getByPhone(String phone);

    CRUserStu verify(String username,String password);
    CRUserStu verifyByUsername(String username,String password);
    CRUserStu verifyByPhone(String phone,String password);


}
