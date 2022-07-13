package ch04;

public class BreakEx4 {
//while, break문을 활용해서 n값이 8일 때 while문을 빠져나오는 프로그램 작성
	public static void main(String[] args) {
		int n = 1;
		
		while(true) {
			System.out.println(n+" Hello World");
			n++;
				if(n>7)
				break;
		}
		System.out.println("n값이 "+n+"이며 while문 빠져 나옴");
	}

}
