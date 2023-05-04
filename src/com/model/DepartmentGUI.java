package com.model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.controller.Department;


public class DepartmentGUI extends JPanel {
		public DepartmentGUI(){
			setLayout(null);
			setBounds(20,80,600,550);
			setBorder(BorderFactory.createLineBorder(Color.red));
			JLabel depLabel=new JLabel("Department name");
			depLabel.setBounds(20, 20, 120, 40);
			add(depLabel);
			
			JTextField depName=new JTextField();
			depName.setBounds(120,20,250,40);
			add(depName);
			
			JLabel depIdLabel=new JLabel("Department Id");
			depIdLabel.setBounds(20, 80, 100, 40);
			add(depIdLabel);
			
			JTextField depId=new JTextField();
			depId.setBounds(120,80,250,40);
			add(depId);
			
			JLabel addLabel=new JLabel("Address");
			addLabel.setBounds(20, 140, 100, 40);
			JTextField address=new JTextField();
			address.setBounds(120, 140, 250, 40);
			add(addLabel);add(address);
			
			JButton btn=new JButton("Create");
			btn.setBounds(120, 200,90, 40);
			btn.setBackground(Color.RED);
			btn.setForeground(Color.WHITE);
			add(btn);
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					com.controller.Department dept=new com.controller.Department(depId.getText(),depName.getText(),address.getText());
					com.controller.Department.setArray(dept);;
					com.admin.AdminCRUD.model.setRowCount(0);
					com.admin.AdminCRUD.displayEmployee("Department",com.admin.AdminCRUD.model);
					JOptionPane.showMessageDialog(null, "submitted successfull");
					depId.setText("");
					depName.setText("");
					address.setText("");
				}
				
			});
			
		}
}
