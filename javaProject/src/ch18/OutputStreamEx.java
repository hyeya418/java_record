package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		/*
		콘솔창에 별도의 스트림값을 출력하기 위해
		System클래스의 out이라는 static멤버에 
		PrintStream 객체의 참조값이 들어있는 점을 활용
		*/
		PrintStream ps = System.out;
		//PrintStream객체를 부모타입인 OutputStream으로 받아 처리함
		//OutputStream도 1byte처리 스트림 -> 한글 지원X
		OutputStream os = ps;
		try {
			os.write(97);//문자'a'
			os.write(98);//'b'
			os.write(99);//'c'
			os.flush();  //flush()메서드를 써야 출력됨
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
