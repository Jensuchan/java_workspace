package day02;

import java.util.Scanner;

public class 과제풀이 {

	public static void main(String[] args) {
		// 과제풀이
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수)를 입력해주세요.");
		int num1 = scan.nextInt();
		System.out.println("다음 숫자를 입력해주세요.");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력해주세요.");
		char op = scan.next().charAt(0); //한글자 입력받기
		
		int a = num1 + num2;
		int b = num1 - num2;
		int c = num1 * num2;
		double d = (double)num1 / num2;
		int e = num1 % num2;
		
		switch(op) {
		case '+' : System.out.println(""+num1+op+num2+"="+a); // ""는 op의 연산을 막기 위해 넣는다
			break;
		case '-' : System.out.println(""+num1+op+num2+"="+b);
			break;
		case '*' : System.out.println(""+num1+op+num2+"="+c);
			break;
		case '/' : System.out.println(""+num1+op+num2+"="+d);
			break;
		case '%' : System.out.println(""+num1+op+num2+"="+e);
			break;
			default : 
				System.out.println("잘못된 연산자입니다.");
		}
		
		scan.close();
		

	}

}
