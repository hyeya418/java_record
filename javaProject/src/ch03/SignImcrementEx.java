package ch03;

public class SignImcrementEx {

	public static void main(String[] args) {
//		int x = 8;
//		int y = 5;
//		System.out.println("x/y=" + x/y );
//		System.out.printf("x/y=%.1f", (double)x/y);
//		//println()문과는 달리 printf문에서는 결과 값을 실수형식인 %.1f로 지정한 경우
//		//반드시 연산결과가 실수값으로 나와야 하기 때문에 형변환 연산자인(double)을
//		//입력하여 명시적형변환을 해주어야 한다.

//		int numOfApples = 123;
//		int sizeOfBucket = 10;
//		int numOfBucket = numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket>0 ? 1 : 0);
//		
//		System.out.println("필요한 바구니의 수 : " + numOfBucket);

//		int num = -10;
//		System.out.println(num>0? "양수" : (num==0? 0 : "음수"));

		int fahrenheit = 100;
		float celcius = (int)((5/9f*(100-32))*100+0.5)/100f;
		
		System.out.println("Fahrenheit : "+fahrenheit);
		System.out.println("Celcius : "+celcius);
		
	}

}
