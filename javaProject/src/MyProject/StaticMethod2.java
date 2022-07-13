package MyProject;

public class StaticMethod2 {
	static int num = 10;		 //static멤버 
	static String name = "홍길동"; //static멤버 
	
	String email = "hong@gmail.com";//인스턴스 멤버
	String hp = "010-1234-5678";
	String addr = "서울 강남구 역삼동";
	
	public static void printA() {//static 멤버 메소드
		System.out.println("=== printA() ==="); //static메소드내에서 static변수 항상 사용 가능
		System.out.println("사번 : " + num);
		System.out.println("이름 : " + name);

		StaticMethod2 s = new StaticMethod2();  //static메소드내에서 iv는 객체 생성후에 사용 가능
		System.out.println("이메일 : " + s.email);
		System.out.println("전화 : " + s.hp); 
		System.out.println("주소 : " + s.addr); 
	}

	public void printB() { //인스턴스 메소드
		System.out.println("=== printB() ===");
		System.out.println("사번 : " + num);  //인스턴스메소드내에서 cv사용 가능
		System.out.println("이름 : " + name); //인스턴스메소드내에서 iv사용 가능
		System.out.println("이메일 : " + email);
		System.out.println("전화 : " + hp); 
		System.out.println("주소 : " + addr); 
	}
	
	public static void main(String[] args) {
		printA();//main메소드=> static메소드이므로 printA()사용 가능
//		printB();//static메소드 내에서 인스턴스 메소드 사용 불가
		System.out.println();
		
		StaticMethod2 a = new StaticMethod2();//객체 생성
		a.printB();//static메소드 내에서 인스턴스 메소드는 객체 생성후에 사용 가능
		
	}
}
