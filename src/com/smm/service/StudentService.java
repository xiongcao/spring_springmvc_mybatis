package com.smm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smm.dao.TblDeptMapper;
import com.smm.dao.TblEmpMapper;
import com.smm.dao.VstuclsMapper;
import com.smm.entity.TblDept;
import com.smm.entity.TblEmp;
import com.smm.entity.Vstucls;
import com.smm.entity.VstuclsExample;

@Service
public class StudentService {
	@Autowired
	VstuclsMapper vstuclsMapper;
	@Autowired
	TblEmpMapper tblEmpMapper;
	@Autowired
	TblDeptMapper tblDeptMapper;

	// ��ѯ��ͼ ����ѧ����Ϣ
	public List<Vstucls> showAll() {
		List<Vstucls> list = vstuclsMapper.selectByExample(null);
		return list;
	}

	// ����Ա��ID ��ѯԱ����Ϣ�����ţ���ͼ��
	public List<Vstucls> showEmp(int id) {
		VstuclsExample vstucls = new VstuclsExample();
		vstucls.createCriteria().andEmpidEqualTo(id);
		List<Vstucls> vstucls2 = vstuclsMapper.selectByExample(vstucls);
		return vstucls2;
	}

	// ��ѯ���в�����Ϣ
	public List<TblDept> getDeptsAll() {
		List<TblDept> tblDepts = tblDeptMapper.selectByExample(null);
		return tblDepts;
	}

	// ����Ա��ID ��ѯԱ����Ϣ������
	public TblEmp getEmp(int id) {
		TblEmp tblEmp = tblEmpMapper.selectByPrimaryKey(id);
		return tblEmp;
	}

	// �޸�Ա����Ϣ
	public int upd(TblEmp tblEmp) {
		return tblEmpMapper.updateByPrimaryKey(tblEmp);
	}

	// ɾ��Ա��
	public int del(int id) {
		return tblEmpMapper.deleteByPrimaryKey(id);
	}

	// ���Ա��
	public int add(TblEmp tblEmp) {
		return tblEmpMapper.insert(tblEmp);
	}

}
