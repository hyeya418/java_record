package MyProject;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class MyFirstApp extends JFrame {
	
	public MyFirstApp() {
		setTitle("간단한 계산기");
		//패널 생성
		JPanel north = new JPanel();  //상단
		JPanel center = new JPanel(); //중앙
		JPanel south = new JPanel();  //하단
		
		//1) 컴포넌트 생성
		//1-1 상단 패널에 들어갈 컴포넌트 생성
		JLabel jl1 = new JLabel("수 1 : ");
		JTextField su1 = new JTextField(5);
		JLabel jl2 = new JLabel("수 2 : ");
		JTextField su2 = new JTextField(5);
		JLabel jl3 = new JLabel("연산자 : ");
		JTextField op = new JTextField(5);
		
		//1-2 중앙 패널에 들어갈 컴포넌트 생성
		JTextArea jta = new JTextArea(5, 20);		
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		//1-3 하단 패널에 들어갈 컴포넌트 생성
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");

		
		//2) 컴포넌트를 패널에 올린다
		//2-1 North에 1-1에서 생성한 컴포넌트를 올린다
		north.add(jl1); north.add(su1);
		north.add(jl2); north.add(su2); 
		north.add(jl3); north.add(op);
		
		//2-2 Center에 1-2에서 생성한 컴포넌트를 올린다
		center.add(jsp);
		
		//2-3 South에 1-3에서 생성한 컴포넌트를 올린다
		south.add(jb1); south.add(jb2); south.add(jb3);

		
		//3) 패널 3개를 Border프레임에 올린다
		add(north, "North");
		add(center, "Center");
		add(south, "South");
		
		//4) 텍스트필드의 문자열을 textArea영역으로 옮김
		su1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				jta.append(t.getText()+"\n");
				t.setText("");//현재 텍스트필드에 입력된 내용을 지움
			}
		});
		
		su2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				jta.append(t.getText()+"\n");
				t.setText("");//현재 텍스트필드에 입력된 내용을 지움
			}
		});
		
		op.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				jta.append(t.getText()+"\n");
				t.setText("");//현재 텍스트필드에 입력된 내용을 지움
			}
		});
		
		//이벤트 처리
		ActionListener handler = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("계 산")) {
					JOptionPane.showMessageDialog(null,
							"계산 결과 : ",
							"계 산",JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("종 료")) {
					JOptionPane.showMessageDialog(null, 
							"프로그램을 종료합니다.",
							"종 료",JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				}else if(e.getActionCommand().equals("취 소")) {
					JOptionPane.showMessageDialog(null, 
							"입력을 취소 하시겠습니까?",
							"취 소",JOptionPane.DEFAULT_OPTION);
				}
			}
		};
		
		
		jb1.addActionListener(handler);
		jb2.addActionListener(handler);
		jb3.addActionListener(handler);
		
		setSize(350,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}//end MyFirstApp()
	
	public static void main(String[] args) {
		new MyFirstApp();
	}
	
}
