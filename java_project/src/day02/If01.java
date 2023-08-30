package day02;

public class If01 {

	public static void main(String[] args) {
		/* 조건문 : 조건식이 참일 경우 실행문을 실행하는 문법
		 * if문, switch문
		 * if(조건식){ 실행문; }
		 * 실행문이 한 줄일 경우 { } 생략가능
		 * 조건식이 참일 때 실행문을 실행
		 * */
		
		int num=10;
		if(num>0) {
			System.out.println("양수");
		}
		
		//num가 0보다 크면 양수 / 아니면 음수 /0이면 0입니다.
		
		if(num>0) {
			System.out.println("양수");
		}else if(num==0){
			System.out.println(num);
		}else {
			System.out.println("음수");
		}
		
		//num가 0보다 크면 양수(10보다 크면 10보다 큽니다)/ 아니면 음수 /0이면 0입니다.
		
		num=15;
		if(num>0) {
			System.out.println("양수");
			if(num>10) {
				System.out.println("10보다 큽니다.");
			}
		}else if(num==0) {
			System.out.println(num);
		}else {
			System.out.println("음수");
		}
		
		
		//Q.num2 값을 저장하고, num2가 짝수인지 홀수인지 판별하는 if문 만들기
		
		int num2=8;
		if(num2%2==0) {
			System.out.println(num2+" : 짝수");
		}else {
			System.out.println(num2+" : 홀수");
		}
		
		// 조건선택 연산자 => if문 변경
		
		int kor=78, eng=80, mat=100;
		int sum=0;
		double avg=0;
		sum=kor+eng+mat;
		avg=sum/3.0;
		if(avg>=80) {
			System.out.println("결과 : 합격");
		}else {
			System.out.println("결과 : 불합격");
		}
		
		
	}

}
