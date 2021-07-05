package com.smxy.campus_recruit.mapper;

import com.smxy.campus_recruit.bean.CRCollectionJob;
import com.smxy.campus_recruit.bean.example.CRCollectionJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface CRCollectionJobMapper {
    long countByExample(CRCollectionJobExample example);

    int deleteByExample(CRCollectionJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CRCollectionJob record);

    int insertSelective(CRCollectionJob record);

    List<CRCollectionJob> selectByExample(CRCollectionJobExample example);

    CRCollectionJob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CRCollectionJob record, @Param("example") CRCollectionJobExample example);

    int updateByExample(@Param("record") CRCollectionJob record, @Param("example") CRCollectionJobExample example);

    int updateByPrimaryKeySelective(CRCollectionJob record);

    int updateByPrimaryKey(CRCollectionJob record);
}