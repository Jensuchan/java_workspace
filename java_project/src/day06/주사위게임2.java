package day06;

import java.util.Scanner;

public class 주사위게임2 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6까지 랜덤수
		 * ex)
		 * 주사위 : 3
		 * 3칸 이동 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 이동 => 21칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동 횟수 : 8번 완주 
		 */
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int arrive = 30;
		
		a: for(;;) {
			System.out.println("주사위를 굴려주세요(엔터입력)");
			String s = scan.nextLine();
			int b = (int)(Math.random()*6)+1;
			if(s=="") {
				count++;
				sum+=b;
				if(sum<30) {
				    System.out.println(b+" 나왔습니다.");
				    System.out.println(arrive-sum+"칸 남음");
				    System.out.println();
				}else {
					System.out.println(b+" 나왔습니다.");
					System.out.println("도착~!!");
					System.out.println("총 이동횟수 : "+count+"회");
					break a;
				}
			}else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
		scan.close();
	}

}
