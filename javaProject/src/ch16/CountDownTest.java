package ch16;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame{
	private JLabel label;
	class MyThread extends Thread {//내부 클래스
		@Override
		public void run() {
			for(int i=10;i>=0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i+"");
			}//end for
			System.exit(0);
		}
	}//inner class

	public CountDownTest() { //기본생성자
		setTitle("카운트다운");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Start");
		label.setFont(new Font("Seirf",Font.BOLD,100));
		add(label);
		(new MyThread()).start();
		setVisible(true); //화면을 보이게함		
	}
	
	public static void main(String[] args) {
		new CountDownTest(); //참조변수를 쓸 일이 없을때 이처럼 생성자만 호출해 객체를 생성해도 된다.
	}
}
