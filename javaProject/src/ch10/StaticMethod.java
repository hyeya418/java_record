package ch10;

public class StaticMethod {
	static int a = 10; //static멤버
	int b = 20;		   //non-static멤버
	
	public static void printA() {//static 멤버 메소드
		System.out.println(a);
//		System.out.println(b);	 //static메소드내에서 iv사용 불가
		StaticMethod s = new StaticMethod();
		System.out.println(s.b); //iv는 객체 생성후에 사용 가능
	}

	public void printB() {//인스턴스 메소드
		System.out.println(a); //인스턴스메소드내에서 cv사용 가능
		System.out.println(b); //인스턴스메소드내에서 iv사용 가능
	}
	
	public static void main(String[] args) {
		printA();	//main메소드=>static메소드이므로 printA()사용 가능
//		printB();	//static메소드 내에서 인스턴스 메소드 사용 불가
		
		StaticMethod a = new StaticMethod();//객체 생성
		a.printB();//인스턴스 메소드는 객체 생성후에 사용 가능
		
	}
}
