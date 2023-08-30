package day10;

public class Class03 {

	public static void main(String[] args) {
		/* TV
		 * 
		 */
		
		TV tv = new TV("삼성", "65인치", "회색");
		tv.power();
		
		
		
	}

}
class TV{
	//멤버변수
	private String manu;
	private String size;
	private String color;
	private boolean power;
	private int channel;
	private int volume;
	private int count; //전원버튼 누르는 횟수
	
	//생성자
	public TV() {}
	public TV(String manu, String size, String color) {
		this.manu = manu;
		this.size = size;
		this.color = color;
	}
	
	//메서드
	public void power() {
		count++;
		if (count % 2 == 1) {
			System.out.println("전원이 켜졌습니다.");
			power = true;
		}else {
			System.out.println("전원이 꺼졌습니다.");
			power = false;
		}
	}
	
	public void channelUp() {
		if(count % 2 == 0) {
			System.out.println("전원을 먼저 켜주세요.");
		}else {
			channel++;
			if(channel > 100) {
				channel = 0;
			}
			System.out.println("채널번호 "+channel+"번");
		}
	}
	
	public void channelDown() {
		if(count % 2 == 0) {
			System.out.println("전원을 먼저 켜주세요.");
		}else {
			channel--;
			if(channel < 0) {
				channel = 100;
			}
			System.out.println("채널번호 "+channel+"번");
		}
	}
	
	public void volumeUp() {
		if(count % 2 == 0) {
			System.out.println("전원을 먼저 켜주세요.");
		}else {
			volume++;
			if(volume > 15) {
				volume = 15;
				System.out.println("소리를 더이상 키울 수 없습니다.");
			}
			System.out.println("볼륨 "+volume);
		}
	}
	
	public void volumeDown() {
		if(count % 2 == 0) {
			System.out.println("전원을 먼저 켜주세요.");
		}else {
			volume--;
			if(volume < 0) {
				volume = 0;
				System.out.println("소리를 더이상 키울 수 없습니다.");
			}
			System.out.println("볼륨 "+volume);
		}
	}
	
	
	
	
	
	
	public String getManu() {
		return manu;
	}
	public void setManu(String manu) {
		this.manu = manu;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	
}
