package ch05;

public class ArraySum {

	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		int sum = 0;
//		for(int i =0; i<5; i++) {
//			sum = sum + num[i];
		
		
		for(int i =0; i<num.length; i++) {
			sum = sum + num[i];
			
			System.out.println("합계 : " + sum);
		}
//		System.out.println("합계 : " + sum);
	}

}
