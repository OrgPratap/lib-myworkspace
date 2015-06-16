package org.gtpl.pratap.employee;

public class Employee 
{
	private int empId;
	private String empName;
	private int empAge;
	private float empSalary;
	
	public Employee()
	{
		super();
	}
	
	public Employee(int empId,String empName,int empAge,float empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empAge=empAge;
		this.empSalary=empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empAge=" + empAge + ", empSalary=" + empSalary + "]";
	}
	
	
	
	
}
