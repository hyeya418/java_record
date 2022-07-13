package ch17;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldEx2 extends JFrame {
	
	public TextFieldEx2() {
		super("텍스트필드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(20)); //텍스트필드의 입력 길이 값 지정
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학과", 20));
		c.add(new JLabel("주소"));
		c.add(new JTextField("서울시..", 20));
		c.add(new JLabel("비번"));
		c.add(new JPasswordField(20)); //비밀번호 표시용 텍스트필드
		setSize(300,150);
		setVisible(true);
	}//end TextFieldEx()

	public static void main(String[] args) {
		new TextFieldEx2();
	}
}
