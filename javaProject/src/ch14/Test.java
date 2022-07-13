package ch14;

public class Test {
	public static void main(String[] args) {

		try {
			int num = Integer.parseInt("ABC");//영문자를 숫자화할 수 없다.
			System.out.println(num);
			
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException 예외 발생");
		} 
	}

}
