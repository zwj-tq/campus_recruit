package com.smxy.campus_recruit.mapper;

import com.smxy.campus_recruit.bean.CRJobList;
import com.smxy.campus_recruit.bean.example.CRJobListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface CRJobListMapper {
    long countByExample(CRJobListExample example);

    int deleteByExample(CRJobListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CRJobList record);

    int insertSelective(CRJobList record);

    List<CRJobList> selectByExample(CRJobListExample example);

    CRJobList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CRJobList record, @Param("example") CRJobListExample example);

    int updateByExample(@Param("record") CRJobList record, @Param("example") CRJobListExample example);

    int updateByPrimaryKeySelective(CRJobList record);

    int updateByPrimaryKey(CRJobList record);
}