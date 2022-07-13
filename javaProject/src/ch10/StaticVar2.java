package ch10;

public class StaticVar2 {
	 static int total; //static메모리(클래스영역)에 올라감 (공유)
	 String model; //객체타입은(인스턴스변수) heap영역에 생성(new,non-static)
	 
	 
	 public StaticVar2 (String model) {//매개변수가 있는생성자
		 this.model = model;
		 total++;
	 }
	 
	 public StaticVar2() {} //기본생성자 사용하지 않더라도 작성하는 습관 들이기
	 
}
