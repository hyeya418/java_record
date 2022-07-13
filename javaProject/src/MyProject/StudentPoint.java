package MyProject;

public class StudentPoint {
	//멤버변수(전역변수)
	static int[] num = {1001,1002,1003}; 
	static String[] name = {"홍길동","이몽룡","이순신"};
	static int[] kor = {80,90,75};
	static int[] eng = {70,90,100};
	static int[] mat = {90,93,70};
	static int[] tot = {0,0,0};
	static double[] avg = {0,0,0};
	
	static void getTot() { //총점 계산 메소드
		for(int i=0; i<name.length; i++) {
			tot[i] = kor[i]+eng[i]+mat[i];
		}
	}
	
	static void getAvg() { //평균 계산 메소드
		for(int i=0; i<name.length; i++) {
			avg[i] = tot[i]/3.0;
		}
	}
	
	static void print() { //결과 출력 메소드
		System.out.println("전체 학생 수 : " + name.length + "명");
		System.out.println("============================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------------");

		for(int i=0; i<name.length; i++) {
			System.out.println(num[i]+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"
		+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
		System.out.println("============================================================");

	}
	
	public static void main(String[] args) {
		getTot();
		getAvg();
		print(); 
	}


}

