package day03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		/* 최대공약수 찾기
		 * 약수 : 1부터 자기자신까지 나누어서 떨어지는 수
		 * 공약수 : 두 정수의 공통된 약수
		 * 최대공약수 : 공약수 중 가장 큰 값
		 * 8의 약수 : 1 2 4 8
		 * 12의 약수 : 1 2 3 4 6 12
		 * 8과 12의 공약수 : 1 2 4
		 * 8과 12의 최대공약수 : 4
		 */
		
		//두 정수 num1, num2를 입력받아 최대공약수를 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수) 두 개를 입력해주세요.");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c=0;
		for(int i=1; i<=Math.min(a, b); i++) {
				if(a % i == 0 && b % i == 0) {
					c=i;  //가장 큰 수로 덮어쓰기됨
				}
			}
		System.out.println("최대공약수 : "+c);
		System.out.println("최소공배수 : "+(a*b)/c);
		scan.close();
		
		/* 반복문에서 조건이 맞다면 반복문을 빠져나오는 역할
		 * break;
		 * 중첩 for문일 경우 if문을 포함하는 가장 가까운 for문만 벗어날 수 있음
		 * 벗어나고 싶은 for문에 닉네임을 지어 해당 닉네임의 for문을 벗어날 수 있음
		 */
		
//		두 수 중에서 작은수부터 시작해서 줄어드는 것을 이용한 최대공약수 구하기
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자(정수) 두 개를 입력해주세요.");
//		int a = scan.nextInt(), b= scan.nextInt();
//		for(int i=Math.min(a, b); ; i--) {
//			if(a % i == 0 && b % i == 0) {
//				System.out.println("두 수의 최대공약수 : "+i);
//				break;
//			}
//		}
//		scan.close();
		
		int i=0;
		a: for(;;) { //for문 이름짓기
			for(;;) {
				for(;;) {
					i++;
					if(i==10) {
						System.out.println(i+"벗어나기..");
						break a;
					}
				}
			}
		}

		
	}

}
