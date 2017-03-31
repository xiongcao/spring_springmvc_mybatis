package com.smm.entity;

public class Vstucls {
    private String egendar;

    private String ename;

    private Integer empid;

    private Integer deptid;

    private String dname;

    public String getEgendar() {
        return egendar;
    }

    public void setEgendar(String egendar) {
        this.egendar = egendar == null ? null : egendar.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }
}