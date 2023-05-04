package com.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ProjectReport extends JPanel implements ActionListener{
			
			public ProjectReport(){
				setBorder(BorderFactory.createLineBorder(Color.cyan));
				setBounds(20, 600, 570, 40);
				setLayout(null);
				JButton empTotal=new JButton("Total Employee");
				empTotal.setBounds(0, 0, 100, 40);
				empTotal.setFont(new Font("Arial",Font.PLAIN,8));
				empTotal.addActionListener(this);
				add(empTotal);
				
				JButton empSalary=new JButton("Total Salary");
				empSalary.setBounds(110,0,100,40);
				empSalary.setFont(new Font("Arial",Font.PLAIN,8));
				empSalary.addActionListener(this);
				add(empSalary);
				
				JButton totalProject=new JButton("Total Project");
				totalProject.setBounds(220, 0, 100, 40);
				totalProject.setFont(new Font("Arial",Font.PLAIN,8));
				totalProject.addActionListener(this);
				add(totalProject);
				
				JButton detailsEmployee=new JButton("Details Employee");
				detailsEmployee.setBounds(340, 0, 100, 40);
				detailsEmployee.setFont(new Font("Arial",Font.PLAIN,8));
				detailsEmployee.addActionListener(this);
				add(detailsEmployee);
				
				JButton detailsProject=new JButton("Details Project");
				detailsProject.setBounds(460, 0, 100, 40);
				detailsProject.setFont(new Font("Arial",Font.PLAIN,8));
				detailsProject.addActionListener(this);
				add(detailsProject);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				ReportGenerator rg=new ReportGenerator(e.getActionCommand());
				rg.setVisible(true);
				
			}
}
