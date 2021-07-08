package com.smxy.campus_recruit.service.impl;

import com.smxy.campus_recruit.bean.CRUserEq;
import com.smxy.campus_recruit.bean.CRUserStu;
import com.smxy.campus_recruit.bean.example.CRUserEqExample;
import com.smxy.campus_recruit.mapper.CRUserEqMapper;
import com.smxy.campus_recruit.service.CRUserEqService;
import com.smxy.campus_recruit.util.ListUitl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张伟杰
 * @ClassName CRUserEqServiceImpl.java
 * @Description TODO
 * @createTime 2021年07月05日 11:33:00
 */
@Service
public class CRUserEqServiceImpl implements CRUserEqService {

    @Autowired
    private CRUserEqMapper mapper;

    @Override
    public boolean add(CRUserEq userEq) {
        return mapper.insert(userEq)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return mapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean update(CRUserEq userEq) {
        return mapper.updateByPrimaryKeySelective(userEq)>0;
    }

    @Override
    public boolean updateAll(CRUserEq userEq) {
        return mapper.updateByPrimaryKey(userEq)>0;
    }

    @Override
    public CRUserEq verify(String username, String password) {
        CRUserEqExample example=new CRUserEqExample();
        example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        System.out.println(mapper.countByExample(example));
        CRUserEq eq= ListUitl.First(mapper.selectByExample(example));
        if(eq!=null){
            return eq;
        }
        example=new CRUserEqExample();
        example.createCriteria().andPhoneEqualTo(username).andPasswordEqualTo(password);
        eq= ListUitl.First(mapper.selectByExample(example));
        if(eq!=null){
            return eq;
        }
        return null;
    }

    @Override
    public CRUserEq getByUsername(String username) {
        CRUserEqExample example=new CRUserEqExample();
        example.createCriteria().andUsernameEqualTo(username);
        return ListUitl.First(mapper.selectByExample(example));
    }

    @Override
    public CRUserEq getByPhone(String phone) {
        CRUserEqExample example=new CRUserEqExample();
        example.createCriteria().andPhoneEqualTo(phone);
        return ListUitl.First(mapper.selectByExample(example));
    }

    @Override
    public CRUserEq getById(Integer userid) {
        return mapper.selectByPrimaryKey(userid);
    }
}
