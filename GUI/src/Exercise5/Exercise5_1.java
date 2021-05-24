package Exercise5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise5_1 {

	private JFrame frame;
	private JTextField InttextField;
	private JTextField InttextField_1;
	private JTextField AnswertextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise5_1 window = new Exercise5_1();
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
	public Exercise5_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 703, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(InttextField.getText());
					int num2 = Integer.parseInt(InttextField_1.getText());
					
					int ans = num1 + num2;
					AnswertextField.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the number correctly.");
				}
			}
		});
		AddButton.setBackground(Color.YELLOW);
		AddButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		AddButton.setBounds(114, 161, 160, 44);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton_1 = new JButton("MINUS");
		MinusButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(InttextField.getText());
					int num2 = Integer.parseInt(InttextField_1.getText());
					
					int ans = num1 - num2;
					AnswertextField.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the number correctly .");
				}
			}
		});
		MinusButton_1.setBackground(Color.YELLOW);
		MinusButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		MinusButton_1.setBounds(445, 161, 160, 44);
		frame.getContentPane().add(MinusButton_1);
		
		InttextField = new JTextField();
		InttextField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		InttextField.setBounds(114, 62, 160, 44);
		frame.getContentPane().add(InttextField);
		InttextField.setColumns(10);
		
		InttextField_1 = new JTextField();
		InttextField_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		InttextField_1.setBounds(445, 62, 160, 44);
		frame.getContentPane().add(InttextField_1);
		InttextField_1.setColumns(10);
		
		JLabel AnswerLabel = new JLabel("The Answer Is ");
		AnswerLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		AnswerLabel.setBounds(126, 281, 194, 44);
		frame.getContentPane().add(AnswerLabel);
		
		AnswertextField = new JTextField();
		AnswertextField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		AnswertextField.setBounds(355, 281, 160, 44);
		frame.getContentPane().add(AnswertextField);
		AnswertextField.setColumns(10);
	}

}
