package day10;

public class Class02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : 이름, 색상, 인승, 연식
		 * 메서드 : 전원on, 전원off, 스피드 up, 스피드 down
		 * 
		 */
		
		Cha c1 = new Cha("BMW", "blue", 5, 1998, 1);
		c1.printCar();
		c1.power();
		c1.speedUp();
		

	}

}
class Cha {
	private String name;
	private String color;
	private int seater;
	private int modelYear;
	private int gasMileage;
	private boolean power;  //전원 boolean
	private int speed;
	
	public Cha() {}
	public Cha(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public Cha(String name, String color, int seater) {
		this(name, color);
		this.seater = seater;
	}
	public Cha(String name, String color, int seater, int modelYear) {
		this(name, color, seater);
		this.modelYear = modelYear;
	}
	public Cha(String name, String color, int seater, int modelYear, int gasMileage) {
		this(name, color, seater, modelYear);
		this.gasMileage = gasMileage;
	}
	
	//전원(boolean)
	public void power() {
		power = !power;
		if(power) {
			System.out.println("off");
		}else {
			System.out.println("on");
		}
	}
	
	//스피드
	public void speedUp() {
		if(power) {
			System.out.println("속도를 높일 수 없습니다.");
		}else if(!power && speed<300){
			speed++;
		}
	}	
		
	public void speedDown() {
		if(!power && speed>0) {
			speed--;
		}
	}
	
	public void printCar() {
		System.out.println("차종 : "+name+"("+seater+"인승)");
		System.out.println("차색 : "+color);
		System.out.println("연식 : "+modelYear);
		System.out.println("연비 : "+gasMileage);
	}
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSeater() {
		return seater;
	}
	public void setSeater(int seater) {
		this.seater = seater;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public int getGasMileage() {
		return gasMileage;
	}
	public void setGasMileage(int gasMileage) {
		this.gasMileage = gasMileage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

