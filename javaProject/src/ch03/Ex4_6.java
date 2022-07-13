package ch03;

public class Ex4_6 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
			System.out.println(str.charAt(i));
		}
			System.out.println("sum = " +sum);
		}
	}
