package org.gtpl.pratap.jdbcproject;

import java.util.ArrayList;
import java.util.Iterator;

import org.gtpl.pratap.dao.EmployeeDAO;
import org.gtpl.pratap.employee.Employee;

public class EmployeeMainClass 
{
	public static void main(String[] args) 
	{
		Employee emp1=new Employee(101,"Satendra",23,20000);
		Employee emp2=new Employee(102,"Akash",23,32000);
		Employee emp3=new Employee(103,"Saurabh",24,35000);
		Employee emp4=new Employee(104,"Utkarsh",24,30000);
		
		
		EmployeeDAO empDaoObj=new EmployeeDAO();
		
		empDaoObj.addEmployee(emp1);
		empDaoObj.addEmployee(emp2);
		empDaoObj.addEmployeePS(emp3);
		empDaoObj.addEmployeePS(emp4);
	
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		employeeList=empDaoObj.getAllEmployee();
		   
		for(Employee emp:employeeList)
		{
			System.out.println(emp);
		}
		
		Employee empTemp=empDaoObj.getEmployee(103);
		System.out.println(empTemp);
	}

}
