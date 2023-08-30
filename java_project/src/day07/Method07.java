package day07;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력 메서드
		 * ex) 
		 * 3, * => ***
		 * 5, o => ooooo
		 * 7, ☆ => ☆☆☆☆☆☆☆
		 * 
		 * main에서 숫자와 기호를 입력받아 메서드호출 => 출력
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수)를 입력해주세요");
		int num = scan.nextInt();
		System.out.println("문자를 입력해주세요");
		char ch = scan.next().charAt(0);
		sign(num, ch);
		
		scan.close();
	}
	public static void sign(int num, char ch) {
		/* for문
		 * 
		 * for(int i=1; i<=num; i++) {
			System.out.print(ch);
		 */
		int i=1;
		while(i<=num) {
			System.out.print(ch);
			i++;

		}
	}

}
