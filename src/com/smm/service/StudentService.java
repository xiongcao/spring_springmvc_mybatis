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

	// 查询视图 所有学生信息
	public List<Vstucls> showAll() {
		List<Vstucls> list = vstuclsMapper.selectByExample(null);
		return list;
	}

	// 根据员工ID 查询员工信息及部门（视图）
	public List<Vstucls> showEmp(int id) {
		VstuclsExample vstucls = new VstuclsExample();
		vstucls.createCriteria().andEmpidEqualTo(id);
		List<Vstucls> vstucls2 = vstuclsMapper.selectByExample(vstucls);
		return vstucls2;
	}

	// 查询所有部门信息
	public List<TblDept> getDeptsAll() {
		List<TblDept> tblDepts = tblDeptMapper.selectByExample(null);
		return tblDepts;
	}

	// 根据员工ID 查询员工信息及部门
	public TblEmp getEmp(int id) {
		TblEmp tblEmp = tblEmpMapper.selectByPrimaryKey(id);
		return tblEmp;
	}

	// 修改员工信息
	public int upd(TblEmp tblEmp) {
		return tblEmpMapper.updateByPrimaryKey(tblEmp);
	}

	// 删除员工
	public int del(int id) {
		return tblEmpMapper.deleteByPrimaryKey(id);
	}

	// 添加员工
	public int add(TblEmp tblEmp) {
		return tblEmpMapper.insert(tblEmp);
	}

}
