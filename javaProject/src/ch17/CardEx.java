package ch17;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardEx extends JFrame {
	CardLayout card;
	Container con; //프레임
	
	public CardEx() {
		super("CardLayout 예제");
		card = new CardLayout();
		con = getContentPane(); //프레임에 컨텐츠 추가
		setLayout(card); 		//기본레이아웃을 카드레이아웃으로 변경
		
		JPanel[] pan = new JPanel[5]; //패널 배열
		Color[] color = //색상 배열
			{Color.red, Color.yellow, Color.green, Color.blue, Color.cyan};
		for(int i=0; i<pan.length; i++) {
			pan[i] = new JPanel(); //패널 생성
			pan[i].setBackground(color[i]); //패널의 배경색상 설정
			add("card"+i, pan[i]); //add("이름", 컴퍼넌트)
			
			//패널에 마우스 이벤트 추가
			pan[i].addMouseListener(new MouseAdapter() { //익명클래스..
				@Override
				public void mouseClicked(MouseEvent e) {
					card.next(con); 	//다음 화면으로 이동
//					card.previous(con); //이전 화면으로 이동
				}
			});
			setSize(300, 300);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}//for
	}//end CardEx()

	public static void main(String[] args) {
		new CardEx();
	}
}
