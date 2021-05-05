package swingquiz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Instructions implements ActionListener{

	JFrame i;
	JButton proceed;
	JProgressBar pbar;
	Instructions(){
		i=new JFrame();
		
		JLabel ins=new JLabel("INSTRUCTIONS");
		i.add(ins);
		ins.setBounds(30,30,300,30);
		ins.setFont(new Font("Arial", 70, 30));
		
		JLabel j1=new JLabel("1. All questions are compulsory.");
		JLabel j2=new JLabel("2. Each question carry 1 mark. there are total 10 questions");
		JLabel j3=new JLabel("3. There are 4 options, of which only one is correct.");
		JLabel j4=new JLabel("4. Time: 10 minutes");
		JLabel j5=new JLabel("5. All the Best.");
		
		i.add(j1);
		i.add(j2);
		i.add(j3);
		i.add(j4);
		i.add(j5);
		
		j1.setBounds(30,100,500,30);
		j2.setBounds(30,150,500,30);
		j3.setBounds(30,200,500,30);
		j4.setBounds(30,250,500,30);
		j5.setBounds(30,300,500,30);
		
		j1.setFont(new Font("Arial", 70, 17));
		j2.setFont(new Font("Arial", 70, 17));
		j3.setFont(new Font("Arial", 70, 17));
		j4.setFont(new Font("Arial", 70, 17));
		j5.setFont(new Font("Arial", 70, 17));
		
		proceed= new JButton("PROCEED");
		i.add(proceed);
		proceed.setBounds(30,350,100,30);
		proceed.setFocusable(false);
		proceed.addActionListener(this);
		
		pbar=new JProgressBar(0,100);
		i.add(pbar);
		pbar.setBounds(85,400,400,30);
		pbar.setStringPainted(true);
		pbar.setValue(0);
		
		i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		i.setSize(600,500);
		i.setLayout(null);
		i.setVisible(true);
	}
	
	public static void main(String args[]) {
		new Instructions();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		int count=0;
		while(count<=100) {
			pbar.setValue(count);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			count++;
		}
		pbar.setString("Done");	
		new Quiz();
	}
}
