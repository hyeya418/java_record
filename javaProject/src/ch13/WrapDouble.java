package ch13;

public class WrapDouble {
	public static void main(String[] args) {
//		Double num1 = new Double(11.5); 
		Double num1 = new Double("11.5"); 
		
		double num2 = 3.5; //기본자료형
		double num3 = num1/num2; //unboxing (num1객체형,num2기본형)
		System.out.println(num3);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		String str = "11.5";
		System.out.println(str+200);//200이 문자열로 변환되어 연산 됨
		System.out.println(Double.parseDouble(str)+200); //숫자 연산
	}
}
