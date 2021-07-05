package com.smxy.campus_recruit.service;

import com.smxy.campus_recruit.bean.CRCollectionJob;

import java.util.List;

/**
 * @author 张伟杰
 * @ClassName CRCollectionJobService.java
 * @Description TODO
 * @createTime 2021年07月05日 11:27:00
 */
public interface CRCollectionJobService {
    boolean add(Integer userid,Integer jobid);
    boolean delete(Integer id);
    boolean deleteByUserIdAndJobId(Integer userid,Integer jobid);
    boolean update(CRCollectionJob collectionJob);
    boolean updateAll(CRCollectionJob collectionJob);
    boolean existByUserIdAndJobId(Integer userid, Integer jobid);
    CRCollectionJob getByUserIdAndJobId(Integer userid, Integer jobid);
    CRCollectionJob getById(Integer id);
    List<CRCollectionJob> getByUserId(Integer userid);
}
