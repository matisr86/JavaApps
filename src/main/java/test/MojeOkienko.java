package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MojeOkienko  extends JFrame implements ActionListener{
	
	JButton bPodajDate , bExit;
	JLabel lShowData ; 

	public MojeOkienko() {
		setSize (450, 300) ; 
		setTitle("APP");
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bPodajDate = new JButton("Podaj datę") ; 
		bPodajDate.setBounds(10, 130 ,200,20);
		bPodajDate.addActionListener(this);
		add(bPodajDate) ; 
		
		bExit = new JButton("Wyjście") ; 
		bExit.setBounds(220, 130 ,200,20);
		bExit.addActionListener(this);
		add(bExit) ; 
		
		lShowData = new JLabel("Data: ") ; 
		lShowData.setBounds(50 , 90 , 300, 20);
		lShowData.setForeground(Color.ORANGE);
		lShowData.setFont(new Font("SansSerif", Font.BOLD, 20));
		add(lShowData) ; 
		
	}
	
	
	public static void main(String[] args) {
		MojeOkienko okienko = new MojeOkienko() ; 
		
	}


	public void actionPerformed(ActionEvent e) {
		Object zrodlo = e.getSource() ; 
		
		if(zrodlo == bPodajDate) {
			//System.out.println(new Date());
			lShowData.setText(new Date().toString());
		}
		else if ( zrodlo == bExit) { 
			dispose();
		}
	}
	
	
}
