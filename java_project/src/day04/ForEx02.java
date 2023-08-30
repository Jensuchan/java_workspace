package day04;

public class ForEx02 {

	public static void main(String[] args) {
		// 2~100까지 소수만 출력하기
		
		for(int i=2; i<=100; i++) {
			int a = 0;
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					a++;
				}
			}if (a==2) {
				System.out.print(i+" ");
			}
		}
		
		/*강사님풀이
		for (int i=2; i<=100; i++) {
			int count=0; // 각 num마다 약수의 개수 = 0부터 시작
			for(int j=1; j<=i; j++) {  //약수를 구하기 위해 돌리는 값
				if(i % j == 0) {  // 약수를 체크
					count++;
				}
			} //약수가 2개인지 체크
			if(count == 2) {
				System.out.print(i+" ");
			}
		}
		*/
		
		

	}

}
