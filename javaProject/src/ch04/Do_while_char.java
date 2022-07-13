package ch04;

public class Do_while_char {

	public static void main(String[] args) {
		char c = 'a';
		do {
			System.out.print(c);
			c=(char)(c+1); //영문의 경우 1을 더하면 다음 문자의 코드 값
			
		}while( c <= 'z'); //c가 'z'가 되었을 때 while문을 빠져 나옴.
	}

}
