package ch06;

//실행 흐름 알기

public class CallStackTest2 {

	public static void main(String[] args) { //main메서드 첫줄부터 실행됨.
		System.out.println("main(String[] args)이 시작되었음."); //1
		firstMethod(); 										
		System.out.println("main(String[] args)이 끝났음.");    //7
	}

	static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음"); //2
		secondMethod(); 							  //3
		System.out.println("firstMethod()이 끝났음");	  //6

	}

	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음"); //4
		System.out.println("secondMethod()이 끝났음");    //5
	}

}
