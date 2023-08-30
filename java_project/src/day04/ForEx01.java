package day04;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 나자신의 수만 가지는 수를 소수
		 *  > 2, 3, 5, 7, 11, 13, 17, 19, ...
		 */
		
		/* num를 입력받아서 num가 소수인지 아닌지 판별
		 * ex) num=13 =>소수입니다.
		 *     num=12 =>소수가 아닙니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수)를 입력해주세요.");
		int num = scan.nextInt();
		int s = 0;
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				s++;
				}
			}
		System.out.println("약수의 개수 : " +s);
		if(s == 2) {
			System.out.println("소수입니다");
		}else {
			System.out.println("소수가 아닙니다");
		}
		
		scan.close();
		
		// 2~100까지 중 소수를 출력
		 

	}

}
