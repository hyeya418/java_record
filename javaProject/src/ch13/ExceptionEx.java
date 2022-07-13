package ch13;

public class ExceptionEx {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		try {
			for(int i=0; i<=5; i++) { 
				//i<=5는 에러가 발생하지만, 문법적 오류가 아니므로 컴파일러가 잡을 수 없음
				System.out.println(nums[i]);
			}
			
		} catch (Exception e) {
			System.out.println("프로그램 실행 중에 문제가 발생했습니다.");
		}
		System.out.println("프로그램 종료...");
	}
}
