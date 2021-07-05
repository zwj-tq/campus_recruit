package com.smxy.campus_recruit.service;

import com.smxy.campus_recruit.bean.CRResumeList;
import com.smxy.campus_recruit.bean.CRUserStu;

import java.util.List;

/**
 * @author 张伟杰
 * @ClassName CRResume.java
 * @Description TODO
 * @createTime 2021年07月05日 11:29:00
 */
public interface CRResumeListService {
    boolean add(CRResumeList resumeList);
    boolean delete(Integer id);
    boolean update(CRResumeList resumeList);
    boolean updateAll(CRResumeList resumeList);

    CRResumeList getById(Integer id);
    CRResumeList getByNameAndEpname(String username,String epname);
    List<CRResumeList> getByname(String username);
    List<CRResumeList> getByEpname(String eqname);



}
