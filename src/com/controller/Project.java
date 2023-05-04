package com.controller;

import java.util.ArrayList;

public class Project {
	String pid;
	String name;
	String deptid;
	String lead;
	static ArrayList<Project> list=new ArrayList();
	public Project(String pid, String name, String deptid, String lead) {
		super();
		this.pid = pid;
		this.name = name;
		this.deptid = deptid;
		this.lead = lead;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	public String getLead() {
		return lead;
	}
	public void setLead(String lead) {
		this.lead = lead;
	}
	public static void setArray(Project p) {
		list.add(p);
	}
	public static ArrayList<Project> getArray() {
		return list;
	}
	public static int totalProject() {
			return list.size();
		
	}
	public static int totalProjectByDept(String did) {
		int n=list.size();
		int m=0;
		for(int i=0;i<n;i++) {
			if(list.get(i).deptid.equals(did)) {
				m++;
			}
		}
		return m;
	}
	public static ArrayList<String> totalDetailsByDepartment(String did) {
		ArrayList<String> subList=new ArrayList<String>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).deptid.equals(did)) {
				subList.add(list.get(i).name);
			}
		}
		return subList;
	}
}
