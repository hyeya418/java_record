package ch06;


public class MethodEx2 { //메소드 사용
	public static void main(String[] args) {
		System.out.println("합(1~10) : " + sum(1,10));
		System.out.println("합(10~100) : " + sum(10,100));
		System.out.println("합(100~1000) : " + sum(100,1000));
	} //end main()
	
	//메소드의 위치는 main 아래나 위나 상관없음.
	public static int sum(int a, int b) { //sum 메소드 생성
		int sum = 0;
		
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		return sum;
	}//end sum
}
