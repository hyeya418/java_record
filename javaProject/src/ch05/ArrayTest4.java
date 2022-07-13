package ch05;
//scanner로 입력한 값을 배열의 크기로 지정하고, 각 배열에 scanner로 입력한 값을 저장. 출력
import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		int total = 0;
		int size ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하시오 : ");
		size = scan.nextInt(); //입력받은 값 int타입으로 size에 저장
		
		int[] scores = new int[size]; //입력받은 size를 배열의 크기로 설정
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("성적을 입력하세요 : ");
			scores[i] = scan.nextInt(); //입력받은 배열의 크기가 3이면 3개 성적 저장
		}
		
		for(int i = 0; i<scores.length; i++) {
			total += scores[i];
		}
		System.out.println("총점은 " + total+ "입니다.");
		System.out.println("평균 성적은 " + total/scores.length + "입니다.");
		scan.close();
	}

}
