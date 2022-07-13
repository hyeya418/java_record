package ch04;

public class Char_Tower {

	public static void main(String[] args) {
		int i, j;
		char a = 65;
		
		for(i=1; i<6; i++) { //i=1,2,3,4,5
			for(j=1; j<=i; j++) {  
				System.out.print(a++);
			}
			System.out.println();
		}
	}

}
