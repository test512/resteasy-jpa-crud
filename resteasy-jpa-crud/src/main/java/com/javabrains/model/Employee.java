package com.javabrains.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="Employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer empno;
	private String ename;

	public Employee() {
	}

	public Employee(Integer empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}
