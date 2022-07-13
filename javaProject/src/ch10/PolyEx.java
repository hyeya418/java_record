package ch10;
//다형성 : 조상타입 참조변수로 자손타입 객체를 다루는 것
public class PolyEx extends Object{ //Object는 최고 조상
	public static void main(String[] args) {
		int a = 10;
		double b = 20;
		char c = 'A';
		String d = "hello";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		/*
		Object는 최상위 클래스, 그대로 사용하면 무거워지며 속도가 저하 된다.
		OBject는 타입 하나로 모든타입을 다 다룰 수 있다.
		즉, 한개의 자료형으로 다양한 형태의 자료형을 처리할 수 있는 능력을 다형성이라 한다.
		 */
		
		Object o = "hello";
		System.out.println(o);
		
		
		
		
		
		
	}
}
