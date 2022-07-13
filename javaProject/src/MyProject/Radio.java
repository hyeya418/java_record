package MyProject;

public class Radio {
	//멤버변수(전역변수)
	
	//변수는 private으로 설정
	private boolean onOff;
	private double channel;
	private int volume;
	
	//메소드는 public으로 설정
	public double getChannel() {
		return channel;
	}
	
	public void setChannel(double ch) {
		channel = ch; //멤버변수(iv) = 로컬변수
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int vol) {
		volume = vol; 
	}
	
	public boolean getonOff() {
		return onOff;
	}
	
	public void setOnOff(boolean onOff) {
		this.onOff = onOff; 
	}
	
	public String getString() {
		String str = onOff==true? "켜져":"꺼져";
		return str;
	}
	
}
