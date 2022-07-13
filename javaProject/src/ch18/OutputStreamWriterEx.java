package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class OutputStreamWriterEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		//PrintStream객체를 부모타입인 OutputStream으로 받아 처리함
		OutputStream os = ps;
		//OutputStreamWriter(OutputStream) 구조로 처리
		//OutputStreamWriter -> 2byte 처리 가능(한글가능)
		OutputStreamWriter osw = new OutputStreamWriter(os);
		try {
			osw.write(44032);//가
			osw.write("나다라마바사");
			osw.flush(); //flush()메서드를 써야 출력됨
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
