package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용한 계산기 작성
		 * 연산자는 + - * / % 만 허용
		 * 두 수와 연산자를 입력받아서 메서드를 활용하여 연산
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("--계산기를 만들어보자--");
		System.out.println("정수를 입력해주세요.");
		int a = scan.nextInt();
		System.out.println("다음 정수를 입력해주세요.");
		int b = scan.nextInt();
		System.out.println("연산자 하나를 입력해주세요.");
		char op = scan.next().charAt(0);
		
		switch(op) {
		case '+': 
			System.out.println(""+a+op+b+"="+add(a,b));
			break;
		case '-': 
			System.out.println(""+a+op+b+"="+sub(a,b));
			break;
		case '*': 
			System.out.println(""+a+op+b+"="+mult(a,b));
			break;
		case '/': 
			System.out.println(""+a+op+b+"="+div(a,b));
			break;
		case '%': 
			int r[] = rem2(a,b);
			System.out.println("몫은"+r[0]+" "+"나머지는"+r[1]);
			System.out.println(""+a+op+b+"="+rem(a,b));
			break;
		    default :
		    	System.out.println("잘못된 연산입니다.");
		}
		System.out.println("계산기 종료");
		
		scan.close();

	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static int sub(int a, int b) {
		return a - b;
	}
	public static int mult(int a, int b) {
		return a * b;
	}
	public static double div(int a, int b) {
		return (double)a / b;
	}
	public static int rem(int a, int b) {
		return a % b;
	}
	/* 기능: 두 정수를 입력받아 두 정수의 몫과 나머지를 double[]로 리턴
	 * 리턴 타입 : double 타입의 배열
	 * 매개변수 : 두 정수
	 * 변수명 : rem2
	 */
//	public static void rem2(int a, int b) {
//		int[] arr = new int[] {a/b, a%b};
//		System.out.println("몫은"+arr[0]);
//		System.out.println("나머지는"+arr[1]);
//	}
	public static int[] rem2(int a, int b) {
		int[] arr = new int[] {a/b, a%b};
		return arr;
	}

}
