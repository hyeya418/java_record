package ch17;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Shapes extends JApplet{
	@Override
	public void init() {
		setSize(300,300);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(5));//선 굵기 조절
		g.drawLine(10,10,200,10); 		 //1)선 그리기
		g.setColor(Color.YELLOW);		 //색상
		g2.setStroke(new BasicStroke(1));
		g.drawRect(120, 40, 90, 55);     //2)사각형
		g.setColor(Color.cyan);
		g.fillRect(120, 140, 90, 55);
		g.setColor(Color.red);
		//fillRoundRect(x좌표, y좌표, w, h, 가로 라운드 길이, 세로 라운드 길이)
		g.fillRoundRect(120, 240, 90, 55, 10, 10);
		g.setColor(Color.blue);
		g.drawOval(0, 40, 90, 55); //3)타원
		g.setColor(Color.pink);
		g.fillOval(0, 140, 90, 55);
		int[] x = {10,30,50,40,20};
		int[] y = {257,240,257,280,280};
		//fillPolygon(x배열,y배열,꼭지점의 개수) : 다각형 그리기
		g.fillPolygon(x,y,x.length); 
	}
}
