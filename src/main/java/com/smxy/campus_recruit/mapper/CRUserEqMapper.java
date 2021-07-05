package com.smxy.campus_recruit.mapper;

import com.smxy.campus_recruit.bean.CRUserEq;
import com.smxy.campus_recruit.bean.example.CRUserEqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface CRUserEqMapper {
    long countByExample(CRUserEqExample example);

    int deleteByExample(CRUserEqExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CRUserEq record);

    int insertSelective(CRUserEq record);

    List<CRUserEq> selectByExample(CRUserEqExample example);

    CRUserEq selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CRUserEq record, @Param("example") CRUserEqExample example);

    int updateByExample(@Param("record") CRUserEq record, @Param("example") CRUserEqExample example);

    int updateByPrimaryKeySelective(CRUserEq record);

    int updateByPrimaryKey(CRUserEq record);
}