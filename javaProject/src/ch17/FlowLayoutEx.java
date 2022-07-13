package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx extends JFrame{
	JPanel jp; //패널 선언
	JButton jb1, jb2, jb3,
			jb4, jb5, jb6; //버튼 선언
	public FlowLayoutEx() {//기본 생성자
		super("FlowLayout 예제"); //제목
		jp = new JPanel(); 		//패널 생성
		//버튼 생성
		jb1 = new JButton("버튼1");
		jb2 = new JButton("버튼2");
		jb3 = new JButton("버튼3");
		jb4 = new JButton("버튼4");
		jb5 = new JButton("버튼5");
		jb6 = new JButton("버튼6");
		//패널에 버튼을 추가
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
		//FlowLayout으로 설정(Frame의 기본레이아웃은 BorderLayout임)
		jp.setLayout(new FlowLayout());
		
		add(jp); //jFrame에 패널 추가
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end FlowLayoutEx()

	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
