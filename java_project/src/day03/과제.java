package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50사이의 랜덤 수를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤으로 수를 생성 : 35
		 * 입력>10
		 * up
		 * 다시입력>20
		 * up
		 * 다시입력>40
		 * down
		 * 다시입력>35
		 * 정답
		 */
		
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*50)+1;
		System.out.println("1~50사이의 수를 입력하세요.");
		for(int i=scan.nextInt(); ;) {
			if(i == com) {
				System.out.println("정답입니다.");
				break;
			}else if(i>com) {
				System.out.println("down, 다시 입력해주세요");
				i=scan.nextInt();
			}else if(i<com) {
				System.out.println("up, 다시 입력해주세요");
				i=scan.nextInt();
			}
		}
		
		scan.close();
		

	}

}
