package ch08;

class Circle {
	private double radius;
	private String color;

	public Circle(double r,String c) { //매개변수가 2개인 생성자
		radius = r; //지역변수와 iv의 이름이 다르므로 변수 앞 this.생략가능
		color = c;
	}
	
	public Circle(double r) { //매개변수가 1개인 생성자
		radius = r; 
		color = "파랑";
	}
	
	public Circle(String c) { //매개변수가 1개인 생성자
		radius = 10.0; 
		color = c;
	}
	
	public Circle() { //기본 생성자
		radius = 10.0; 
		color = "빨강";
	}
	
	public void print() { //print()메소드
		System.out.println("반지름 : "+radius);
		System.out.println("색상 : "+color);
	}
}//Circle 클래스 

public class CircleDemo { //소스파일의 이름은 public이 붙은 클래스이름과 같아야 함.
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0, "빨강"); //객체 생성과 동시에 매개변수가 2개인 생성자 호출
		c1.print();
		
		Circle c2 =  new Circle(5.0); //객체 생성과 동시에 매개변수가 1개인 생성자 호출
		c2.print();
		
		Circle c3 = new Circle("노랑"); //객체 생성과 동시에 매개변수가 1개인 생성자 호출
		c3.print();
		
		Circle c4 = new Circle(); //객체 생성과 동시에 기본 생성자 호출
		c4.print();
	}
}
