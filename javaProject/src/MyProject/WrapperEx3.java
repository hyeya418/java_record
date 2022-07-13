package MyProject;

public class WrapperEx3 {
	public static void main(String[] args) {
		char[] data = {'H','e','l','l','o','1','2','3','4'};
		
		System.out.println("---------------------------------");
		System.out.println("(Character 사용)");
		for(int i=0; i<data.length; i++) {
			if(Character.isUpperCase(data[i])) 
				System.out.println(data[i]+"는 대문자입니다.");
			if(Character.isLowerCase(data[i]))
				System.out.println(data[i]+"는 소문자입니다.");
			if(Character.isDigit(data[i]))
				System.out.println(data[i]+"는 숫자입니다.");
		}
		System.out.println("---------------------------------");
		int a = 1234;
		String str = Integer.toString(a);
		int num = Integer.parseInt(str);
		
		System.out.println("(Integer 사용)");
		System.out.println("문자 "+str+"입니다.");
		System.out.println("숫자 "+num+"입니다.");
		System.out.printf("숫자 %d+%d는=%d입니다.%n",num, 2, num+2);
		System.out.println("---------------------------------");

	}

}
