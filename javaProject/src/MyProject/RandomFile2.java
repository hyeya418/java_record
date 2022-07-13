package MyProject;

import java.io.RandomAccessFile;

public class RandomFile2 {
	public static void main(String[] args) {
		String str=null;
		try { //r:읽기전용, w:쓰기전용, rw:읽기,쓰기
			RandomAccessFile file = new RandomAccessFile(
					"c:\\test\\rand2.txt", "rw");//읽기,쓰기모드
			//getFilePointer() : 파일포인터(파일을 어디까지 읽었는지 가리킴)
			System.out.println(file.getFilePointer());//인덱스0
			file.seek(9);//인덱스9부터
			System.out.println(file.getFilePointer());//인덱스9
			//포인터의 위치를 옮기는 메서드
			file.write("park".getBytes());//인덱스8 위치에서 기존내용을 덮어씀
			System.out.println(file.length());//길이13
			System.out.println(file.getFilePointer());//포인터위치13
			while(file.getFilePointer() < file.length()) {
				//파일의 내용보다 파일의포인터 위치값이 적은동안 반복
				str=file.readLine();
				//iso-8859-1, 8859_1  (2byte) : 서유럽언어 인코딩 방식
				//ms949(2byte)
				//utf-8 (3byte) : 초성(1byte), 중성(1byte), 종성(1byte)
				str=new String(str.getBytes("8859_1"),"utf-8");
			}
			System.out.println(file.length());//길이13
			System.out.println(file.getFilePointer());//포인터위치13
			file.close();//파일 저장시점
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
