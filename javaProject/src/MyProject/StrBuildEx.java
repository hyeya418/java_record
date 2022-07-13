package MyProject;

public class StrBuildEx {
	public static void main(String[] args) {
		//String 불변(immutable)
		//StringBuilder 가변(mutable)

		System.out.println("----------------------------------------------------------");
		StringBuilder str1 = new StringBuilder("I am a");
		StringBuilder str2 = str1.append(" Java Programmer");

		System.out.println("append()메소드를 활용 : "+str1.toString());

		System.out.println("replace()메소드를 활용 : "+str1.replace(8, 11,"SP "));
		
		System.out.println("substring()메소드를 활용 : "+str1.substring(7));
		System.out.println("----------------------------------------------------------");


		
	}

}
