package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		str1 += " programming"; 
		//str1=str1+"programming", 문자열을 연결하는 것 이지만
		//실제로 새로운 문자열을 만들고 str1은 새로운 문자열의 주소값을 가리키게 됨.
		System.out.println(str1);
		System.out.println(str1.length());//문자열은 배열이므로 length() 사용 가능
		
		//concat()은 문자열을 연결해주는 메서드
		String str2= str1.concat(" programming");
		System.out.println(str2);
		System.out.println(str1);
		
		//charAt(n)는 인덱스위치 n번째의 문자를 리턴
		System.out.println(str1.charAt(2));
		
		//indexOf()는 찾고자하는 문자열의 시작인덱스값을 리턴 
		System.out.println(str2.indexOf("program"));
	
		//indexOf()는 찾고자하는 내용이 없으면 -1을 리턴
		System.out.println(str2.indexOf("z"));
	
		//substring(start, end-1) => 인덱스번호 0~3 리턴
		System.out.println(str2.substring(0,4));
		
		//substring(n) => 인덱스번호 n부터 끝까지 리턴
		System.out.println(str2.substring(5));
		
		//replace(old, new)는 문자열을 변경
		System.out.println(str2.replace("java","jsp"));
		
		String str3 = "01044666180";
		System.out.println(str3.substring(3,7));
		System.out.println(str3.replace(str3.substring(3,7), "****"));
		//replace(old(substring(3,7-1)),new)
	}
	

}
