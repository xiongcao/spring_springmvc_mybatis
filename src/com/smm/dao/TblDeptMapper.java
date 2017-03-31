package com.smm.dao;

import com.smm.entity.TblDept;
import com.smm.entity.TblDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblDeptMapper {
    int countByExample(TblDeptExample example);

    int deleteByExample(TblDeptExample example);

    int deleteByPrimaryKey(Integer deptid);

    int insert(TblDept record);

    int insertSelective(TblDept record);

    List<TblDept> selectByExample(TblDeptExample example);

    TblDept selectByPrimaryKey(Integer deptid);

    int updateByExampleSelective(@Param("record") TblDept record, @Param("example") TblDeptExample example);

    int updateByExample(@Param("record") TblDept record, @Param("example") TblDeptExample example);

    int updateByPrimaryKeySelective(TblDept record);

    int updateByPrimaryKey(TblDept record);
}