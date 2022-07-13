package MyProject;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		//객체생성, 참조변수인 myCar는 Car라는 객체가 있는 주소값을 기억한다.
		myCar.changeColor("흰색");
		myCar.changeGear(5);
		myCar.changeSpeed(100);
		
		System.out.println("차량 색상 : " + myCar.color);
		System.out.println("차량 속도 : " + myCar.speed+" km/h");
		System.out.println("차량 기어단수 : " + myCar.gear+" 단");
	}

}
