package day03;

public class For01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do~while
		 * - for, while문은 동작방식이 같다. 
		 * => 조건에 맞지 않으면 한번도 실행 안 될 수 있다.
		 * - do~while문은 두 문법과는 동작 방식에 차이가 있다.
		 * => 조건에 맞지 않아도 무조건 한 번은 실행한다.
		 * 
		 * for(1초기화 ; 258조건식 ; 47증감연산식){
		 *   36실행문;
		 * }
		 * 
		 * -초기화 : 조건식이나 실행문에서 사용할 변수를 초기화, 생략가능
		 *         처음 한 번만 실행
		 * -조건식 : 반복문의 반복을 결정하는 식(true => 반복), 생략가능
		 * -증감식 : 조건식에서 사용되는 변수를 증가 / 감소시켜 반복 횟수를 조절, 생략가능            
		 */
		
		
		/* 1~10까지 출력하는 예제
		 * 초기화 : i변수 사용(index) => i=1;
		 * 조건식 : i가 10이 될 때까지 실행 => i<=10
		 * 증감식 : i가 1씩 증가 => i++; (i = i + 1)
		 * 실행문 : i 출력
		 */
		
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println(); //줄바꿈용
		System.out.println("------------------------");
		
		for(int j=10; j>0; j--) {
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("------------------------");
		
		for(int i=2; i<=10; i= i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("------------------------");
		
		//Q.if문을 사용하여 1~20까지의 짝수만 출력
		
		for(int i=1; i<=20; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("------------------------");
		
		//Q.if문을 사용하여 1~10까지의 홀수만 출력/짝수일 때는 pass 출력
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}else {
				System.out.print("pass"+" ");
			}
		}
		
		System.out.println();
		System.out.println("------------------------");
		
		/* Q.1부터 10까지 합계 출력
		 * 초기화 : 1부터, 조건식 : 10까지, 증감식 : 1씩증가
		 * 실행문 : 누적 더하기
		 * 실행 후 출력
		 * 지역변수() {생성 소멸}
		 */
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i ;
		}
		System.out.println(sum);
		System.out.println("------------------------");
		
		/* 1부터 10까지 짝수의 합과 홀수의 합을 출력
		 * for 1부터 10까지 1씩 증가하여 값을 비교
		 * if 짝수인지 판단 => 짝수의 합계
		 *    홀수인지 판단 => 홀수의 합계
		 * for문 종료 후 출력
		 */
		
		int even=0, odd=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("1부터 10까지 짝수의 합 : "+even);
		System.out.println("1부터 10까지 홀수의 합 : "+odd);
		
	}

}
