package com.smxy.campus_recruit.service;

import com.smxy.campus_recruit.bean.CRJobList;

/**
 * @author 张伟杰
 * @ClassName CRJobListService.java
 * @Description TODO
 * @createTime 2021年07月05日 11:28:00
 */
public interface CRJobListService {
    boolean add(CRJobList jobList);
    boolean delete(Integer id);

    boolean update(CRJobList jobList);

}
