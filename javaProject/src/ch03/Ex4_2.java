package ch03;

public class Ex4_2 {

	public static void main(String[] args) {
		int sum = 0 ;
		
		for(int i=0; i<=20; i++) {
			if(i%2!=0 && i%3!=0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println("sum = "+sum);
	}

}
