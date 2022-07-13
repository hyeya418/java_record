package ch11;

public class AbstractExtends extends AbstractClass{

	@Override
	void method1() { //부모 클래스의 미완성 메소드를 구현
		System.out.println("추상 메소드를 구현한 메소드");
	}

	public static void main(String[] args) {
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2(); //부모클래스의 메소드
	}
}
