package ch09;

public class SportsCarTest {

	public static void main(String[] args) {
		
		SportsCar obj = new SportsCar(); //자손클래스인 SportsCar타입의 객체 생성
		obj.speed = 10;		//Car의 멤버변수
		obj.setSpeed(60); 	//Car의 멤버메소드
		obj.setTurbo(true); //SportsCar의 멤버메소드
		
		//상속받는 객체는 "부모님꺼는 내꺼 ㅋㅋ"
	}

}
