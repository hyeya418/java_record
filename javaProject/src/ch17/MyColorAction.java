package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyColorAction implements ActionListener{
	//멤버변수
	private JFrame f;
	private Color c;
	private Container con; //컴포넌트의 그릇
	/*
	1) Component : 화면구성요소(프레임, 버튼, 패널...)
	2) Container : 다른 컴포넌트를 담을 수 있는 요소(그릇)
	3) ContentPane : 스윙에서는 ContentPane에 컴포넌트를 부착할 수 있다.
					ContentPane은 JFrame객체가 처음 생길 때 자동으로 생성됨.
	*/
	public MyColorAction() {} //기본 생성자
	
	public MyColorAction(JFrame f, Color c) {
		this.f = f;
		this.c = c;
		con = f.getContentPane(); //프레임의 컨텐츠 영역
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c); //배경 색상 변경
	}
}
