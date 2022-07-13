package ch13;

import java.util.Random;

public class Rand {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextDouble());//1미만의 난수 출력
		System.out.println(r.nextInt()); //임의의 정수
		System.out.println(r.nextInt(100)); //0~99사이의 임의의 정수
		System.out.println(r.nextInt(101)+100);//100~200사이의 임의의 정수
		System.out.println(Math.random());//0.0<=x<1.0미만의 실수
		int num = (int)(Math.random()*100);//0<=<100 임의의 정수
		System.out.println(num);
		
		
		String[] prize = {"1등","2등","3등","다음 기회에"};
		System.out.println(prize[r.nextInt(4)]); //인덱스4, 0~3사이 값만 출력
	}

}
