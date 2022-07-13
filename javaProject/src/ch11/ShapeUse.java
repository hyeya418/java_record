package ch11;

public class ShapeUse {

	public static void main(String[] args) {
//		Shape s = new Shape();//추상 클래스는 객체를 생성할 수 없다.
		
		Rectangle r = new Rectangle();
		System.out.println(r);//객체 주소값이 다르다.
		r.x = 100;
		r.y = 200;
		r.draw();
		
		Circle c = new Circle();
		System.out.println(c);
		c.x = 300;
		c.y = 300;
		c.draw();
	}
}
