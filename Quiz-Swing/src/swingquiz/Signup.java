package swingquiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Signup implements ActionListener{
	
	JFrame j;
	JLabel l1,l2,l3,l4;
	JTextField a1,a2,a3,a4;
	JButton help,cancel,done;
	Signup(){
		j=new JFrame("Sign Up");
		j.getContentPane().setBackground(Color.yellow);
		
		JLabel signup=new JLabel("SIGN UP");
		signup.setBounds(240,50,200,50);
		signup.setFont(new Font("Arial",70,30));
		signup.setForeground(Color.orange);
		j.add(signup);
		
		help=new JButton();
		help.setText("HELP?");
		help.setFont(new Font("Arial", 70, 25));
		help.setFocusable(false);
		help.setBackground(Color.BLUE);
		help.setForeground(Color.white);
		j.add(help);
		help.setBounds(10,10,120,40);
		help.addActionListener(this);
		
		JLabel l1=new JLabel("Roll no: ");
		JLabel l2=new JLabel("Full Name: ");
		JLabel l3=new JLabel("Section: ");
		JLabel l4=new JLabel("E-mail: ");
		
		j.add(l1);
		j.add(l2);
		j.add(l3);
		j.add(l4);
		
		l1.setBounds(200,150,100,30);
		l2.setBounds(200,200,100,30);
		l3.setBounds(200,250,100,30);
		l4.setBounds(200,300,100,30);
		
		l1.setFont(new Font("Arial",70,15));
		l2.setFont(new Font("Arial",70,15));
		l3.setFont(new Font("Arial",70,15));
		l4.setFont(new Font("Arial",70,15));
		
		a1=new JTextField();
		a2=new JTextField();
		a3=new JTextField();
		a4=new JTextField();
		
		j.add(a1);
		j.add(a2);
		j.add(a3);
		j.add(a4);
		
		a1.setBounds(300,150,100,30);
		a2.setBounds(300,200,100,30);
		a3.setBounds(300,250,100,30);
		a4.setBounds(300,300,100,30);
		
		done=new JButton("SIGN UP");
		j.add(done);
		done.setBounds(200,350,100,30);
		done.addActionListener(this);
		
		cancel=new JButton("CANCEL");
		j.add(cancel);
		cancel.setBounds(300,350,100,30);
		cancel.addActionListener(this);
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(600,500);
		j.setLayout(null);
		j.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Signup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==done)
			new Instructions();
		else if(e.getSource()==cancel)
			j.dispose();
		else if(e.getSource()==help)
			JOptionPane.showMessageDialog(null,"This is the Sign Up form. Kindly enter university Roll_no, Full name, Section(eg. E-01) and college e-mail id.","HELP?",JOptionPane.INFORMATION_MESSAGE);

	}

}
