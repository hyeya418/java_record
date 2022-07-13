package ch17;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JApplet;

public class RandomLine extends JApplet {
	private Random random;
	
	@Override
	public void init() {
		setSize(300,300);
		random = new Random();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for(int i=0;i<100;i++) {
			int red = random.nextInt(256);  //0~255
			int green = random.nextInt(256);
			int blue = random.nextInt(256);
			//색상표현 방식 : 1)Color.상수  2)Color(r,g,b)
			//컬러값을 rgb패턴으로 하면 다양한 색을 출력 가능
			g.setColor(new Color(red, green, blue));
			
			int x1=random.nextInt(300);//0~299
			int y1=random.nextInt(300);
			int x2=random.nextInt(300);//0~299
			int y2=random.nextInt(300);
			g.drawLine(x1, y1, x2, y2);//선그리기
		}
	}
}
