package ch05;
//최소값 찾기
public class GetMin {

	public static void main(String[] args) {
		int s[] = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19}; //int타입의 배열s 생성
		int minimum; 
		
		minimum = s[0]; //minimum에 배열의 0번째 값인 12를 초기화
		
		for(int i=1; i<s.length; i++) { //i=1로 초기화한 이유는 0번째 값은 이미 저장되어있기 떄문에
			if(s[i] < minimum) {
				minimum = s[i];
			}
		}//for문
		System.out.println("최소값은 " + minimum);
	}

}
