package ch13;

public class AppendEx {
	public static void main(String[] args) {
		//String Pool에 생성되며 불변성을 가짐
		//실제 쓰임새는 짧은 문자열을 처리하고자 할 때
		String a = "hello"; 
		a = a+ "java";
		System.out.println(a);
		
		//가변성(mutable)
		//실제 쓰임새는 긴 문자열을 처리하고자 할 때 
		StringBuffer b = new StringBuffer("hello");
		b.append("java");
		System.out.println(b);
	}

}
