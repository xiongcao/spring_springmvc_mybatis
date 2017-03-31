package com.smm.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smm.entity.TblDept;
import com.smm.entity.TblEmp;
import com.smm.entity.Vstucls;
import com.smm.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentAction {
	@Autowired
	StudentService studentService;

	// 查询视图 所有学生信息
	@RequestMapping(value = "/showAll")
	public String showAll(HttpServletRequest request) {
		List<Vstucls> list = studentService.showAll();
		request.setAttribute("list", list);
		return "/list.jsp";
	}

	// 根据员工ID 查询单个员工信息（视图） 显示员工信息
	@RequestMapping(value = "/showEmp")
	public String showEmp(@RequestParam("id") int id, HttpServletRequest request) {
		List<Vstucls> list = studentService.showEmp(id);
		request.setAttribute("list", list);
		return "/showEmp.jsp";
	}

	// 查询所有部门信息
	@RequestMapping(value = "/getDeptsAll")
	public String getDeptsAll(HttpServletRequest request) {
		List<TblDept> listDept = studentService.getDeptsAll();
		request.getSession().setAttribute("listDept", listDept);
		return "getEmp.form";
	}
	// 查询所有部门信息
		@RequestMapping(value = "/DeptsAll")
		public String DeptsAll(HttpServletRequest request) {
			List<TblDept> listDept1 = studentService.getDeptsAll();
			request.getSession().setAttribute("listDept1", listDept1);
			return "/add.jsp";
		}
	// 回显 根据员工ID 查询单个员工信息（视图） 显示员工信息
	@RequestMapping(value = "/getEmp")
	public String getEmp(@RequestParam("id") int id, HttpServletRequest request) {
		TblEmp tblEmp = studentService.getEmp(id);
		request.setAttribute("tblEmp", tblEmp);
		return "/upd.jsp";
	}
	// 修改员工信息
	@RequestMapping(value = "/upd")
	public String upd(@ModelAttribute("tblEmp") TblEmp tblEmp){
		studentService.upd(tblEmp);
		return "showAll.form";
	}
	//删除员工
	@RequestMapping(value = "/del")
	public String del(@RequestParam("did") int did){
		studentService.del(did);
		return "showAll.form";
	}
	//添加员工
	@RequestMapping(value = "/add")
	public String add(@ModelAttribute("tblEmp") TblEmp tblEmp){
		studentService.add(tblEmp);
		return "showAll.form";
	}
}
