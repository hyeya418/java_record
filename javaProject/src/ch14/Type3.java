package ch14;

public class Type3<T> {//자료형이 미정인 상태
	 T t;//자료형 미정

	public T getT() {//자료형 미정
		return t;
	}

	public void setT(T t) {//자료형 미정
		this.t = t;
	}
	
	public static void main(String[] args) {
		//인스턴스 생성 시 자료형을 결정함->제너릭(일반화)이라 한다.
		Type3<String> t = new Type3<String>();
		t.setT("ㅋㅋ");
		System.out.println(t.getT());
		
		Type3<Integer> t2 = new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
/*	
	Type3 t3 = new Type3()
	<>자료형을 결정하지 않고 일반적인 방법으로 new를 하면 실행은 되지만
	내부에서는 모두 Object타입으로 처리하게되므로 메모리 낭비가 심함.
*/	
		
	}
}
