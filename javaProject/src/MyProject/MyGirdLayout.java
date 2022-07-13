package MyProject;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyGirdLayout extends JFrame {
	
	public MyGirdLayout() {
		super("MyGirdLayout 예제");
		Container c = getContentPane();
		c.setLayout(new GridLayout(5,2));
		
		c.add(new JLabel("이름"));
		c.add(new JTextField("홍길동",20)); //텍스트필드의 입력 길이 값 지정
		c.add(new JLabel("ID"));
		c.add(new JTextField("hong", 20));
		c.add(new JLabel("PW"));
		c.add(new JPasswordField(20)); 	  //비밀번호 표시용 텍스트필드
		c.add(new JLabel("이메일"));
		c.add(new JTextField("hong@daum.net", 20));
		c.add(new JLabel("HP"));
		c.add(new JTextField("010-1234-5678", 20));

	
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end MyGirdLayout()

	public static void main(String[] args) {
		new MyGirdLayout();
	}
}
