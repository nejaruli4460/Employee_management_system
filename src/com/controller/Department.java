package com.controller;

import java.util.ArrayList;

public class Department {
	String deptId;
	String name;
	String address;
	public static ArrayList<Department> list=new ArrayList();
	public Department(String deptId, String name, String address) {
		super();
		this.deptId = deptId;
		this.name = name;
		this.address = address;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static void setArray(Department dpt) {
		list.add(dpt);
	}
	public static ArrayList<Department> getArray() {
		return list;
	}
}
