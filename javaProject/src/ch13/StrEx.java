package ch13;

public class StrEx {
	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println(str);
		//대문자로 변경해주는 메서드
		System.out.println(str.toUpperCase());
		//소문자로 변경해주는 메서드
		System.out.println(str.toLowerCase());
		
		System.out.println(str); //불변성(원본은 바뀌지 않음)
		
		str = str.toLowerCase();//기존의 str과의 주소값은 끊어지고 
		System.out.println(str);//소문자로 변경 된 문자열의 주소값으로 연결됨
		
		str = ""; //빈 문자열(주소값 있음)
		System.out.println("내용 : "+str);
		
		str = null;//참조하는 내용X (주소값 자체가 없음)
		System.out.println("내용 : "+str);
		
		char ch = '\0'; 
		System.out.println("내용 : "+ch+",code : "+(int)ch);
		
		ch = ' ';
		System.out.println("내용 : "+ch+",code : "+(int)ch);
		//ASCII코드 값 출력
	}
}
