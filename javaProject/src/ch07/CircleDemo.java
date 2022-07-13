package ch07;

public class CircleDemo {
	public static void main(String[] args) {
		Circle myCircle = new Circle(); //객체 생성
		myCircle.radius = 10.0;
		myCircle.show(myCircle.radius, myCircle.findArea());
		
	}
}

class Circle{
	//맴버변수
	double radius; //10.0
	
	//멤버메소드
	double findArea() {
		return 3.14*radius*radius;
	}
	void show(double x, double y) { //x = 10.0, y=3.14*10.0*10.0
		System.out.printf("반지름 = %.1f, 넓이 = %.1f%n", x, y);
	}
}
