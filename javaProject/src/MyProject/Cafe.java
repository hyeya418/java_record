package MyProject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Cafe extends JFrame {
	
	public Cafe() {
		super("Java Cafe");
		setSize(600,170);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//패널 생성
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
	
		
		//패널 배경색 설정
		panel.setBackground(Color.orange);
		panel1.setBackground(Color.white);
		panel2.setBackground(Color.orange);
		panel3.setBackground(Color.orange);
		panel4.setBackground(Color.orange);
		
		//라벨 생성
		JLabel label = new JLabel("메뉴를 선택하세요.");
		panel1.add(label); //패널에 라벨 붙임
		
		//버튼 생성
		JButton button1 = new JButton("아메리카노");
		JButton button2 = new JButton("카페라떼");
		JButton button3 = new JButton("바닐라라떼");
		JButton button4 = new JButton("결제");
		JButton button5 = new JButton("HOT");
		JButton button6 = new JButton("ICE");
		
		
		//패널에 버튼 추가
		panel3.add(button1);
		panel3.add(button2);
		panel3.add(button3);
		panel2.add(button4);
		panel4.add(button5);
		panel4.add(button6);
		
		//패널에 다른 패널 추가
		panel.add(panel1);
		panel.add(panel2);
		
		//프레임에 패널 추가
		//기본 BorderLayout 사용
		add(panel, "North");
		add(panel3);
		add(panel4,"South");
		setVisible(true);
		
		//이벤트 처리
		ActionListener handler = new ActionListener() {
			//모달창 Dialog(경고, 안내창 등)를 이벤트를 통해 출력
			//Modal창 : 본창(부모)앞에 튀어나온 별도의 창(자식)
			//부모-자식 관계를 가진 디자인 요소이다.
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("아메리카노")) {
					JOptionPane.showMessageDialog(null,
							"아메리카노를 선택하셨습니다.\n 가격:4,500원",
							"아메리카노",JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("카페라떼")) {
					JOptionPane.showMessageDialog(null, 
							"카페라떼를 선택하셨습니다. \n 가격:5,000원",
							"카페라떼",JOptionPane.WARNING_MESSAGE);
				}else if(e.getActionCommand().equals("바닐라라떼")) {
					JOptionPane.showMessageDialog(null, 
							"바닐라라떼를 선택하셨습니다. \n 가격:6,000원",
							"바닐라라떼",JOptionPane.DEFAULT_OPTION);
				}else if(e.getActionCommand().equals("결제")) {
					JOptionPane.showMessageDialog(null,
							"결제 하시겠습니까?", 
							"결제",JOptionPane.OK_CANCEL_OPTION);
					System.exit(0);
				}
			}
		};
		
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
		
	}//end Pizza()
	
	public static void main(String[] args) {
		new Cafe();
	}
}
