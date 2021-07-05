package com.smxy.campus_recruit.mapper;

import com.smxy.campus_recruit.bean.CRResumeList;
import com.smxy.campus_recruit.bean.example.CRResumeListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface CRResumeListMapper {
    long countByExample(CRResumeListExample example);

    int deleteByExample(CRResumeListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CRResumeList record);

    int insertSelective(CRResumeList record);

    List<CRResumeList> selectByExample(CRResumeListExample example);

    CRResumeList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CRResumeList record, @Param("example") CRResumeListExample example);

    int updateByExample(@Param("record") CRResumeList record, @Param("example") CRResumeListExample example);

    int updateByPrimaryKeySelective(CRResumeList record);

    int updateByPrimaryKey(CRResumeList record);
}