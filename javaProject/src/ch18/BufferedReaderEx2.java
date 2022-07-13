package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {
	public static void main(String[] args) {
		//Buffered계열(Reader계열(Stream)))형태로 구성
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader reader = new BufferedReader(isr);
		
//		한문장으로 가능	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 한줄을 입력하세요 : ");
		try {
			String str = reader.readLine();
			System.out.println("입력한 문자열 : "+str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("[프로그램 종료]");
	}
}
