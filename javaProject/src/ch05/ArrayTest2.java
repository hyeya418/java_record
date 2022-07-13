package ch05;

public class ArrayTest2 {
	public static void main(String[] args) {
		int sum=0;
		float average = 0f; //평균
		int[] score = {100,88,100,100,90}; //int타입의 score 배열
		
		
		
		for(int i=0; i<score.length; i++) {
			sum += score[i]; //sum=sum+score[i]
			
		}
		average = (float)sum/score.length; //average가 float이므로 형변환
											//score.length = 5개
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
	}
}
