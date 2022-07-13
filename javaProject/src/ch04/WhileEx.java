package ch04;

public class WhileEx {

	public static void main(String[] args) {
		int i = 1; //초기화
		while (i<=10) { //while 조건문 (무한루프)
			System.out.println(i);
			i++; //증감식
		}
		
		//while문을 for문으로 변경
		for(int j= 1; j<=10; j++) {
			System.out.println(j);
		}
	}

}
