package ch10;

public class StaticVarUse {
	public static void main(String[] args) {
		//다른 클래스에서 static멤버를 사용할 때 "클래스이름.static멤버"로 사용
		System.out.println(StaticVar.a);
	}
}
