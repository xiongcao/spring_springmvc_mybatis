package com.smm.dao;

import com.smm.entity.Vstucls;
import com.smm.entity.VstuclsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VstuclsMapper {
    int countByExample(VstuclsExample example);

    int deleteByExample(VstuclsExample example);

    int insert(Vstucls record);

    int insertSelective(Vstucls record);

    List<Vstucls> selectByExample(VstuclsExample example);

    int updateByExampleSelective(@Param("record") Vstucls record, @Param("example") VstuclsExample example);

    int updateByExample(@Param("record") Vstucls record, @Param("example") VstuclsExample example);
    //����Ա��ID ��ѯԱ����Ϣ������
    Vstucls findById(Integer empid);
}