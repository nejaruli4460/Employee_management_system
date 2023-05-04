package com.admin;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.controller.Employee;
import com.controller.Project;
public class AdminCRUD extends JPanel {
		String list[]=new String[100];
		public static DefaultTableModel model;
		JTable table;
		JTextField empName;
		com.controller.Employee e=null;
		public AdminCRUD(){
			setLayout(null);
			setBorder(BorderFactory.createLineBorder(Color.cyan));
			setBounds(30,0,1280,700);
			setBackground(new Color(255,255,255,40));
			JPanel panelL=panelLeft();
			this.add(panelL);
			JPanel panelR=panelRight();
			this.add(panelR);
		}
		JPanel panelLeft() {
			JPanel panel=new JPanel();
			panel.setLayout(null);
			panel.setBounds(10,10,640,680);
			panel.setBorder(BorderFactory.createLineBorder(Color.black));
			
			JLabel operationAnno=new JLabel("Operation on ?");
			operationAnno.setBounds(20,20,100,20);
			
			String arr[]= {"Employee","Department","Project"};
			JComboBox combo=new JComboBox(arr);
			combo.setBounds(120,20,240,20);
			JButton submit=new JButton("SELECT");
			submit.setBounds(370, 20, 80,20);
			this.list[0]="name";
			JPanel emp=EmployeeSection();
			panel.add(emp);
			emp.setVisible(true);
			
			com.model.DepartmentGUI department=new com.model.DepartmentGUI();
			panel.add(department);
			department.setVisible(false);
			
			JPanel project=projectSection();
			panel.add(project);
			project.setVisible(false);
			
			panel.add(combo);
			panel.add(operationAnno);
			panel.add(submit);
			
			submit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(combo.getSelectedItem().toString().equals("Employee")) {
						emp.setVisible(true);
						department.setVisible(false);
						project.setVisible(false);
					}else if(combo.getSelectedItem().toString().equals("Department")) {
						emp.setVisible(false);
						department.setVisible(true);
						project.setVisible(false);
					}else {
						emp.setVisible(false);
						department.setVisible(false);
						project.setVisible(true);
					}
					
				}
				
			});
			return panel;
			
		}
		JPanel EmployeeSection() {
			
			JPanel panel=new JPanel();
			panel.setLayout(null);
			panel.setBounds(20,80,600,550);
			panel.setBorder(BorderFactory.createLineBorder(Color.red));
			JLabel empLabel=new JLabel("Employee name");
			empLabel.setBounds(20, 20, 100, 40);
			panel.add(empLabel);
			empName=new JTextField();
			
			System.out.println(empName.getText());
			empName.setBounds(120, 20, 250, 40);
			panel.add(empName);
			//Above code for employee name
			JLabel empIdLabel=new JLabel("Employee Id");
			empIdLabel.setBounds(20, 80, 100, 40);
			JTextField empId=new JTextField();
			empId.setBounds(120,80,250,40);
			panel.add(empId);
			panel.add(empIdLabel);
			
			//above for employee id
			
			JLabel desLabel=new JLabel("Designation");
			desLabel.setBounds(20, 140, 100, 40);
			JTextField des=new JTextField();
			des.setBounds(120, 140, 250, 40);
			panel.add(desLabel);panel.add(des);
			
			//above for designation
			JLabel deptIdLabel=new JLabel("Department ID");
			deptIdLabel.setBounds(20, 200, 100, 40);
			JTextField deptId=new JTextField();
			deptId.setBounds(120, 200, 250, 40);
			panel.add(deptIdLabel);panel.add(deptId);
			
			//above code for department
			
			JLabel salaryLabel=new JLabel("Salary");
			salaryLabel.setBounds(20, 260, 100, 40);
			
			JTextField salary=new JTextField();
			salary.setBounds(120, 260, 250, 40);
			
			panel.add(salaryLabel);panel.add(salary);
			
			//above code for salary
			
			JButton btn=new JButton("INSERT");
			btn.setBounds(150, 320, 90, 40);
			btn.setBackground(Color.RED);
			btn.setForeground(Color.WHITE);
			panel.add(btn);
			
			btn.addActionListener( new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent es) {
				
						com.controller.Employee emp=new com.controller.Employee(empId.getText(), empName.getText(), des.getText(), deptId.getText(),Float.parseFloat(salary.getText()) );
						com.controller.Employee.setArray(emp);
						
						JOptionPane.showMessageDialog(null, "submitted successfull");
						model.setRowCount(0);
					displayEmployee("Employee",model);
					empName.setText("");
					empId.setText("");
					des.setText("");
					deptId.setText("");
					salary.setText("");
					
				}
				
			});
			return panel;
		}
		
		JPanel projectSection() {
			JPanel panel=new JPanel();
			panel.setLayout(null);
			panel.setBounds(20,80,600,550);
			panel.setBorder(BorderFactory.createLineBorder(Color.red));
			JLabel pLabel=new JLabel("Project name");
			pLabel.setBounds(20, 20, 100, 40);
			panel.add(pLabel);
			JTextField pName=new JTextField();
			
			pName.setBounds(120, 20, 250, 40);
			panel.add(pName);
			//Above code for employee name
			JLabel pIdLabel=new JLabel("Project Id");
			pIdLabel.setBounds(20, 80, 100, 40);
			JTextField pId=new JTextField();
			pId.setBounds(120,80,250,40);
			panel.add(pId);
			panel.add(pIdLabel);
			
			//above for employee id
			
			JLabel manLabel=new JLabel("Manager");
			manLabel.setBounds(20, 140, 100, 40);
			JTextField manager=new JTextField();
			manager.setBounds(120, 140, 250, 40);
			panel.add(manLabel);panel.add(manager);
			
			//above for designation
			JLabel deptIdLabel=new JLabel("Department ID");
			deptIdLabel.setBounds(20, 200, 100, 40);
			JTextField deptId=new JTextField();
			deptId.setBounds(120, 200, 250, 40);
			panel.add(deptIdLabel);panel.add(deptId);
			
			//above code for department
			
			//above code for salary
			
			JButton btn=new JButton("INSERT");
			btn.setBounds(150, 320, 90, 40);
			btn.setBackground(Color.RED);
			btn.setForeground(Color.WHITE);
			panel.add(btn);
			
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					com.controller.Project pro=new com.controller.Project(pId.getText(),pName.getText(),deptId.getText(),manager.getText());
					com.controller.Project.setArray(pro);
					model.setRowCount(0);
					displayEmployee("Project",model);
					JOptionPane.showMessageDialog(null, "submitted successfull");
					pId.setText("");
					pName.setText("");
					deptId.setText("");
					manager.setText("");
				}
				
			});
			return panel;
			

		}
		
		JPanel panelRight(){
			JPanel panel=new JPanel();
			panel.setBounds(650,10,600,680);
			panel.setBorder(BorderFactory.createLineBorder(Color.black));
			panel.setLayout(null);
			JLabel operationAnno=new JLabel("View on ?");
			operationAnno.setBounds(20,20,100,20);
			
			String arr[]= {"Employee","Department","Project"};
			JComboBox combo=new JComboBox(arr);
			combo.setBounds(120,20,100,20);
			JButton submit=new JButton("VIEW");
			submit.setBounds(270, 20, 80,20);
			JButton delete=new JButton("DELETE");
			delete.setBounds(360, 20, 80, 20);
			
			JButton update=new JButton("Update");
			update.setBounds(450, 20, 80, 20);
			panel.add(combo);
			panel.add(operationAnno);
			panel.add(submit);
			panel.add(delete);
			panel.add(update);
			table=new JTable();
			model=(DefaultTableModel) table.getModel();
			table.getTableHeader().setBackground(SystemColor.activeCaption);
			table.setRowHeight(40);
			JScrollPane scroll=new JScrollPane(table);
			scroll.setBounds(20, 60, 570, 500);
			panel.add(scroll);
			JLabel reportAnno=new JLabel("Project Report");
			reportAnno.setBounds(20, 560, 200, 40);
			reportAnno.setFont(new Font("Arial",Font.BOLD,20));
			panel.add(reportAnno);
			
	com.model.ProjectReport report=new com.model.ProjectReport();
			
			panel.add(report);
			
			displayEmployee("Employee",model);
			submit.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					model.setRowCount(0);
					displayEmployee(combo.getSelectedItem().toString(),model);
				}
			});
			/*com.controller.Employee emp=new com.controller.Employee("01","Nejarul","CEO","d01",2000.05);
			com.controller.Employee.setArray(emp);
			
		
			
			com.controller.Project pro=new com.controller.Project("p01", "syssoft", "web developer", "Nejarul");
			com.controller.Project.setArray(pro);*/
			
			
			//above testimonial
						
			delete.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					   if(table.getSelectedRow()==-1) {
						   	JOptionPane.showMessageDialog(null, "Please select a row");
					   }else if(combo.getSelectedItem().toString().equals("Employee")) {
							com.controller.Employee.getArray().remove(table.getSelectedRow());
							model.setRowCount(0);
							displayEmployee(combo.getSelectedItem().toString(),model);
						}
						else if(combo.getSelectedItem().toString().equals("Department")) {
							com.controller.Department.getArray().remove(table.getSelectedRow());
							model.setRowCount(0);
							displayEmployee(combo.getSelectedItem().toString(),model);
						}else {
							com.controller.Project.getArray().remove(table.getSelectedRow());
							model.setRowCount(0);
							displayEmployee(combo.getSelectedItem().toString(),model);
						}
						
			    
				}
				
			});
			
			update.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					//model.setRowCount(0);
					//displayEmployee(combo.getSelectedItem().toString(),model);
					if(table.getSelectedRow()==-1) {
						JOptionPane.showMessageDialog(null, "Please select a cell for update");
					}
					else if(combo.getSelectedItem().toString().equals("Employee")) {
						Employee emp=com.controller.Employee.getArray().get(table.getSelectedRow());
						switch(table.getSelectedColumn()) {
						case 0:
							String str=JOptionPane.showInputDialog("Enter Updated name");
							if(str!=null) {
								emp.setName(str);
							}
							break;
						case 1:
							str=JOptionPane.showInputDialog("Enter Updated Employee ID");
							if(str!=null) {
								emp.setEmpId(str);
							}
							
							break;
						case 2:
							str=JOptionPane.showInputDialog("Enter Updated Designation");
							if(str!=null) {
								emp.setDes(str);
							}
							
							break;
						case 3:
							str=JOptionPane.showInputDialog("Enter Updated Department Id");
							if(str!=null) {
								emp.setDeptId(str);
							}
							
							break;
						case 4:
							str=JOptionPane.showInputDialog("Enter Updated Salary");
							if(str!=null) {
								emp.setSalary(Float.parseFloat(str));
							}
							
							break;
						}
						model.setRowCount(0);
						displayEmployee("Employee",model);
					}else if(combo.getSelectedItem().toString().equals("Department")) {
						com.controller.Department dept=com.controller.Department.getArray().get(table.getSelectedRow());
						switch(table.getSelectedColumn()) {
						case 0:
							String str=JOptionPane.showInputDialog("Enter updated Department name");
							if(str!=null)
							{
								dept.setName(str);
							}
							break;
		
						case 1:
							str=JOptionPane.showInputDialog("Enter Update Department id");
							if(str!=null) {
								dept.setDeptId(str);
							}
							
							break;
						case 2:
							str=JOptionPane.showInputDialog("Enter Update Department Address");
							if(str!=null) {
								dept.setAddress(str);
							}
							
							break;
						}
						model.setRowCount(0);
						displayEmployee("Department",model);
					}
					else {
						com.controller.Project pro=com.controller.Project.getArray().get(table.getSelectedRow());
						switch(table.getSelectedColumn()) {
						case 0:
							String str=JOptionPane.showInputDialog("Enter Updated Project Name");
							if(str!=null) {
								pro.setName(str);
							}
							
							break;
						case 1:
							str=JOptionPane.showInputDialog("Enter Updated Project Id");
							if(str!=null) {
								pro.setPid(str);
							}
						
							break;
						
						case 2:
							str=JOptionPane.showInputDialog("Enter Updated Department Id");
							if(str!=null) {
								pro.setDeptid(str);
							}
							
							break;
						case 3:
							str=JOptionPane.showInputDialog("Enter Updated Manager");
							if(str!=null) {
								pro.setLead(str);
							}
							
							break;
						}
						model.setRowCount(0);
						displayEmployee("Project",model);
					}
					
				}
				
			});
			return panel;
			
		}

		public static void displayEmployee(String str,DefaultTableModel model) {
			
					if(str.equals("Employee")) {
						String []head= {"Employee name","Employee ID","Designation","Department ID","Salary"};
						model.setColumnIdentifiers(head);
						ArrayList<com.controller.Employee> list=com.controller.Employee.getArray();
						int len=list.size();
						for(int i=0;i<len;i++) {
							ArrayList list1=new ArrayList();
							list1.add(list.get(i).getName());
							list1.add(list.get(i).getEmpId());
							list1.add(list.get(i).getDes());
							list1.add(list.get(i).getDeptId());
							list1.add(list.get(i).getSalary());
							model.addRow(list1.toArray());
						}
						
					}else if(str.equals("Department")) {
						String []head= {"Department name","Department ID","Address"};
						model.setColumnIdentifiers(head);
						ArrayList<com.controller.Department> list=com.controller.Department.getArray();
						int len=list.size();
						System.out.println(len);
						for(int i=0;i<len;i++) {
							ArrayList list1=new ArrayList();
							list1.add(list.get(i).getName());
							list1.add(list.get(i).getDeptId());
							list1.add(list.get(i).getAddress());
							model.addRow(list1.toArray());
						}
					}else {
						String []head= {"Project name","Project Id","Department ID","Manager"};
						model.setColumnIdentifiers(head);
						ArrayList<com.controller.Project> list=com.controller.Project.getArray();
						int len=list.size();
						for(int i=0;i<len;i++) {
							ArrayList list1=new ArrayList();
							list1.add(list.get(i).getName());
							list1.add(list.get(i).getPid());
							list1.add(list.get(i).getDeptid());
							list1.add(list.get(i).getLead());
							model.addRow(list1.toArray());
						}
					}
					
			

		}
}
