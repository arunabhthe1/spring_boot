package com.springdbmysql.springmysqldemo.model;


import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private Long empId;
	@Column(name="first_name")
	private String empName;
	//@Column(name="phone_no")
	private String phoneNo;
	//@Column(name="email")
	private String email;
	@Column(name="salary")
	private Long sal;
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getSal() {
		return sal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", sal=" + sal + "]";
	}
	public void setSal(Long sal) {
		this.sal = sal;
	}
}
