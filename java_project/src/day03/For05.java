package day03;

public class For05 {

	public static void main(String[] args) {
		/* 최소공배수
		 * 공배수 : 공통된 배수
		 * 10 : 10 20 30 40 50 ...
		 * 15 : 15 30 45 60 75 ...
		 * 공배수 : 30 60 90 ...
		 * 최소공배수 : 30
		 */
		
		int num1 = 10;
		int num2 = 15;
		for(int i=1; ;i++) {
				if(num2*i % num1 == 0) {
					System.out.println("최소공배수 : "+num2*i);
					break;
			}
		}
		
		/*강사님 풀이 (10의배수로 i설정/15의 배수로 설정해도 상관없음)
		int num1 = 10;
		int num2 = 15;
		for(int i=num1; ; i+=num1) { // i=i+num1
			if(i%num1 == 0 && i%num2 == 0) {
				System.out.println("두 수의 최소공배수 : "+i);
				break;
			}
		}
		*/


	}

}
