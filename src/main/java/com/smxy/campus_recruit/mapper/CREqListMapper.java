package com.smxy.campus_recruit.mapper;

import com.smxy.campus_recruit.bean.CREqList;
import com.smxy.campus_recruit.bean.example.CREqListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface CREqListMapper {
    long countByExample(CREqListExample example);

    int deleteByExample(CREqListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CREqList record);

    int insertSelective(CREqList record);

    List<CREqList> selectByExample(CREqListExample example);

    CREqList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CREqList record, @Param("example") CREqListExample example);

    int updateByExample(@Param("record") CREqList record, @Param("example") CREqListExample example);

    int updateByPrimaryKeySelective(CREqList record);

    int updateByPrimaryKey(CREqList record);
}