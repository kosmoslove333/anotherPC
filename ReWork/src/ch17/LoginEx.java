package ch17;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginEx extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField pwd;
	private JLabel lblResult;
	private Map map;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginEx frame = new LoginEx();
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
	public LoginEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		userid = new JTextField();
		userid.setBounds(55, 41, 106, 21);
		contentPane.add(userid);
		userid.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(55, 90, 106, 21);
		contentPane.add(pwd);
		
		map = new HashMap<String,String>();
		map.put("kim","1234");
		map.put("park","1234");
		map.put("hong","1234");
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=userid.getText();
				String pw=String.valueOf(pwd.getPassword());
				if(map.get(id).equals(pw)) {
					lblResult.setForeground(java.awt.Color.blue);
					lblResult.setText(id+"님 환영합니다.");
				}else {
					lblResult.setForeground(java.awt.Color.red);
					lblResult.setText("id 또는 비밀번호가 일치하지 않습니다.");
				}
				
				}
		});
		btnLogin.setBounds(55, 146, 95, 23);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("New label");
		lblResult.setBounds(55, 199, 186, 15);
		contentPane.add(lblResult);
	}
}
