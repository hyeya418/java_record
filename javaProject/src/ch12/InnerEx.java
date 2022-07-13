package ch12;

class Outer {
	class InstanceInner {
		int a = 100;	   //non=static
	}// end inner class
	
	static class StaticInner{
		int a = 200;       //non-static
		static int b = 300;//static
	}// end inner class
	
	void myMethod() {
		class LocalInner {
			int a = 400;   //non-static
		}// end inner class
		
		LocalInner i = new LocalInner();
		System.out.println("i.a : " +i.a);
		
	}//end myMethod()
}

public class InnerEx {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner i = oc.new InstanceInner();
		System.out.println("i.a : " +i.a);
		//인스턴스 클래스의 인스턴스멤버는 객체 생성후에 사용 가능
		
		System.out.println("Outer.StaticInner.b : "+Outer.StaticInner.b);
		//static클래스의 static멤버는 객체생성없이 사용 가능하다.
		
		Outer.StaticInner  si = new Outer.StaticInner();
		System.out.println("si.a : "+si.a);
		//static클래스의 인스턴스멤버를 객체생성 후 호출했다.
		
		oc.myMethod();//지역클래스를 가진 메소드 호출
	}

}
