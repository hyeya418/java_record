package ch10;

//static => 메모리의 특정한 static영역을 사용(객체 생성없이 무조건 자동적으로 메모리 로딩)
//non-static(instance) => 객체 생상(new)된 후에 로딩
//static method에서는 static안의 지역 변수,static변수만 사용 가능

public class A {
	//non-static 멤버변수 (인스턴스변수)
	String name = "kim";
	
	//static 멤버변수 (클래스변수)
	static int n = 20;
	
	public void print() {//non=static 인스턴스 멤버메소드
			System.out.println(name);
			System.out.println(n);
	}
	
	public static void main(String[] args) {//static 멤버메소드
		//non-static 멤버변수(인스턴스변수)
		int a = 10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(n); //static은 static멤버끼리 통한다.
		//static메소드에서는 객체가 있는지 없는지 모르므로 인스턴스 멤버(iv,im) 사용불가
		
		
		A aa = new A(); //A 객체 생성 후에 non-static멤버(인스턴스 멤버) 사용 가능
		System.out.println(aa.name); //객체는 참조변수를 통해서만 다룰 수 있다.
		System.out.println(n); //static변수는 항상 사용 가능
		
		aa.print();
		//non-static멤버(인스턴스 멤버)는 반드시 객체 생성 이후에 사용 가능
	}
	
}
