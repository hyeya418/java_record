package MyProject;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

//고양이 키우기 게임
//키보드 화살표 버튼을 눌러야 고양이가 등장함.

public class MyCat extends JApplet implements KeyListener, ActionListener{
	private JButton eat, play, shower; //버튼 선언
	private AudioClip audio;		   //사운드 처리 객체
	private int x,y;  			//이미지를 출력할 x,y 좌표값
	private int width, height;  //가로, 세로 사이즈
	private Image img;			//이미지 cat.jpg를 사용 할 변수
	Component c = getContentPane();
	private JMenuItem mie = new JMenuItem("Exit");

	@Override
	public void init() {
		setSize(500,500);
		c.setBackground(Color.pink);
		setVisible(true);
		setLayout(new FlowLayout());
		createButton();
		createMenu();
		//사운드
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		//이미지
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("cat.jpg"));
		//현재 클래스에 키보드 이벤트기능을 추가
		this.addKeyListener(this);
		setFocusable(true); //키를 입력받을 수 있도록 설정
		requestFocus();		//현재 화면에 키 입력을 요청
	}	
	//이벤트 핸들러
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		System.out.println(e.getSource());
			if(btn == eat) {
				audio.play();
				JOptionPane.showMessageDialog(null,"고양이에게 먹이를 주시겠습니까?",
					 					"먹이주기",JOptionPane.INFORMATION_MESSAGE);
			}else if(btn == play) {
				audio.play();
				JOptionPane.showMessageDialog(null,"고양이와 놀아주시겠습니까?",
										"놀아주기",JOptionPane.INFORMATION_MESSAGE);
			}else if(btn == shower) {
				audio.play();
				JOptionPane.showMessageDialog(null,"고양이를 샤워시키겠습니까?",
										"샤워하기",JOptionPane.INFORMATION_MESSAGE);
			}
		}
			
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, x, y, this); //이미지를 표시
		g.drawString("[냥이♡]", x+20, y);
		g.drawString("화살표 키로 고양이를 움직일 수 있어요", 150, 250);
//		repaint(); //그래픽 갱신 요청->화면 떨림

	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		//키를 입력하면 호출
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//키가 눌려져 있을 때 호출
		//키 코드값에 따라 분기
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:   	 //위쪽 화살표 키를 눌렀을 때
			y=Math.max(0, y-5);
			break;
		case KeyEvent.VK_DOWN:  //아래쪽 화살표 키를 눌렀을 떄
			y=Math.min(300-height,y+5);
			break;
		case KeyEvent.VK_LEFT:  //왼쪽 화살표 키를 눌렀을 때
			x=Math.max(0,  x-5); 
			break;
		case KeyEvent.VK_RIGHT: //오른쪽 화살표 키를 눌렀을 때
			x=Math.min(300-width, x+5);
			break;
		}
//		System.out.println("key press=>x :"+x+" ,y : "+y+"\n");
		repaint(); //그래픽 갱신 요청
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	void createButton() {
		//버튼 생성 후 프레임에 버튼추가
		eat = new JButton("eat");
		play = new JButton("play");
		shower = new JButton("shower");
		add(eat);
		add(play);
		add(shower);
		//버튼클릭 이벤트 기능 추가
		eat.addActionListener(this);
		play.addActionListener(this);
		shower.addActionListener(this);
	}//end createButton()
	
	void createMenu() { 
		JMenuBar mb = new JMenuBar(); 	 //메뉴바 생성
		JMenu jm = new JMenu("Option");  //메뉴 생성
		//메뉴에 메뉴아이템 붙임
		jm.add(new JMenuItem("Add cat"));
		jm.add(new JMenuItem("Add dog"));
		jm.add(new JMenuItem("Save"));
		//메뉴에 분리선 추가
		jm.addSeparator();	
		jm.add(mie);
		//메뉴바에 메뉴 붙임
		mb.add(jm); 		
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Help"));
		//프레임에 메뉴바를 붙임(메뉴바는 프레임에만 붙일 수 있다.)
		setJMenuBar(mb);
		//Exit 메뉴아이템을 클릭하면 프로그램을 종료하는 이벤트 처리
		mie.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}//end createMenu()
}//end MyCat
