package DataBaseConection;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class DataBaseConection {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataBaseConection window = new DataBaseConection();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DataBaseConection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 0, 0));
		textField.setBounds(0, 0, 369, 74);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("9");
		button.setForeground(Color.LIGHT_GRAY);
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBackground(new Color(0, 0, 0));
		button.setBounds(0, 74, 84, 74);
		frame.getContentPane().add(button);
		frame.setBounds(100, 100, 385, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
