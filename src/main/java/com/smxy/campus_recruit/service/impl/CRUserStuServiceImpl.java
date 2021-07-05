package com.smxy.campus_recruit.service.impl;

import com.smxy.campus_recruit.bean.CRUserStu;
import com.smxy.campus_recruit.bean.example.CRUserStuExample;
import com.smxy.campus_recruit.mapper.CRUserStuMapper;
import com.smxy.campus_recruit.service.CRUserStuService;
import com.smxy.campus_recruit.util.ListUitl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张伟杰
 * @ClassName CRUserStuServiceImpl.java
 * @Description TODO
 * @createTime 2021年06月30日 16:19:00
 */
@Service
public class CRUserStuServiceImpl implements CRUserStuService {

    @Autowired
    private CRUserStuMapper mapper;


    @Override
    public boolean add(CRUserStu userStu) {
        return mapper.insertSelective(userStu)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return mapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean update(CRUserStu userStu) {
        return mapper.updateByPrimaryKeySelective(userStu)>0;
    }

    @Override
    public boolean updateAll(CRUserStu userStu) {
        return mapper.updateByPrimaryKey(userStu)>0;
    }

    @Override
    public CRUserStu getById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public CRUserStu getByUsername(String username) {
        CRUserStuExample example = new CRUserStuExample();
        example.createCriteria().andUsernameEqualTo(username);
        return ListUitl.First(mapper.selectByExample(example));
    }

    @Override
    public CRUserStu getByPhone(String phone) {
        CRUserStuExample example = new CRUserStuExample();
        example.createCriteria().andPhoneEqualTo(phone);
        return ListUitl.First(mapper.selectByExample(example));
    }

    @Override
    public CRUserStu verify(String username, String password) {
        CRUserStu userStu=verifyByUsername(username,password);
        if(userStu!=null){
            return userStu;
        }
        return verifyByPhone(username,password);
    }

    @Override
    public CRUserStu verifyByUsername(String username, String password) {
        CRUserStuExample example = new CRUserStuExample();
        example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<CRUserStu> userStus= mapper.selectByExample(example);
        if(!userStus.isEmpty()) {
            return userStus.get(0);
        }
        return null;
    }


    @Override
    public CRUserStu verifyByPhone(String phone, String password) {
        CRUserStuExample example = new CRUserStuExample();
        example.createCriteria().andPhoneEqualTo(phone).andPasswordEqualTo(password);
        List<CRUserStu> userStus= mapper.selectByExample(example);
        if(!userStus.isEmpty()) {
            return userStus.get(0);
        }
        return null;
    }
}
