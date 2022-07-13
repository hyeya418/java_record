package ch12;

interface RemoteControl {//인터페이스 역할 : 기능 표준화
	//추상메소드(구현부가 없는 메소드)
	void turnOn();
	void turnOfF();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		//인터페이스는 객체생성을 할 수 없다.
		//익명클래스 처리를 하면
		//자동적으로 익명클래스가 인터페이스를 상속받아 오버라이딩 처리할 수 있다.
		RemoteControl ac = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");
			}

			@Override
			public void turnOfF() {
				System.out.println("TV turnOff()");
			}
			
		};//익명클래스의 블럭끝에는 세미콜론으로 마무리한다.
		ac.turnOn();
		ac.turnOfF();
	}

}
