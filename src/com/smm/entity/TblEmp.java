package com.smm.entity;

public class TblEmp {
    private Integer empid;

    private String ename;

    private String egendar;

    private Integer depid;

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEgendar() {
        return egendar;
    }

    public void setEgendar(String egendar) {
        this.egendar = egendar == null ? null : egendar.trim();
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }
}