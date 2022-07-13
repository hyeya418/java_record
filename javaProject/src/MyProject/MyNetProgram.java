package MyProject;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class MyNetProgram {
	public static void main(String[] args) {
		//1) 나의 랜카드 정보
		System.out.println("1) 나의 랜카드 정보 : ");
		try {
			 //getNetworkInterfaces() 네트워크 인터페이스(랜카드)의 다양한 정보 제공
			Enumeration<NetworkInterface> enu = NetworkInterface.getNetworkInterfaces();
			while(enu.hasMoreElements()) { //hasMoreElements() : 다음요소가 있으면 ture
				NetworkInterface net = enu.nextElement();
				System.out.println(net);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		//2) naver.com의 서버들
		System.out.println("2) naver.com의 서버들");
		try {
			//getAllByName() : 여러개의 IP주소를 리턴해서 배열로 저장
			InetAddress[] address = InetAddress.getAllByName("naver.com");
			for(int i=0; i<address.length;i++) {
				System.out.println(address[i]);
			}
		} catch (UnknownHostException e) {
			//UnknownHostException : 알려지지 않은 호스트(주소)
			e.printStackTrace();
		} 
		System.out.println();

		
		//3) naver.com의 호스트이름과 메인IP
		try {
			InetAddress add = InetAddress.getByName("naver.com");
			System.out.println("3) naver.com의 호스트이름 : "+add.getHostName());
			System.out.println("메인 IP번호 : "+add.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();

		
		//4) 나의 사용중인 port번호들
		System.out.println("4) 나의 사용 port번호들");
		ServerSocket socket = null; //서버소켓
		
		//사용중인 포트를 알아보기 위해 일부러 exception발생 시켜보는 코드
		//사용중인 포트는 피해서 사용해야 한다!!
		for(int i=0; i<=65535; i++) {
			try {
				socket = new ServerSocket(i);//서버 소켓 생성
				socket.close();			     //소켓 서비스 종료
			} catch (Exception e) {
				System.out.println(i+"번 포트는 사용중입니다.");
			}
		}
	}//main()
}
