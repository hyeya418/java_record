package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
/*
MouseListener : 마우스이벤트 처리를 위한 인터페이스
MouseMotionListener : 마우스 이동 이벤트 처리를 위한 인터페이스
KeyListener : 키보드이벤트 처리를 위한 인터페이스
*/
public class KeyMouseExam extends JApplet implements MouseListener,
			MouseMotionListener,KeyListener { //인터페이스는 다중 상속 가능
	private int x,y;  //이미지를 출력할 x,y 좌표값
	private int width, height; //가로, 세로 사이즈
	private Image img;//이미지 car.gif사용 할 변수
	private boolean flag = false;//이미지가 처음 실행할 땐 안보이게..false처리

	@Override
	public void init() {
		setSize(300,300);
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		//현재 클래스에 마우스 이벤트기능을 추가
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		setFocusable(true); //키를 입력받을 수 있도록 설정
		requestFocus();		//현재 화면에 키 입력을 요청
	}	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//이미지의 가로, 세로 길이 계산
		width = img.getWidth(null);
		height = img.getHeight(null);
		System.out.println(width+","+height); //콘솔창으로 확인
	
		if(flag) { //마우스 클릭 시 true로 변경되게 설정
		//drawImage(이미지, x, y, 이미지 관찰자)
		g.drawImage(img, x, y, this); 
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		//키를 입력하면 호출
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//키가 눌려져 있을 때 호출
		System.out.println(e.getKeyCode());//키 코드값
		System.out.println(e.getKeyChar());//문자
		switch (e.getKeyCode()) { //키 코드값에 따라 분기
		case KeyEvent.VK_UP:   //위쪽 화살표 키를 눌렀을 때
			y=Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN: //아래쪽 화살표 키를 눌렀을 떄
			y=Math.min(300-height,y+5); break;
		case KeyEvent.VK_LEFT: //왼쪽 화살표 키를 눌렀을 때
			x=Math.max(0,  x-5); break;
		case KeyEvent.VK_RIGHT://오른쪽 화살표 키를 눌렀을 때
			x=Math.min(300-width, x+5); break;
		}
		repaint(); //그래픽 갱신 요청
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		//마우스 버튼을 누른상태
		System.out.println("mouse drag : x :"+x+" ,y : "+y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//마우스 커서가 컴포넌트상에 이동했지만 버튼이 작동하지 않은 경우에 호출
		x=e.getX();
		y=e.getY();
		System.out.println("mouse move : x :"+x+" ,y : "+y);
		repaint();//화면갱신
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//컴포넌트상에서 마우스 버튼을 클릭(눌렀다 뗄때)했을 때 호출
		
		flag = true; //클릭했을 때 true로 설정함으로써 그림을 보여지게 함
		//마우스 클릭한 좌표 저장
		x=e.getX();
		y=e.getY();
		repaint();   //그래픽 갱신 요청 => paint()가 자동 호출됨
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//컴포넌트상에서 마우스 버튼을 누를 때 호출
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//컴포넌트상에서 마우스버튼을 떼고 놓아질 때 호출
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스가 컴포넌트에 들어갔을 때 호출
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스가 컴포넌트에서 빠져나올 때 호출
	}

}
