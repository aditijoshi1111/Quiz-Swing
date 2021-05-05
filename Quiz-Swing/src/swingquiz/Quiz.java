package swingquiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;

public class Quiz extends JFrame implements ActionListener{
	
	String[] ans=new String[]{"Object","Float","lang","lang","get","Actionperformed","getDocumentBase","main","JButtonGroup","Abstract Window Toolkit"};
	JLabel question;
	JButton next;
	int count=1,score=0;
	JRadioButton r1,r2,r3,r4;
	ButtonGroup bg;
	JProgressBar pbar;
	Quiz(){
		JFrame frame=new JFrame("Swing Quiz");
		
		/*JPanel panel=new JPanel();
		frame.add(panel);
		panel.setBounds(0,0,600,500);
		panel.setBorder(BorderFactory.createLineBorder(Color.orange, 5));*/
		
		pbar=new JProgressBar(0,100);
		frame.add(pbar);
		pbar.setBounds(80,20,420,30);
		pbar.setStringPainted(true);
		pbar.setFont(new Font(null,Font.BOLD,18));
		pbar.setForeground(Color.orange);
		
		
		question=new JLabel();
		question.setText("Q1: Which one among these is the class alloted to all the class automatically?");
		frame.add(question);
		question.setBounds(50,100,500,30);
		question.setFont(new Font("Arial", 70, 14));
		
		
		bg=new ButtonGroup();
		r1=new JRadioButton("Swing");
		r1.setBounds(80,150,500,20);
		
        r2=new JRadioButton("Applet");
		r2.setBounds(80,180,500,20);
		
		r3=new JRadioButton("Object");
		r3.setBounds(80,210,500,20);
		
		r4=new JRadioButton("EventListener");
		r4.setBounds(80,240,500,20);
		
		r1.setFocusable(false);
		r2.setFocusable(false);
		r3.setFocusable(false);
		r4.setFocusable(false);
		frame.add(r1);frame.add(r2);frame.add(r3);frame.add(r4);
		bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);
		
		r1.setFont(new Font("Arial", 70, 17));
		r2.setFont(new Font("Arial", 70, 17));
		r3.setFont(new Font("Arial", 70, 17));
		r4.setFont(new Font("Arial", 70, 17));
		
		
		next=new JButton("NEXT");
		frame.add(next);
		next.setFocusable(false);
		next.setBounds(100,300,100,30);
		next.setFont(new Font("Arial", 70, 17));
		next.addActionListener(this);
		
		
		frame.setSize(600,400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		pbar.setValue(count*10);
		if(count==10)
			pbar.setString("COMPLETED! :)");
		if(e.getSource()==next) {
			
		   if(check())
			   score++;
		   
		   bg.clearSelection();
		   count++;
		   set();
		}
	}
	
	public boolean check() {
		if(count==1)
			return r3.isSelected();
		else if(count==2)
			return r2.isSelected();
		else if(count==3)
			return r4.isSelected();
		else if(count==4)
			return r4.isSelected();
		else if(count==5)
			return r3.isSelected();
		else if(count==6)
			return r3.isSelected();
		else if(count==7)
			return r4.isSelected();
		else if(count==8)
			return r2.isSelected();
		else if(count==9)
			return r2.isSelected();
		else if(count==10)
			return r2.isSelected();
		
		return false;
	}
	
	public void set() {
		
			if(count==2) {
				question.setText("Q2: Which of these is not a datatype?");
				r1.setText("int");
				r2.setText("Float");
				r3.setText("char");
				r4.setText("boolean");
			}
		    else if(count==3) {
				question.setText("Q3: Which package is directly available to our class without importing it?");
				r1.setText("swing");
				r2.setText("applet");
				r3.setText("net");
				r4.setText("lang");
			}
			else if(count==4) {
				question.setText("Q4: String class is defined in which package?");
				r1.setText("swing");
				r2.setText("applet");
				r3.setText("awt");
				r4.setText("lang");
			}
			else if(count==5) {
				question.setText("Q5: Which one among these is not a keyword?");
				r1.setText("int");
				r2.setText("class");
				r3.setText("get");
				r4.setText("if");
			}
			else if(count==6) {
				question.setText("Q6: Which among these is not a class?");
				r1.setText("Swing");
				r2.setText("Button");
				r3.setText("Actionperformed");
				r4.setText("ActionEvent");
			}
			else if(count==7) {
				question.setText("Q7: Which one among these is not a function of Object class?");
				r1.setText("toString");
				r2.setText("finalize");
				r3.setText("equals");
				r4.setText("getDocumentBase");
			}
			else if(count==8) {
				question.setText("Q8: Which function is not present in Applet class?");
				r1.setText("init");
				r2.setText("main");
				r3.setText("start");
				r4.setText("destroy");
			}
			else if(count==9) {
				question.setText("Q9: Which one among these is not a validcomponent?");
				r1.setText("JButton");
				r2.setText("JButtonGroup");
				r3.setText("JList");
				r4.setText("JTextArea");
			}
			else if(count==10) {
				question.setText("Q10: What is the abbreviation for AWT?");
				r1.setText("Applet Windowing Toolkit");
				r2.setText("Abstract Window Toolkit");
				r3.setText("Absolute Windowing Toolkit");
				r4.setText("None of the above");
				next.setText("Finish");
				next.addActionListener(e-> System.out.println("score: "+score));
			}
		}
	}
