 
// import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;

//import java.awt.*;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class GUI2 extends JFrame implements ActionListener{
    	JTextField txtName=new JTextField();
		JTextField txtAdmNo=new JTextField();

    public GUI2() {
    	super("SECOND GUI APPLICATION");
		setSize(400,200);
		getContentPane().setBackground(Color. BLUE);
		setLayout(new GridLayout(2,1));
		
		
		//create pannels
		JPanel panel1=new JPanel();
		panel1.setLayout(new GridLayout(2,2));
		panel1.setBackground(Color.GREEN);
		JLabel lblName=new JLabel("NAME");
		JLabel lblAdmNo=new JLabel("ADMIN NO");
		
			//adding to the panel
		panel1.add(lblName);
		panel1.add(txtName);
		panel1.add(lblAdmNo);
		panel1.add(txtAdmNo);
		
		JPanel panel2=new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.setBackground(Color.PINK);
		
		//BUTTONS
		JButton btnDisplay=new JButton("DISPLAY");
		btnDisplay.addActionListener(this);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(this);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(this);
		
		//Add buttons to the panel
		panel2.add(btnDisplay);
		panel2.add(btnClear);
		panel2.add(btnExit);

		
	
		add(panel1);
		add(panel2);
		setVisible(true);    	
    }
    	public void actionPerformed(ActionEvent e)
		{
			String buttonString=e.getActionCommand();
			
			if(buttonString.equals("DISPLAY"))
			{
		      	String message ="Name:" + txtName.getText()+"\nADMNO:" + txtAdmNo.getText();
		      	JOptionPane.showMessageDialog(null,message);
			}
			else if(buttonString.equals("CLEAR"))
			{
				txtName.setText("");
				txtAdmNo.setText("");
				
			}
			else if(buttonString.equals("EXIT"))
			{
				System.exit(0);
			}
		}
    
    public static void main(String[] args){
    	new GUI2();
    }
}