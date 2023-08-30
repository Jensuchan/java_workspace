package day04;

public class 이중For문01 {

	public static void main(String[] args) {
		/* 별찍기
		 * 
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println(); //1행 끝나고 줄바꿈
		}
		System.out.println("-------------------");
		
		/* *       => i=1, j=1
		 * **      => i=2, j=2
		 * ***     => i=3, j=3
		 * ****    => i=4, j=4
		 * *****   => i=5, j=5
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
				if(i==j) {
					break;
				}
			}System.out.println();
		}
		System.out.println("-------------------");
		
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****  
		 */
		
		//if문 이용하는 방법
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=5-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
		System.out.println("-------------------");
		
		//for문이용
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		
		
		
		
		
		
	}

}
