package ch17;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MessageEx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessageEx frame = new MessageEx();
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
	public MessageEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btn1 = new JButton("Message");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MessageEx.this,"Message");
			}
		});
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("confirm");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(MessageEx.this, "컨펌 하시면 종료됩니다.","종료",
						JOptionPane.YES_OPTION);
				if(result==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("input");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name =JOptionPane.showInputDialog(MessageEx.this,"이름을 입력하세요");
				JOptionPane.showConfirmDialog(MessageEx.this, name+"님 환영합니다.");
			}
		});
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("input");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] str= {"추가","수정","삭제"};
				JOptionPane.showOptionDialog(MessageEx.this, "메뉴선택","옵션",
						JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,str,str[0]);
			}
		});
		contentPane.add(btn4);
	}

}
