package ch03;

public class Ex4_3 {

	public static void main(String[] args) {
		int sum =0;
		int s = 1;
		int num = 0;
		
		for(int i = 1 ; sum < 100; i++, s=-s) {
			num = s * i;
			sum = sum + num ;
			
//			if(sum>=100) {
//				break;
//			}
		}
		System.out.println("num = " + num);
		System.out.println("sum = " + sum);
	}

}
