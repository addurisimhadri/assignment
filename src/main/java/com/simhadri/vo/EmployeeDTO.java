package com.simhadri.vo;

public class EmployeeDTO {
	
	private long empId;
	private String eName;
	private String hireDate;
	private double sal;
	private long deptId;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", eName=" + eName + ", hireDate=" + hireDate + ", sal=" + sal
				+ ", deptId=" + deptId + "]";
	}
	
	
	

}
