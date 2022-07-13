package ch13;

public class ObjCast {
	public static void main(String[] args) {
		int a = 10;
		//좌변:부모, 우변:자식
		Object obj = 20;
		
		a = (Integer)obj; //클래스타입을 형변환 -> 정석
//		객체는 객체형기리 형변환 해주는 것이 좋다.
//		a = (int)obj; //가능은 함
		System.out.println(a);
		
		//배열
		Object[] obj2= {100,100.5,true,"hello",'A'};
		//사실 각 데이터가 Object객체(Integer,Double,Boolean,...)가 됨
		//Auto Boxing. 메모리낭비가 심하여 이렇게 쓰는 일은 X
		//대신 컬렉션처리(ArrayList)를 하면 단점을 보완할 수 있다.
		for(Object o : obj2) {//향상된 for문 for-each문
			System.out.println(o);//오토 언박싱
		}
	}

}
