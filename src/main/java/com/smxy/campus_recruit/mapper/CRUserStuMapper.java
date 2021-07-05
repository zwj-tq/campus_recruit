package com.smxy.campus_recruit.mapper;

import com.smxy.campus_recruit.bean.CRUserStu;
import com.smxy.campus_recruit.bean.example.CRUserStuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface CRUserStuMapper {
    long countByExample(CRUserStuExample example);

    int deleteByExample(CRUserStuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CRUserStu record);

    int insertSelective(CRUserStu record);

    List<CRUserStu> selectByExample(CRUserStuExample example);

    CRUserStu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CRUserStu record, @Param("example") CRUserStuExample example);

    int updateByExample(@Param("record") CRUserStu record, @Param("example") CRUserStuExample example);

    int updateByPrimaryKeySelective(CRUserStu record);

    int updateByPrimaryKey(CRUserStu record);
}