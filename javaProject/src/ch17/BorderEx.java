package ch17;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderEx extends Frame{
	/*
	GUI프로그램 코딩에서는 main메서드안에서 GUI코딩을 하는 것 보다 
	Frame을 extends받아서 기본생성자안에서 GUI 코드처리하는 것을 권장한다.
	*/
	public BorderEx() {
		setTitle("BorderLayout 예제");
		setSize(300, 200);
		setVisible(true);
		//버튼 생성
		Button b1 = new Button("east");
		Button b2 = new Button("west");
		Button b3 = new Button("south");
		Button b4 = new Button("north");
		Button b5 = new Button("center");
		
		//Frame의 기본레이아웃은 BorderLayout이기 때문에 setLayout생략 가능
		//setLayout(new BorderLayout());
		//버튼을 각 영역에 배치
		add(b1,"East");
		add(b2,"West");
		add(b3,"South");
		add(b4,"North");
		add(b5,"Center");//center는 생략 가능
		
		//윈도우창 닫기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}//end BorderEx()
	
	public static void main(String[] args) {
		new BorderEx();
	}
}
