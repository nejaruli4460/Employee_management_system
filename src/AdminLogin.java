import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.controller.Department;
import com.controller.Employee;
import com.controller.Project;


public class AdminLogin extends JFrame {
	JPanel contentPane;
	public AdminLogin() {
		setBackground(Color.gray);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setBounds(0,0,1000,700);
		initComponents();
	}
	private void initComponents() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.gray);
		contentPane.setLayout(null);
		JLabel label=new JLabel();
		ImageIcon imc=new ImageIcon("Global.jpg");
		label.setBounds(0,0,1700,900);
		ImageIcon icon=new ImageIcon(imc.getImage().getScaledInstance(1700, 900,Image.SCALE_DEFAULT));
		label.setIcon(icon);
		contentPane.add(label);
		com.admin.AdminCRUD adminPanel=new com.admin.AdminCRUD();
		label.add(adminPanel);
		adminPanel.setVisible(false);
		LoginPanel panel=new LoginPanel(adminPanel);
		contentPane.setVisible(true);
		label.add(panel);
	}
	public static void main(String[] args) {
			AdminLogin admin=new AdminLogin();
			admin.setVisible(true);		
			com.controller.Department dept=new com.controller.Department("d01","web developer", "Kolkata");
			com.controller.Department.setArray(dept);
			com.controller.Department dept1=new com.controller.Department("d01","web developer", "Kolkata");
			com.controller.Department.setArray(dept1);
			
			com.controller.Employee emp=new com.controller.Employee("e01","nejarul","manager","d01",30000);
			com.controller.Employee.setArray(emp);
			com.controller.Employee emp1=new com.controller.Employee("e02","sumon","sub","d02",2000);
			com.controller.Employee.setArray(emp1);
			
			com.controller.Project pro=new com.controller.Project("p01","sssoft","d01","Sk sir");
			com.controller.Project.setArray(pro);
			com.controller.Project pro1=new com.controller.Project("p02","sssoft","d01","Sk sir");
			com.controller.Project.setArray(pro1);
	}
}
