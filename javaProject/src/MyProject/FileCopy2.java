package MyProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;

//프로그램 ==> 파일 (Output스트림)
public class FileCopy2 {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("c:\\test\\abc.txt");
			System.out.print("입력하세요 : ");
			while(true) {
				int ch = System.in.read(); //
				if(ch==13) break; 
				os.write(ch);//입력된 값이 파일에 저장
			}
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//복사본(OutputStream객체) <== [프로그램] <== (InputStream객체)원본
		String str = "";
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		String file1 = "c:\\test\\abc.txt";    //원본
		String file2 = "c:\\test\\abcCopy.txt";//복사본
		
		try {
			reader = new BufferedReader(new FileReader(new File(file1)));
			writer = new BufferedWriter(new FileWriter(new File(file2)));
			while(true) {
				str=reader.readLine();//한 라인을 읽음
				if(str==null) break;  //문장 끝에서 while문 빠져나옴
				writer.write(str+"\r\n");
			}
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {//파일리소스 해제
			try {
				if(reader!=null) reader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(writer!=null) writer.close();
				//writer는 반드시 close해야 한다.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
