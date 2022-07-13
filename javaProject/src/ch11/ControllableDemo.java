package ch11;

public class ControllableDemo {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.turnOfF();
		tv.remoteOn();
		tv.remoteOff();
		Controllable.reset(); 
		//static메서드는 객체생성없이 "클래스이름.메소드이름"으로 접근 가능
		
		System.out.println("----------------------");
		Computer com = new Computer();
		com.turnOn();
		com.turnOfF();
		com.repair();
		Controllable.reset();
	}

}
