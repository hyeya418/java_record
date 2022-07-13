package ch11;

public interface Controllable {
	//인터페이스는 추상메서드의 집합이긴 하나
	//상수,default메소드,static메소드 구현 가능
	
	default void repair() { 
	//인터페이스에서 명시적 default메소드 구현가능 (jdk1.8부터 가능)
		System.out.println("장비를 수리한다.");
	}
	
	static void reset() {
	//인터페이스에서 static메소드도 구현가능 (jdk1.8부터 가능)
		System.out.println("장비를 초기화한다.");
	}
	//참고 : private메소드로의 구현은 jdk9부터 가능
	//실무에서는 아직 인터페이스에서 위와 같은 구현메소드를 사용하지 않음

	//추상 메소드
	void turnOn(); 
	void turnOfF();
}
