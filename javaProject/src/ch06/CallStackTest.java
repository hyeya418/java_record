package ch06;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
	} //main 끝

	public static void firstMethod() {
		secodnMethod();
	}

	public static void secodnMethod() {
		System.out.println("secondMethod()");
	}

}
