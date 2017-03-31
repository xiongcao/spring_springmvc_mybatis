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

	// ��ѯ��ͼ ����ѧ����Ϣ
	@RequestMapping(value = "/showAll")
	public String showAll(HttpServletRequest request) {
		List<Vstucls> list = studentService.showAll();
		request.setAttribute("list", list);
		return "/list.jsp";
	}

	// ����Ա��ID ��ѯ����Ա����Ϣ����ͼ�� ��ʾԱ����Ϣ
	@RequestMapping(value = "/showEmp")
	public String showEmp(@RequestParam("id") int id, HttpServletRequest request) {
		List<Vstucls> list = studentService.showEmp(id);
		request.setAttribute("list", list);
		return "/showEmp.jsp";
	}

	// ��ѯ���в�����Ϣ
	@RequestMapping(value = "/getDeptsAll")
	public String getDeptsAll(HttpServletRequest request) {
		List<TblDept> listDept = studentService.getDeptsAll();
		request.getSession().setAttribute("listDept", listDept);
		return "getEmp.form";
	}
	// ��ѯ���в�����Ϣ
		@RequestMapping(value = "/DeptsAll")
		public String DeptsAll(HttpServletRequest request) {
			List<TblDept> listDept1 = studentService.getDeptsAll();
			request.getSession().setAttribute("listDept1", listDept1);
			return "/add.jsp";
		}
	// ���� ����Ա��ID ��ѯ����Ա����Ϣ����ͼ�� ��ʾԱ����Ϣ
	@RequestMapping(value = "/getEmp")
	public String getEmp(@RequestParam("id") int id, HttpServletRequest request) {
		TblEmp tblEmp = studentService.getEmp(id);
		request.setAttribute("tblEmp", tblEmp);
		return "/upd.jsp";
	}
	// �޸�Ա����Ϣ
	@RequestMapping(value = "/upd")
	public String upd(@ModelAttribute("tblEmp") TblEmp tblEmp){
		studentService.upd(tblEmp);
		return "showAll.form";
	}
	//ɾ��Ա��
	@RequestMapping(value = "/del")
	public String del(@RequestParam("did") int did){
		studentService.del(did);
		return "showAll.form";
	}
	//���Ա��
	@RequestMapping(value = "/add")
	public String add(@ModelAttribute("tblEmp") TblEmp tblEmp){
		studentService.add(tblEmp);
		return "showAll.form";
	}
}
