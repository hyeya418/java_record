package ch10;

//개별적인 값을 사용할 때 => non-static(인스턴스)을 사용 ex)학생들..
//공통적인 값(정해진 값)을 사용할 때 => static을 사용    ex)학점 4.0이상, 3.5이상..

public class StaticExam {

	public static void main(String[] args) {
		//main메소드는 개발자가 직접 메모리에 올릴 수 없기 때문에
		//자동으로 메모리에 올리려면 static을 필수로 사용해야 함.
		int a = 40, b=30, result;
		result = Math.max(a,b); //둘 중 큰 값
		System.out.println("최대값 : "+result);
		
		result = Math.min(a, b);//둘 중 작은 값
		System.out.println("최소값 : "+result);
		System.out.println("100의 제곱근 : "+Math.sqrt(100));//제곱근
		
		double r = 15.3;
		System.out.println("원의 둘레 : " + 2*Math.PI *r);
		System.out.println("원의 넓이 : " + Math.PI*r*r);
		
	}

}
