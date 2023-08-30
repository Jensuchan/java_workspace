package day02;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		/*Q.수를 입력받아서 2의 배수가 맞으면 2의배수입니다.
		 * 3의 배수가 맞으면 3의배수입니다.
		 * import 단축키 : ctrl + shift + o
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int a=scan.nextInt();
		if(a%2==0&&a%3==0) {
			System.out.println(a+"는 2와 3의 배수입니다.");
		}else if(a%2==0) {
			System.out.println(a+"는 2의 배수입니다.");
		}else if(a%3==0) {
			System.out.println(a+"는 3의 배수입니다.");
		}else {
			System.out.println(a+"는 2와 3의 배수가 아닙니다.");
		}
		

	}

}
