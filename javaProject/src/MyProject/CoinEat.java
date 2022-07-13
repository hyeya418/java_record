package MyProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CoinEat extends JFrame implements KeyListener{
	private Image bufferImage;
	private Graphics screenGraphics;
	
	private Image backgroundImage = new ImageIcon("src/MyProject/mainScreen.png").getImage();
	private Image player = new ImageIcon("src/MyProject/cat.jpg").getImage();
	private Image coin = new ImageIcon("src/MyProject/coin.png").getImage();
			
	private int playerX, playerY; //플레이어 위치
	private int playerWidth = player.getWidth(null);
	private int playerHeight = player.getHeight(null); //플레이어 가로,세로 크기
	private int coinX, coinY;	//코인 위치
	private int coinWidth = coin.getWidth(null);
	private int coinHeight = coin.getHeight(null);  //코인 가로,세로 크기

	private int score; //점수
	private boolean up, down, left, right; //키보드의 움직임을 받아줄 변수
	
	//GUI
	public CoinEat() {
		setTitle("동전 먹기 게임(고양이ver)");
		setVisible(true);
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Init();//게임 초기화
		
		while(true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			keyProcess();
			crashCheck();
		}
	}
	
	//게임 시작 시 초기화해주는 메서드
	public void Init() {
		score = 0; //점수 초기화
		
		//플레이어와 코인 위치 설정
		playerX = (500-playerWidth)/2;
		playerY = (500-playerHeight)/2;
		
		coinX = (int)(Math.random()*(501-playerWidth));
		coinY = (int)(Math.random()*(501-playerHeight-30))+30;
		
		this.addKeyListener(this);
		setFocusable(true); //키를 입력받을 수 있도록 설정
		requestFocus();		//현재 화면에 키 입력을 요청
	}
	
	//플레이어의 움직임 처리
	public void keyProcess(){
		if(up && playerY-3 > 30) playerY-=3;
		if(down && playerY+playerHeight+3 < 500) playerY+=3;
		if(left && playerX-3 > 0) playerX-=3;
		if(right && playerX+playerWidth+3 < 500) playerX+=3;
	}
	
	//플레이어와 코인이 닿았을 때 점수 획득
	public void crashCheck() {
		if(playerX+playerWidth > coinX && coinX+coinWidth > playerX 
				&& playerY+playerHeight > coinY && coinY+coinHeight > playerY) {
			score += 100;
			coinX = (int)(Math.random()*(501-playerWidth));
			coinY = (int)(Math.random()*(501-playerHeight-30))+30;
		}
	}
	
	//더블 버퍼링
	public void paint(Graphics g) {
		bufferImage = createImage(500,500);
		screenGraphics = bufferImage.getGraphics();
		screenDraw(screenGraphics);
		g.drawImage(bufferImage, 0, 0, null);
	}
	
	//화면 출력 
	public void screenDraw(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
		g.drawImage(player, playerX, playerY, null);
		g.drawImage(coin, coinX, coinY, null);
		g.setColor(Color.white);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("SCORE : "+score, 30, 80);
		this.repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			up = true;
			break;
		case KeyEvent.VK_DOWN:
			down = true;
			break;
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			up = false;
			break;
		case KeyEvent.VK_DOWN:
			down = false;
			break;
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		}
		
	}
	public static void main(String[] args) {
		new CoinEat();
	}
}
