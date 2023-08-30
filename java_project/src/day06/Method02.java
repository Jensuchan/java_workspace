package day06;

public class Method02 {
	
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static void mul(int a, int b) {
		System.out.println(a*b);
	}
	public static void div(int a, int b) {
		System.out.println((double)a/b);
	}
	public static void rem(int a, int b) {
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 + - * / %
		 * 두 정수가 주어지면 두 정수의 연산을 하는 메서드를 작성
		 * +일 때 호출 => 메인에서 출력
		 * -일 때 호출 => 메인에서 출력
		 * *일 때 호출 => 메서드에서 출력
		 * /일 때 호출 => 메서드에서 출력 => 리턴을 double로
		 * %일 때 호출 => 메서드에서 출력
		 * 
		 */
		
		System.out.println(sum(15,7));
		System.out.println(sub(15,7));
		mul(15,7);
		div(15,7);
		rem(15,7);
		int method01 = Method01.sum(10, 30); //Method01클래스에서 정의한 sum 메서드 호출
		System.out.println(method01);
		System.out.println(Method01.sum(10, 30));
		
		//다른 클래스에 있는 메서드를 사용 (static 있는 경우)
		//클래스명.메서드명
		//클래스 => 정의서 => 객체를 생성해서 메서드를 사용
		//현재 시점에서 객체 생성없이 메서드를 사용할 수 있는 이유는 = static
		//(static이 없는 경우) - 선언만 해놓고 생성이 안되어있다는 것을 의미
		//객체를 생성 => 클래스가 필요
		
		Method02 me = new Method02();
		int s = me.sum(20, 30);
		System.out.println("me 객체 생성 후 sum 호출 : "+s);

	}

}
