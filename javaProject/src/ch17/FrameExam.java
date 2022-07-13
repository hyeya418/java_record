package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameExam {
	public static void main(String[] args) {
	Frame f = new Frame("프레임 제목");//윈도우창과 같은 화면을 띄우는 클래스
	f.setSize(200, 300);//프레임의 사이즈 설정
	f.setVisible(true); //프레임을 화면에 표시
	
	/*
	화면 닫기 기능 추가 WindowListner()사용시에는 모든 메서드를 구현해햐함.
	f.addWindowListener(new WindowListener() { //익명클래스
		
		@Override
		public void windowOpened(WindowEvent e) {
			
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
			
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {
			
		}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
			
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
			//프로그램을 종료시킴
			//정상종료:0, 비정상종료:-1
			System.exit(0);
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
			
		}
		
		@Override
		public void windowActivated(WindowEvent e) {
			
		}
	});
	*/
	
	//Adapter기능을 쓰면 코드가 간결해진다.
	f.addWindowListener(new WindowAdapter() {//익명클래스
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	}
}
