package MyProject;

public class AutoBox2 {
	public static void main(String[] args){
		int num1 = 30;
		double num2;
		int num3;
	
		Integer i1; //객체 참조변수(주소값 저장)
		//선언만 했으므로 i1=null
		i1 = num1 ; //기본자료형을 객체자료형에 대입
		
		Double i2 = new Double(40.3); //auto boxing, 기본 자료형을 객체로 박스 처리
		num2 = i2;  //auto unboxing(객체 안에 들어있는 값을 풀어서 저장)
		
		Integer i3 = new Integer(50); //auto boxing, 기본 자료형을 객체로 박스 처리
		num3 = i3;  //auto unboxing(객체 안에 들어있는 값을 풀어서 저장)
		
		System.out.println("기본자료형 : "+num1+", 객체자료형 : "+i1);
		System.out.println("기본자료형 : "+num2+", 객체자료형 : "+i2);
		System.out.println("기본자료형 : "+num3+", 객체자료형 : "+i3);
	}

}
