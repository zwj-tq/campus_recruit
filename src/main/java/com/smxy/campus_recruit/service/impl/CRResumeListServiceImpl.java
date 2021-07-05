package com.smxy.campus_recruit.service.impl;

import com.smxy.campus_recruit.bean.CRResumeList;
import com.smxy.campus_recruit.bean.example.CRResumeListExample;
import com.smxy.campus_recruit.mapper.CRResumeListMapper;
import com.smxy.campus_recruit.service.CRResumeListService;
import com.smxy.campus_recruit.util.ListUitl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张伟杰
 * @ClassName CRResumeServiceImpl.java
 * @Description TODO
 * @createTime 2021年07月05日 11:33:00
 */

@Service
public class CRResumeListServiceImpl implements CRResumeListService {
    @Autowired
    private CRResumeListMapper mapper;

    @Override
    public boolean add(CRResumeList resumeList) {
        return mapper.insert(resumeList)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return mapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean update(CRResumeList resumeList) {
        return mapper.updateByPrimaryKeySelective(resumeList)>0;
    }

    @Override
    public boolean updateAll(CRResumeList resumeList) {
        return mapper.updateByPrimaryKey(resumeList)>0;
    }

    @Override
    public CRResumeList getById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public CRResumeList getByNameAndEpname(String username, String epname) {
        CRResumeListExample example = new CRResumeListExample();
        example.createCriteria().andNameEqualTo(username).andToEpNameEqualTo(epname);
        return ListUitl.First(mapper.selectByExample(example));
    }

    @Override
    public List<CRResumeList> getByname(String username) {
        CRResumeListExample example=new CRResumeListExample();
        example.createCriteria().andNameEqualTo(username);
        return mapper.selectByExample(example);
    }

    @Override
    public List<CRResumeList> getByEpname(String epname) {
        CRResumeListExample example=new CRResumeListExample();
        example.createCriteria().andNameEqualTo(epname);
        return mapper.selectByExample(example);
    }
}
