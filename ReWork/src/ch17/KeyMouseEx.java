package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class KeyMouseEx extends JFrame implements KeyListener,MouseListener,MouseMotionListener{

	private int x,y;
	private int width, height;
	private Image img;
	
	public KeyMouseEx() { //생성자
		addKeyListener(this); //키이벤트 관찰 기능 추가
		addMouseListener(this); // 마우스클릭기능
		addMouseMotionListener(this); //마우스 드래그이동
		//이미지 불러오기
		img=Toolkit.getDefaultToolkit().getImage(getClass().getResource("img.jpg"));
		setFocusable(true); //마우스 클릭을 받을 수 있는 상태
		requestFocus(); //화면에 포커스를 설정
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		width = img.getWidth(this); //이미지의 가로사이즈
		height = img.getHeight(this); //이미지의 세로사이즈
		g.drawImage(img,x,y,this);//이미지를 출력
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		repaint();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x= e.getX(); //마우스의 x좌표
		y= e.getY(); //마우스이 y좌표
		repaint();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) { //키 코드
		case KeyEvent.VK_UP: //업
			y = Math.max(50,  y-5); //둘 중 큰 값
			break;
		case KeyEvent.VK_DOWN:
			y = Math.min(480-height, y+5);
			break;
		case KeyEvent.VK_LEFT:
			x=Math.max(20, x-5);
			break;
		case KeyEvent.VK_RIGHT:
			x=Math.min(480-width, x+5);
			break;
		}
		repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new KeyMouseEx();
	}
	

}
