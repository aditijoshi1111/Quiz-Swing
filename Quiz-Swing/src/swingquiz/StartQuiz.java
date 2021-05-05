package swingquiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class StartQuiz extends JFrame implements ActionListener{
	
	JFrame main;
	JButton start,quit,help;
	StartQuiz(){
		main=new JFrame("SWING QUIZ");
		
		JLabel j=new JLabel();
		j.setText("WELCOME TO SWING QUIZ");
		main.add(j);
		j.setVerticalAlignment(JLabel.CENTER);
		j.setHorizontalAlignment(JLabel.CENTER);
		j.setFont(new Font("Algerian", 70, 40));
		
		Border border=BorderFactory.createLineBorder(Color.orange, 20);
		j.setBorder(border);
		j.setBackground(Color.yellow);
		j.setOpaque(true);
		
		help=new JButton();
		help.setText("HELP?");
		help.setFont(new Font("Arial", 70, 25));
		help.setFocusable(false);
		help.setBackground(Color.BLUE);
		help.setForeground(Color.white);
		j.add(help);
		help.setBounds(30,30,120,40);
		help.addActionListener(this);
		
		quit=new JButton();
		quit.setText("QUIT!");
		quit.setFont(new Font("Arial", 70, 25));
		quit.setFocusable(false);
		quit.setBackground(Color.RED);
		quit.setForeground(Color.white);
		j.add(quit);
		quit.setBounds(442,30,120,40);
		quit.addActionListener(this);
		
		start=new JButton();
		start.setText("START->");
		start.setFont(new Font("Arial", 70, 25));
		start.setFocusable(false);
		start.setBackground(Color.GREEN);
		start.setForeground(Color.white);
		j.add(start);
		start.setBounds(200,300,200,50);
		start.addActionListener(this);
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setResizable(false);
		//main.setLayout(null);
		//main.pack();
		main.setSize(600,500);
		main.setVisible(true);
	}
	
	public static void main(String args[]) {
		new StartQuiz();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==start)
			new Instructions();
		else if(e.getSource()==quit)
			main.dispose();
		else if(e.getSource()==help) {
			JOptionPane.showMessageDialog(null,"This is a MCQ type quiz on Java Swing. There will be 10 questions, for each question you will be provided with 4 options, of which only one is correct. You will see further instructions when you start the quiz.","HELP?",JOptionPane.INFORMATION_MESSAGE);
		}
			
	}

}
