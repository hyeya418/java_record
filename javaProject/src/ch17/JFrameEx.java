package ch17;

import javax.swing.JFrame; //쓰기가 간편함. 색감, 그래픽이 깔끔
import javax.swing.JLabel;

public class JFrameEx extends JFrame{ //닫기 기능 포함되어 있음
	public JFrameEx() { //기본 생성자
		super("JFrame 예제"); //제목
//		setTitle("JFrame 예제");
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameEx();
	}
}
