package ch04;

public class ContinueEx1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i%5==0) continue; 
			//i가 5의 배수이면 continue문을 통해 아래 문장을 수행하지 않고 다음 단계로 넘어간다.
			System.out.println(i);
		}
	}

}
