package com.smxy.campus_recruit.service.impl;

import com.smxy.campus_recruit.bean.CRCollectionJob;
import com.smxy.campus_recruit.bean.example.CRCollectionJobExample;
import com.smxy.campus_recruit.mapper.CRCollectionJobMapper;
import com.smxy.campus_recruit.service.CRCollectionJobService;
import com.smxy.campus_recruit.util.ListUitl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张伟杰
 * @ClassName CRCollectionJobServiceImpl.java
 * @Description TODO
 * @createTime 2021年07月05日 11:32:00
 */
@Service
public class CRCollectionJobServiceImpl implements CRCollectionJobService {

    @Autowired
    private CRCollectionJobMapper mapper;

    @Override
    public boolean add(Integer userid,Integer jobid) {
        CRCollectionJob job=new CRCollectionJob().setJobId(jobid).setUserId(userid);
        return mapper.insert(job)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return mapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean deleteByUserIdAndJobId(Integer userid, Integer jobid) {
        CRCollectionJob job=getByUserIdAndJobId(userid,jobid);
        return delete(job.getId());
    }


    @Override
    public boolean update(CRCollectionJob collectionJob) {
        return mapper.updateByPrimaryKeySelective(collectionJob)>0;
    }

    @Override
    public boolean updateAll(CRCollectionJob collectionJob) {
        return mapper.updateByPrimaryKey(collectionJob)>0;
    }

    @Override
    public boolean existByUserIdAndJobId(Integer userid, Integer jobid) {
        CRCollectionJobExample example=new CRCollectionJobExample();
        example.createCriteria().andUserIdEqualTo(userid).andJobIdEqualTo(jobid);
        return !mapper.selectByExample(example).isEmpty();
    }

    @Override
    public CRCollectionJob getByUserIdAndJobId(Integer userid, Integer jobid) {
        CRCollectionJobExample example=new CRCollectionJobExample();
        example.createCriteria().andUserIdEqualTo(userid).andJobIdEqualTo(jobid);
        return ListUitl.First(mapper.selectByExample(example));
    }

    @Override
    public CRCollectionJob getById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CRCollectionJob> getByUserId(Integer userid) {
        CRCollectionJobExample example=new CRCollectionJobExample();
        example.createCriteria().andUserIdEqualTo(userid);
        return mapper.selectByExample(example);
    }
}
