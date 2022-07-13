package ch17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx2 extends JFrame {
	private JButton button1, button2, button3, button4, button5, button6;
	
	public EventEx2() { //기본 생성자
		//Flow레이아웃으로 변경
		setLayout(new FlowLayout());
		//버튼생성 및 버튼 로고 설정
		button1 = new JButton("Red"); 
		button2 = new JButton("Green"); 
		button3 = new JButton("Blue"); 
		button4 = new JButton("White"); 
		button5 = new JButton("Yellow"); 
		button6 = new JButton("Dark Gray"); 
		
		//프레임에 버튼 추가
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		
		//버튼에 이벤트 기능 추가
		//이벤트 핸들러를 외부클래스 생성 및 호출을 통해 구현
		button1.addActionListener(new MyColorAction(this, Color.red));
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.white));
		button5.addActionListener(new MyColorAction(this, Color.yellow));
		button6.addActionListener(new MyColorAction(this, Color.darkGray));

		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //현재 창만 닫기
	}//end EventEx2()

	public static void main(String[] args) {
		new EventEx2();
	}
}
