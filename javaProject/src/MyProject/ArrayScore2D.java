package MyProject;

public class ArrayScore2D {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{80,90,70},
				{75,88,95},
				{72,90,90},
				{60,80,70}
				};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			char grade = ' ';
			
			System.out.printf("%2d\t", i+1);// 번호출력
			
			for(int j=0; j<score[i].length; j++) {//국영수 배열값
				sum += score[i][j]; //총점
				System.out.printf("%d\t", score[i][j]);
			}//inner for
			
			avg = sum/(float)score[i].length; //평균
			
			//등급
			if(avg>=90) {
				grade = 'A';
			}else if(avg>=80)  {
				grade = 'B';
			}else if(avg>=70)  {
				grade = 'C';
			}else if(avg>=60)  {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
			System.out.printf("%d\t %.1f\t %s%n", sum, avg, grade);
		}//outer for
	}//main

}
