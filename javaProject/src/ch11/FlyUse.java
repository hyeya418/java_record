package ch11;

public class FlyUse {
	public static void main(String[] args) {
	
		//첫번째 객체 생성 방법
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		
		Airplane air = new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		System.out.println("==================");
		
		//두번째 : 다형성 기법
		//좌변:부모, 우변:자식
		Flyer f = new Bird(); //참조변수에 저장된 객체의 주소값이 다름
		System.out.println(f);
		f.takeOff(); //F3을 눌러보면 해당되는 부모의 메소드가 나옴
		f.fly();
		f.land();

		f = new Airplane(); //참조변수에 저장된 객체의 주소값이 다름
		System.out.println(f);
		f.takeOff();
		f.fly();
		f.land();
	}

}
