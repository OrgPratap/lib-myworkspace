package org.gtpl.pratap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.gtpl.pratap.employee.Employee;

public class EmployeeDAO 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	public EmployeeDAO()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("+++++++DRIVER LOADED+++++++");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			System.out.println("++++++CONNECTED TO DATABASE+++++");
			con.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void addEmployee(Employee emp)
	{
		String query="insert into employee_db values("+emp.getEmpId()+",'"+emp.getEmpName()+"',"+emp.getEmpAge()+","+emp.getEmpSalary()+")";
		try {
			stmt=con.createStatement();
			stmt.executeUpdate(query);
			con.commit();
			System.out.println("1 record inserted successfully....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void addEmployeePS(Employee emp)
	{
		try {
			PreparedStatement ps=con.prepareStatement("insert into employee_db values(?,?,?,?)");
			
			ps.clearParameters();
			ps.setInt(1, emp.getEmpId());
			ps.setString(2, emp.getEmpName());
			ps.setInt(3, emp.getEmpAge());
			ps.setFloat(4, emp.getEmpSalary());
			
			ps.executeUpdate();
			con.commit();
			System.out.println("record inserted successfully..");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateEmployee(Employee emp)
	{
		String query="update employee_db set empname='"+emp.getEmpName()+"',empage="+emp.getEmpAge()+",empsalary="+emp.getEmpSalary()+"where empid="+emp.getEmpId();
		
		try {
			stmt=con.createStatement();
			stmt.executeUpdate(query);
			con.commit();
			System.out.println("Employee id :"+emp.getEmpId()+" is updated successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateEmployeePS(Employee emp)
	{
		try {
			PreparedStatement ps=con.prepareStatement("update employee_db set empname=?,empage=?,empsalary=? where empid=?");
			ps.clearParameters();
			ps.setString(1, emp.getEmpName());
			ps.setInt(2, emp.getEmpAge());
			ps.setFloat(3, emp.getEmpSalary());
			ps.setInt(4, emp.getEmpId());
			ps.executeUpdate();
			con.commit();
			System.out.println("Employee id:"+emp.getEmpId()+" is updated successfully..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteEmployee(Employee emp)
	{
		String query="delete from employee_db where empid="+emp.getEmpId();
		try {
			stmt=con.createStatement();
			stmt.executeUpdate(query);
			con.commit();
			System.out.println("EmpId :"+emp.getEmpId()+" deleted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Employee getEmployee(int empid)
	{
		Employee emp=null;
		String query="select * from employee_db where empid="+empid;
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			if(rs.next())
			{
				int eId=rs.getInt(1);
				String eName=rs.getString(2);
				int eAge=rs.getInt(3);
				float eSalary=rs.getFloat(4);
				emp=new Employee(eId, eName, eAge, eSalary);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
	
	
	public ArrayList<Employee> getAllEmployee()
	{
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		String query="select * from employee_db";
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next())
			{
				employeeList.add(new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeList;
	}
	
	public void closeConnection()
	{
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
