package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class Calculator {

	private JFrame frmKalkulator;
	private JTextField txtDisplay;
	double firstNumber , secondNumber, result ;
	String operations , answer ; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmKalkulator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKalkulator = new JFrame();
		frmKalkulator.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Matis\\JAVA\\JavaApps\\mr1.png"));
		frmKalkulator.setTitle("Kalkulator");
		frmKalkulator.setBounds(100, 100, 253, 385);
		frmKalkulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKalkulator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Calibri", Font.BOLD, 20));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 11, 217, 32);
		frmKalkulator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
//**************************ROW 0***************************		
		JButton btnBack = new JButton("←");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null ; 
				
				if (txtDisplay.getText().length() > 0 ) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText()) ; 
					strB.deleteCharAt(txtDisplay.getText().length() - 1) ; 
					backspace = strB.toString() ; 
					txtDisplay.setText(backspace);
				}
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(10, 65, 50, 50);
		frmKalkulator.getContentPane().add(btnBack);
				
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC.setBounds(65, 65, 50, 50);
		frmKalkulator.getContentPane().add(btnC);
				
		JButton btnPe = new JButton("%");
		btnPe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText()) ; 
				txtDisplay.setText("");
				operations = "%" ; 
			}
		});
		btnPe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPe.setBounds(120, 65, 50, 50);
		frmKalkulator.getContentPane().add(btnPe);
				
		JButton btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText()) ; 
				txtDisplay.setText("");
				operations = "+" ; 
			}
		});
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnP.setBounds(175, 65, 50, 50);
		frmKalkulator.getContentPane().add(btnP);
		
		
//**************************ROW 1***************************		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + "7" ;
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(10, 120, 50, 50);
		frmKalkulator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + "8" ;
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(65, 120, 50, 50);
		frmKalkulator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + "9" ;
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(120, 120, 50, 50);
		frmKalkulator.getContentPane().add(btn9);
		
		JButton btnM = new JButton("-");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText()) ; 
				txtDisplay.setText("");
				operations = "-" ; 
			}
		});
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnM.setBounds(175, 120, 50, 50);
		frmKalkulator.getContentPane().add(btnM);
		
		
//**************************ROW 2***************************			
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + "4" ;
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(10, 175, 50, 50);
		frmKalkulator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + "5" ;
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(65, 175, 50, 50);
		frmKalkulator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + "6" ;
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(120, 175, 50, 50);
		frmKalkulator.getContentPane().add(btn6);
		
		JButton btnMu = new JButton("*");
		btnMu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText()) ; 
				txtDisplay.setText("");
				operations = "*" ; 
			}
		});
		btnMu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMu.setBounds(175, 175, 50, 50);
		frmKalkulator.getContentPane().add(btnMu);
		
//**************************ROW 3***************************			
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + "1" ;
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(10, 230, 50, 50);
		frmKalkulator.getContentPane().add(btn1);
				
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + "2" ;
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(65, 230, 50, 50);
		frmKalkulator.getContentPane().add(btn2);
				
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + "3" ;
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(120, 230, 50, 50);
		frmKalkulator.getContentPane().add(btn3);
				
		JButton btnD = new JButton("/");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText()) ; 
				txtDisplay.setText("");
				operations = "/" ; 
			}
		});
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnD.setBounds(175, 230, 50, 50);
		frmKalkulator.getContentPane().add(btnD);
		
//**************************ROW 3***************************			
		JButton btn0= new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + "0" ;
				txtDisplay.setText(EnterNumber);}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(10, 285, 50, 50);
		frmKalkulator.getContentPane().add(btn0);
						
		JButton btnDO = new JButton(".");
		btnDO.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDO.setBounds(65, 285, 50, 50);
		frmKalkulator.getContentPane().add(btnDO);
						
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(txtDisplay.getText()) ; 
				ops = ops * (-1) ; 
				txtDisplay.setText(String.valueOf(ops)); 
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnPM.setBounds(120, 285, 50, 50);
		frmKalkulator.getContentPane().add(btnPM);
						
		JButton btnE = new JButton("=");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNumber = Double.parseDouble(txtDisplay.getText()) ; 
				if ( operations =="+") {
					result = firstNumber + secondNumber ; 
					answer = String.valueOf(result) ; 
					txtDisplay.setText(answer);
				}
				
				else if ( operations =="-") {
					result = firstNumber - secondNumber ; 
					answer = String.valueOf(result) ; 
					txtDisplay.setText(answer);
				}
				
				else if ( operations =="*") {
					result = firstNumber * secondNumber ; 
					answer = String.valueOf(result) ; 
					txtDisplay.setText(answer);
				}
				
				else if ( operations =="/") {
					result = firstNumber / secondNumber ; 
					answer = String.valueOf(result) ; 
					txtDisplay.setText(answer);
				}
				
				else if ( operations =="%") {
					result = firstNumber % secondNumber ; 
					answer = String.valueOf(result) ; 
					txtDisplay.setText(answer);
				}
				
				
				
			}
		});
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnE.setBounds(175, 285, 50, 50);
		frmKalkulator.getContentPane().add(btnE);
		
		JLabel lblKaszio = new JLabel("KASZIO");
		lblKaszio.setBounds(93, 48, 55, 14);
		frmKalkulator.getContentPane().add(lblKaszio);
	}
}
