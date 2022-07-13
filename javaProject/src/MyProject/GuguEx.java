package MyProject;

public class GuguEx {

	public static void main(String[] args) {
		System.out.println("==첫번째 gugu메소드 활용==");
		gugu(2);
		System.out.println();
		System.out.println("==두번째 guguAll메소드 활용==");
		guguAll();
	}//main


	public static int gugu(int n) { //한 개의 구구단 출력(n단)
		int result = 0;
		for(int i=1; i<=9; i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}
		return result;
	} //gugu메소드
	
	public static void guguAll() { //전체 구구단 출력(2~9단)
		for(int i=2; i<=9; i++) {
			System.out.println("----"+i+"단----");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
		}
//		return; //return이 있는 자리가 메소드 종료시점이다. (생략가능)
	} //guguAll메소드
	
}
