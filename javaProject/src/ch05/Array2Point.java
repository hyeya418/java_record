package ch05;

public class Array2Point {

	public static void main(String[] args) {
		//5행 5열의 2차원 배열 열데이터 : 국어,영어,수학,총점,평균
		//행데이터: 5명 학생 //열데이터 : 국어,영어,수학,총점,평균
		//총점, 평균은 0으로 초기화
//		int[][] point = {
//				{80,90,100,0,0},
//				{70,60,95,0,0},
//				{88,77,66,0,0},
//				{99,89,95,0,0},
//				{100,60,50,0,0}
//				};
		int point[][];
		point = new int[5][5];
		point[0][0] = 80;
		point[0][1] = 90;
		point[0][2] = 100;
		point[0][3] = 0;
		point[0][4] = 0;
		
		point[1][0] = 70;
		point[1][1] = 60;
		point[1][2] = 95;
		point[1][3] = 0;
		point[1][4] = 0;
		
		point[2][0] = 88;
		point[2][1] = 77;
		point[2][2] = 66;
		point[2][3] = 0;
		point[2][4] = 0;
		
		point[3][0] = 99;
		point[3][1] = 89;
		point[3][2] = 95;
		point[3][3] = 0;
		point[3][4] = 0;

		point[4][0] = 100;
		point[4][1] = 60;
		point[4][2] = 50;
		point[4][3] = 0;
		point[4][4] = 0;
		
		
		for(int i=0; i<5; i++) {
			point[i][3] = point[i][0]+point[i][1]+point[i][2];  
			//인덱스번호 3, 총점구하기
			point[i][4] = point[i][3]/3;
			//인덱스번호 4, 평균구하기
		}
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5; i++) {
			System.out.println(point[i][0]+"\t"+point[i][1]+"\t"+point[i][2]
					+"\t"+point[i][3]+"\t"+point[i][4]+"\t");
		}
		
	}

}
