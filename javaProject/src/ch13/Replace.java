package ch13;

public class Replace {	
	public static void main(String[] args) {
		String a ="java program"; //100번지
		System.out.println(a.replace("a", "A"));
		System.out.println(a);
		//String의 불변성으로 인해 실제 값은 변하지 않는다.

//		a = a.replace("a", "A");//다른 번지수에서 a 생성, 200번지
//		System.out.println(a);
//		System.out.println(a);
		
		
		String b ="호둥이 바보";
		System.out.println(b.replace("호", "꼬"));
		System.out.println(b);
//		
	}
}
