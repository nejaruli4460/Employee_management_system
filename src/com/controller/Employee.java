package com.controller;

import java.util.ArrayList;

public class Employee {
	String empId;
	String name;
	String des;
	String deptId;
	float salary;
	static ArrayList<Employee> list=new ArrayList();
	public Employee(String empId, String name, String des, String deptId, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.des = des;
		this.deptId = deptId;
		this.salary = salary;
	}
	public Employee() {
		this.empId = null;
		this.name = null;
		this.des = null;
		this.deptId = null;
		this.salary = 0;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public static void setArray(Employee emp) {
		list.add(emp);
	}
	public static ArrayList<Employee> getArray() {
		return list;
	}
	public static int totalEmployee() {
		return list.size();
	}
	public static int totalEmployeeSub(String did) {
		int sum=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).deptId.equals(did)) {
				sum++;
			}
		}
		return sum;
	}
	public static float totalEmployeeSalary() {
		float salary=0;
		for(int i=0;i<list.size();i++) {
			salary+=list.get(i).salary;
		}
		return salary;
	}
	public static float totalEmployeeSalaryByDepartment(String did) {
		float sum=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).deptId.equals(did)) {
				sum+=list.get(i).salary;
			}
		}
		return sum;
	}
	public static ArrayList<String> totalDetailsByDepartment(String did) {
		ArrayList<String> subList=new ArrayList<String>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).deptId.equals(did)) {
				subList.add(list.get(i).name);
			}
		}
		return subList;
	}

	
}
