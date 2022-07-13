package ch04;

public class ContinueEx2 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i%2==0) //i가 2의배수이면 아래문장을 수행하지 않는다. 
				continue;
			System.out.println("홀수값 : " +i);
		}
	}

}
