package ch16;

public class MusicPlayer extends Thread{
	//멤버변수
	int type;
	MusicBox musicBox; //클래스도 데이터타입이 될 수 있다.
	
	public MusicPlayer() {} //기본 생성자
	
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}
	
	@Override
	public void run() {
		switch (type) {
		case 1: musicBox.playMusicA(); break;
		case 2 : musicBox.playMusicB(); break;
		case 3 : musicBox.playMusicC(); break;
		}
	}//run()
}
