package day10;

public class Class03풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV1 tv = new TV1("LG");
		tv.isPower();
		tv.channelUp();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelUp();
		tv.channelUp();
		tv.volUp();
		tv.volUp();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		
		

	}

}

class TV1{
	/* 멤버변수 : name, power, channel, vol
	 * 메서드 : 전원, 채널up, 채널down, 볼륨up, 볼륨down
	 */
	//멤버변수
	private String name;
	private boolean power;
	private int channel;
	private int vol;
	
	//생성자
	public TV1() {}
	public TV1(String name) {
		this.name = name;
	}
	
	//메서드
	public void isPower() {
		if(!power) {
			power = true;
			System.out.println("TV전원이 켜졌습니다.");
		}else {
			power = false;
			System.out.println("TV전원이 꺼졌습니다.");
		}
	}
	
	//channel 상태
	public void channelUp() {
		if(channel == 100) {
			channel = 0;
		}else {
			channel++;			
		}
		System.out.println("현재채널:"+channel);
	}
	
	public void channelDown() {
		if(channel == 0) {
			channel = 100;
		}else {
			channel--;
		}
		System.out.println("현재채널:"+channel);
	}
	
	public void volUp() {
		//maxVol == 10;
		if(vol == 10) {
			System.out.println("더이상 올릴 수 없습니다.");
		}else {
			vol++;
			System.out.println("현재볼륨: "+vol);			
		}
	}
	
	
	
	
	public void volDown() {
		if(vol == 0) {
			System.out.println("음소거~!!");
		}else {
			vol--;
			System.out.println("현재볼륨: "+vol);			
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	
	
}
