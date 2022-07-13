package ch09;

public class Ball extends Circle { //상속
	//Ball 멤버변수
	private String color;
	
	
	//Ball 멤버 메소드
	public Ball(String color) { //매개변수가 1개인 생성자(메소드)
		this.color = color;
	}

	public Ball() {} //기본 생성자도 코딩하는 습관을 가지자. 
	
	
	public void findColor() {
		System.out.println(color+"공이다.");
	}
	
	public void findVolume() {
		System.out.println("부피 구하기");
	}
	
}
