package MyProject;

public class RadioTest {
	
	public static void main(String[] args) {
		Radio britz = new Radio();
		britz.setChannel(89.1);
		britz.setVolume(12);
		britz.setOnOff(true);
		
		System.out.println("[브리츠 라디오]");
		System.out.println("라디오가 "+britz.getString()+"있습니다.");
		System.out.println("현재 채널은 "+britz.getChannel()+"입니다.");
		System.out.println("현재 볼륨은 "+britz.getVolume()+"입니다.");
		System.out.println();
		
		Radio iriver = new Radio();
		iriver.setChannel(95.1);
		iriver.setVolume(9);
		iriver.setOnOff(false);
		
		System.out.println("[아이리버 라디오]");
		System.out.println("라디오가 "+iriver.getString()+"있습니다.");
		System.out.println("현재 채널은 "+iriver.getChannel()+"입니다.");
		System.out.println("현재 볼륨은 "+iriver.getVolume()+"입니다.");
		
		
	}
	
}
