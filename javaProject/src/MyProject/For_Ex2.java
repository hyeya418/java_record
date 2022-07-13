package MyProject;

public class For_Ex2 {
	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		for(int i=1; i<=10; i++) {
			if(!(i%2==0)) {
				sum+= i;
			}else if(i%2==0) {
				sum2 += i;
			}
		}
		System.out.println("1~10사이의 홀수의 합은? " +sum);
		System.out.println("1~10사이의 짝수의 합은? " +sum2);
		
		
	}

}
