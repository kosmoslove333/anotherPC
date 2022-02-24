package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblLength;
	private JLabel lblArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex01 frame = new Ex01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("반지름");
		lblNewLabel.setBounds(23, 45, 52, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("원의 둘레");
		lblNewLabel_1.setBounds(23, 79, 52, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("원의 넓이");
		lblNewLabel_2.setBounds(23, 125, 52, 15);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mix();
				
			}
		});
		textField.setBounds(100, 42, 106, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("계산");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mix();
			}
		});
		
		
		btnNewButton.setBounds(232, 41, 95, 23);
		contentPane.add(btnNewButton);
		
		lblLength = new JLabel("");
		lblLength.setBounds(133, 79, 52, 15);
		contentPane.add(lblLength);
		
		lblArea = new JLabel("");
		lblArea.setBounds(133, 125, 52, 15);
		contentPane.add(lblArea);
	}
	
	void mix() {
		int r=Integer.parseInt(textField.getText());
		double length=2*Math.PI*r;
		double area=Math.PI*r*r;
		lblLength.setText(String.format("%.2f",length));
		lblArea.setText(String.format("%.2f",area));
	}

}
