package day03;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		/* num = 6 의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 * 6의 약수 : 1 2 3 6
		 * 12의 약수 : 1 2 3 4 6 12
		 */
		
		int num =6;
		System.out.println("6의 약수 >");
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("------------------------");
		
		//Q. num 입력받아서 그 수의 약수를 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수)를 입력해주세요.");
		int a = scan.nextInt();
		System.out.println(a+"의 약수 >");
		for(int i=1; i<=a; i++) {
			if(a % i == 0) {
				System.out.print(i+" ");
			}
		}
		scan.close();

	}

}
