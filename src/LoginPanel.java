import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginPanel extends JPanel{
	JPanel contentPane;
	LoginPanel(JPanel adminPanel){
		setBounds(500,100,400,400);
		setLayout(null);
		setBackground(new Color(0,0,0,120));
		this.setBorder(BorderFactory.createLineBorder(Color.cyan, 2, true));
		JLabel admin=new JLabel();
		ImageIcon imc=new ImageIcon("admin.png");
		ImageIcon icon=new ImageIcon(imc.getImage().getScaledInstance(120, 100,Image.SCALE_DEFAULT));
		admin.setIcon(icon);
		admin.setBounds(150, 30, 120, 100);
		
		JLabel adminAnno=new JLabel("ADMIN LOGIN");
		adminAnno.setBounds(150, 140, 150, 40);
		adminAnno.setFont(new Font("Verdana",Font.BOLD,15));
		adminAnno.setForeground(Color.cyan);
		JLabel username=new JLabel("Username".toUpperCase());
		username.setBounds(20, 200,150, 40);
		username.setFont(new Font("Verdana",Font.BOLD,20));
		username.setForeground(Color.cyan);
		JTextField userText=new JTextField();
		userText.setBounds(170,200,200, 40);
		userText.setFont(new Font("Arial",Font.PLAIN,20));
		
		JLabel passText=new JLabel("Password".toUpperCase());
		passText.setBounds(20, 270, 150, 40);
		passText.setFont(new Font("Verdana",Font.BOLD,20));
		passText.setForeground(Color.cyan);
		
		JPasswordField passField=new JPasswordField();
		passField.setBounds(170, 270,200, 40);
		passField.setFont(new Font("Arial",Font.PLAIN,20));
		
		JButton login=new JButton("LOGIN");
		login.setBounds(150, 340, 90, 40);
		login.setBackground(Color.RED);
		login.setForeground(Color.WHITE);
		add(username);
		add(userText);
		add(passText);
		add(passField);
		add(login);
		add(admin);
		add(adminAnno);
		login.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				login.setBackground(Color.red);
				login.setForeground(Color.white);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				login.setBackground(Color.white);
				login.setForeground(Color.red);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				login.setBackground(Color.red);
				login.setForeground(Color.white);
			}
			
		});
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(userText.getText().isEmpty()||passField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(login, "user or password empty");
					return;
				}
				if(userText.getText().equals("admin")&&passField.getText().equals("admin123")) {
					setVisible(false);
					adminPanel.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(login, "User or Password wrong");
					return;
				}
				
			}
			
		});
	}
}
