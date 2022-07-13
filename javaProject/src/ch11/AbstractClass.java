package ch11;

//추상 클래스 : 1개 이상의 추상 메소드를 가진 클래스
//추상 메소드 : 메소드 내용이 완성되지 않은 메소드
//추상 클래스는 객체 생성을 할 수 없음.
//하위클래스에서 상속받아 추상 메소드를 오버라이딩해서 구현부 완성해야 사용 가능함

public abstract class AbstractClass {//추상 클래스

	abstract void method1();//추상 메소드
	void method2() {//완성된 메소드
		System.out.println("완성된 메소드");
	}
}



