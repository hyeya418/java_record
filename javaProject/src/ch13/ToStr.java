package ch13;

public class ToStr {
	public static void main(String[] args) {
		Object obj = new Object(); 
		//다형성
		//좌변:조상, 우변:자손
		obj = new Integer(20);   //Auto Boxing
		/*
		참조변수에는 원래 주소값이 저장되지만
		jdk1.5부터는 value가 저장될 수 있게 
		내부처리(intValue()등을 호출) 하도록 했다.
		 */
		System.out.println(obj); //Auto UnBoxing
		
		obj = new Double(20.5); //Auto Boxing
		System.out.println(obj);//Auto UnBoxing
		
		obj = "hello"; //obj가 조상인 Object타입이므로 좌변 String생략 가능
		System.out.println(obj);
	}

}
