package com.smxy.campus_recruit.mapper;

import com.smxy.campus_recruit.bean.CRUserAdmin;
import com.smxy.campus_recruit.bean.example.CRUserAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface CRUserAdminMapper {
    long countByExample(CRUserAdminExample example);

    int deleteByExample(CRUserAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CRUserAdmin record);

    int insertSelective(CRUserAdmin record);

    List<CRUserAdmin> selectByExample(CRUserAdminExample example);

    CRUserAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CRUserAdmin record, @Param("example") CRUserAdminExample example);

    int updateByExample(@Param("record") CRUserAdmin record, @Param("example") CRUserAdminExample example);

    int updateByPrimaryKeySelective(CRUserAdmin record);

    int updateByPrimaryKey(CRUserAdmin record);
}