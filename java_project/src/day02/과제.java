package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*카페에 제출
		 * 정수 2개와 연산자 하나를 입력받아
		 * 두 정수의 연산을 출력
		 * 연산자는 + - * / % 
		 * ex)
		 * 3 2 + => 3+2=5
		 * 6 3 / => 6/3=2 
		 * 만약 연산자의 종류가 다른 연산자가 들어오면 잘못된 입력~!!
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2개와 연산자 하나(+ - * / %)를 순서대로 입력해주세요.");
		int a = scan.nextInt(), b = scan.nextInt();
		String s = scan.next();
		
		switch(s) {
		case "+": System.out.println(a+b); break;
		case "-": System.out.println(a-b); break;
		case "*": System.out.println(a*b); break;
		case "/": System.out.println((double)a/b); break;
		case "%": System.out.println(a%b); break;
		default : System.out.println("잘못된 입력입니다.");
		}
		scan.close();
		
	}

}
