package ch05;

public class GetMinMax {

	public static void main(String[] args) {
		int[] score = {79,88,91,33,100,55,95};
		int max = score[0]; // 배열의 첫째 값으로 초기화
		int min = score[0]; // 배열의 첫째 값으로 초기화
		
		
		for(int i =1; i<score.length; i++) { //index[1] 값부터 시작
			
			if(score[i]>max) { //최대값 찾기
				max = score[i];
			}else if(score[i]<min) { //최대값이 아니면 최소값인지 확인 
				min = score[i];
			}
		} //for문
		System.out.println("최대값 : " +max);
		System.out.println("최소값 : " +min);
	}

}
