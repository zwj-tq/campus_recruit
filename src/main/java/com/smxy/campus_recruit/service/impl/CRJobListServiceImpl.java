package com.smxy.campus_recruit.service.impl;

import com.smxy.campus_recruit.bean.CRJobList;
import com.smxy.campus_recruit.bean.example.CRJobListExample;
import com.smxy.campus_recruit.mapper.CRJobListMapper;
import com.smxy.campus_recruit.service.CRJobListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张伟杰
 * @ClassName CRJobListServiceImpl.java
 * @Description TODO
 * @createTime 2021年07月05日 11:32:00
 */
@Service
public class CRJobListServiceImpl implements CRJobListService {

    @Autowired
    private CRJobListMapper mapper;

    @Override
    public boolean add(CRJobList jobList) {
        return mapper.insert(jobList)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return mapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean update(CRJobList jobList) {
        return false;
    }

    @Override
    public List<CRJobList> getByEpname(String epname) {
        CRJobListExample example=new CRJobListExample();
        example.createCriteria().andEpNameEqualTo(epname);
        return mapper.selectByExample(example);
    }

    @Override
    public List<CRJobList> getByJobname(String jobname) {
        CRJobListExample example=new CRJobListExample();
        example.createCriteria().andJobNameLike("%"+jobname+"%");
        return mapper.selectByExample(example);
    }
}
