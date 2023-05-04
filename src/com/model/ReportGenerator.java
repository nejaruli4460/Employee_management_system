package com.model;

import javax.swing.JDialog;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.*;

public class ReportGenerator extends JDialog{
		public ReportGenerator(String n) {
			this.setBounds(500, 100, 400, 600);
			if(n.equals("Total Employee")) {
				JPanel panel=totalEmployee();
				add(panel);
				panel.setVisible(true);
			}else if(n.equals("Total Salary")) {
				JPanel panel2=totalSalary();
				add(panel2);
				panel2.setVisible(true);
			}else if(n.equals("Total Project")) {
				JPanel panel=totalProject();
				add(panel);
				panel.setVisible(true);
			}else if(n.equals("Details Employee")) {
				JPanel panel=totalEmployeeDetails();
				add(panel);
				panel.setVisible(true);
			}else {
				JPanel panel=totalProjectDetails();
				add(panel);
				panel.setVisible(true);
			}
		}
		JPanel totalEmployee() {
			JPanel panel=new JPanel();
			panel.setLayout(null);
			JLabel l1=new JLabel("Total No Of Employee");
			l1.setBounds(0,0,300,30);
			l1.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,20));
			panel.add(l1);
			
			JLabel l2=new JLabel(":"+com.controller.Employee.totalEmployee());
			l2.setBounds(200,0,200,30);
			panel.add(l2);
			l2.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,20));
			JLabel l3=new JLabel("select department ->");
			l3.setBounds(15, 60, 150, 30);
			panel.add(l3);
			
			int n=com.controller.Employee.getArray().size();
			Set<String> data=new LinkedHashSet();
			for(int i=0;i<n;i++) {
				data.add(com.controller.Employee.getArray().get(i).getDeptId());
			}
			
			JComboBox combo=new JComboBox(data.toArray());
			combo.setBounds(165, 60, 200, 30);
			panel.add(combo);
			
			JButton btn=new JButton("GENERATE");
			btn.setBounds(140, 100,120, 30);
			panel.add(btn);
			
			JLabel l4=new JLabel("Total Employee under this department");
			l4.setBounds(30, 140, 400, 30);
			l4.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,20));
			panel.add(l4);
			
			JLabel l5=new JLabel("click on generate");
			l5.setBounds(30, 180, 400, 30);
			l5.setFont(new Font("Arial",Font.CENTER_BASELINE,20));
			panel.add(l5);
			
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					l5.setText(""+com.controller.Employee.totalEmployeeSub(combo.getSelectedItem().toString()));
					
				}
				
			});
			
			return panel;
			
		}
		JPanel totalSalary() {
			JPanel panel=new JPanel();
			panel.setLayout(null);
			JLabel l1=new JLabel("Total Salary Of Employee");
			l1.setBounds(0,0,300,30);
			l1.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,20));
			panel.add(l1);
			
			JLabel l2=new JLabel(":"+com.controller.Employee.totalEmployeeSalary());
			l2.setBounds(200,40,200,30);
			panel.add(l2);
			l2.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,20));
			JLabel l3=new JLabel("select department ->");
			l3.setBounds(15, 100, 150, 30);
			panel.add(l3);
			
			int n=com.controller.Employee.getArray().size();
			Set<String> data=new LinkedHashSet();
			for(int i=0;i<n;i++) {
				data.add(com.controller.Employee.getArray().get(i).getDeptId());
			}
			
			JComboBox combo=new JComboBox(data.toArray());
			combo.setBounds(165, 140, 200, 30);
			panel.add(combo);
			
			JButton btn=new JButton("GENERATE");
			btn.setBounds(140, 180,120, 30);
			panel.add(btn);
			
			JLabel l4=new JLabel("Total Employee Salary under this department");
			l4.setBounds(30, 220, 400, 30);
			l4.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,20));
			panel.add(l4);
			
			JLabel l5=new JLabel("click on generate");
			l5.setBounds(30, 260, 400, 30);
			l5.setFont(new Font("Arial",Font.CENTER_BASELINE,20));
			panel.add(l5);
			
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					l5.setText(""+com.controller.Employee.totalEmployeeSalaryByDepartment(combo.getSelectedItem().toString()));
					
				}
				
			});
			
			return panel;
			

		}
		JPanel totalProject() {
			JPanel panel=new JPanel();
			panel.setLayout(null);
			JLabel l1=new JLabel("Total Project");
			l1.setBounds(0,0,300,30);
			l1.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,20));
			panel.add(l1);
			
			JLabel l2=new JLabel(":"+com.controller.Project.totalProject());
			l2.setBounds(200,40,200,30);
			panel.add(l2);
			l2.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,20));
			JLabel l3=new JLabel("select department ->");
			l3.setBounds(15, 100, 150, 30);
			panel.add(l3);
			
			int n=com.controller.Project.getArray().size();
			Set<String> data=new LinkedHashSet();
			for(int i=0;i<n;i++) {
				data.add(com.controller.Project.getArray().get(i).getDeptid());
			}
			
			JComboBox combo=new JComboBox(data.toArray());
			combo.setBounds(165, 140, 200, 30);
			panel.add(combo);
			
			JButton btn=new JButton("GENERATE");
			btn.setBounds(140, 180,120, 30);
			panel.add(btn);
			
			JLabel l4=new JLabel("Total Project under this department");
			l4.setBounds(30, 220, 400, 30);
			l4.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,20));
			panel.add(l4);
			
			JLabel l5=new JLabel("click on generate");
			l5.setBounds(30, 260, 400, 30);
			l5.setFont(new Font("Arial",Font.CENTER_BASELINE,20));
			panel.add(l5);
			
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					l5.setText(""+com.controller.Project.totalProjectByDept(combo.getSelectedItem().toString()));
					
				}
				
			});
			
			return panel;
			

		}
		JPanel totalEmployeeDetails() {
			JPanel panel=new JPanel();
			panel.setLayout(null);
			JLabel l3=new JLabel("select department ->");
			l3.setBounds(15, 60, 150, 30);
			panel.add(l3);
			
			int n=com.controller.Employee.getArray().size();
			Set<String> data=new LinkedHashSet();
			for(int i=0;i<n;i++) {
				data.add(com.controller.Employee.getArray().get(i).getDeptId());
			}
			
			JComboBox combo=new JComboBox(data.toArray());
			combo.setBounds(165, 60, 200, 30);
			panel.add(combo);
			
			JButton btn=new JButton("GENERATE");
			btn.setBounds(140, 100,120, 30);
			panel.add(btn);
			JTextArea ta=new JTextArea("Click above to generate list");
			ta.disable();
			ta.setFont(new Font("Arial",Font.BOLD,15));
			ta.setForeground(Color.green);
			JScrollPane sp=new JScrollPane(ta);
			sp.setBounds(60, 150,300, 200);
			panel.add(sp);
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					ta.setText("");
					ArrayList<String> l=com.controller.Employee.totalDetailsByDepartment(combo.getSelectedItem().toString());
					for(int i=0;i<l.size();i++) {
						ta.setText(ta.getText()+l.get(i)+"\n_______________________________________\n");
					}
				}
				
			});
			
			return panel;

		}
		JPanel totalProjectDetails() {
			JPanel panel=new JPanel();
			panel.setLayout(null);
			JLabel l3=new JLabel("select department ->");
			l3.setBounds(15, 60, 150, 30);
			panel.add(l3);
			
			int n=com.controller.Project.getArray().size();
			Set<String> data=new LinkedHashSet();
			for(int i=0;i<n;i++) {
				data.add(com.controller.Project.getArray().get(i).getDeptid());
			}
			
			JComboBox combo=new JComboBox(data.toArray());
			combo.setBounds(165, 60, 200, 30);
			panel.add(combo);
			
			JButton btn=new JButton("GENERATE");
			btn.setBounds(140, 100,120, 30);
			panel.add(btn);
			JTextArea ta=new JTextArea("Click above to generate list");
			ta.disable();
			ta.setFont(new Font("Arial",Font.BOLD,15));
			ta.setForeground(Color.green);
			JScrollPane sp=new JScrollPane(ta);
			sp.setBounds(60, 150,300, 200);
			panel.add(sp);
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					ta.setText("");
					ArrayList<String> l=com.controller.Project.totalDetailsByDepartment(combo.getSelectedItem().toString());
					for(int i=0;i<l.size();i++) {
						ta.setText(ta.getText()+l.get(i)+"\n_______________________________________\n");
					}
				}
				
			});
			
			return panel;

		}


}
