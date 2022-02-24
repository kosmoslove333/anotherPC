package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgressEx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgressEx frame = new ProgressEx();
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
	public ProgressEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JProgressBar progress = new JProgressBar();
		contentPane.add(progress);
		
		JButton btnStart = new JButton("시작");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread th=new Thread(new Runnable() {

					@Override
					public void run() {
						for(int i=1; i<=100; i++) {
							progress.setValue(i);
							try {
								Thread.sleep(100);
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						}
						JOptionPane.showMessageDialog(ProgressEx.this, "완료되었습니다");
						
					}});
				th.start();
			}
		});
		contentPane.add(btnStart);
	}

}
