package ch06;

//재귀호출 : 팩토리얼 계산 시 활용, 실제로 잘 사용하지 않음(메모리 증가때문)
public class RecursiveEx {

	public static void main(String[] args) {
		System.out.println(fact1(5)); //5!=5x4x3x2x1
	}

	static long fact1(int n) {
	
		return n==1? 1 : n*fact1(n-1);
	}
	//큰 수를 다룰 때는 BigInteger를 사용하거나 배열을 사용
	
}
