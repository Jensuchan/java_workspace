package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택
		 * (0=가위, 1=바위, 2=보)
		 * 나도 가위, 바위, 보 중 선택해서 입력(숫자, 문자 상관없음)
		 * 결과 =>
		 * 컴퓨터 > 가위, 나 > 가위 => 결과 무승부입니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str[] = new String[] {"가위", "바위", "보"};
		
		int random = (int)(Math.random()*3);
		System.out.println("숫자를 입력해주세요. 가위(0), 바위(1), 보(2)");
		int a = scan.nextInt();
		if (a<0||a>2) {
			System.out.println("잘못된 입력입니다.");
		}
		if(random<a) {
			if(random == 0 && a==2) {
				System.out.println("컴퓨터 >"+str[random]+", 나 >"+str[a]+" => 결과 : 졌습니다.");
			}else {
				System.out.println("컴퓨터 >"+str[random]+", 나 >"+str[a]+" => 결과 : 이겼습니다.");
			}
		}else if(random==a) {
			System.out.println("컴퓨터 >"+str[random]+", 나 >"+str[a]+" => 결과 : 무승부입니다.");
		}else if(random>a) {
			if(random == 2 && a==0) {
				System.out.println("컴퓨터 >"+str[random]+", 나 >"+str[a]+" => 결과 : 이겼습니다.");
			}else {
				System.out.println("컴퓨터 >"+str[random]+", 나 >"+str[a]+" => 결과 : 졌습니다.");
			}
		}
		
		scan.close();

	}

}
