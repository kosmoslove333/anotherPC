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

public class Ex02 extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfMath;
	private JTextField tfEng;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex02 frame = new Ex02();
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
	public Ex02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setBounds(12, 10, 52, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("국어");
		lblNewLabel_1.setBounds(12, 35, 52, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("수학");
		lblNewLabel_2.setBounds(12, 60, 52, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("영어");
		lblNewLabel_3.setBounds(12, 85, 52, 15);
		contentPane.add(lblNewLabel_3);
		
		tfName = new JTextField();
		tfName.setBounds(76, 7, 106, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfKor = new JTextField();
		tfKor.setBounds(76, 32, 106, 21);
		contentPane.add(tfKor);
		tfKor.setColumns(10);
		
		tfMath = new JTextField();
		tfMath.setBounds(76, 57, 106, 21);
		contentPane.add(tfMath);
		tfMath.setColumns(10);
		
		tfEng = new JTextField();
		tfEng.setBounds(76, 82, 106, 21);
		contentPane.add(tfEng);
		tfEng.setColumns(10);
		
		JButton btn1 = new JButton("계산");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nm= tfName.getText();
				int kor=  Integer.parseInt(tfKor.getText());
				int math=  Integer.parseInt(tfMath.getText());
				int Eng=  Integer.parseInt(tfEng.getText());
				int total = kor+math+Eng;
				double avg = total/3;
				String result= "<html>이름 : "+nm+"<br>총점 :"+total+"<br>평균 :"+avg+"</html>";
				lblResult.setText(result);
			}
		});
		btn1.setBounds(206, 81, 95, 23);
		contentPane.add(btn1);
		
		lblResult = new JLabel("");
		lblResult.setBounds(12, 110, 286, 345);
		contentPane.add(lblResult);
	}

}
