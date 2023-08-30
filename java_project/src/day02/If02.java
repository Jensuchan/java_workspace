package day02;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		/* Q. 국어, 영어, 수학 점수를 입력받아서
		 * 합계, 평균, 평가를 출력
		 * 평가는 평균이 90이상이면 A
		 *      평균이 80이상이면 B
		 *      평균이 70이상이면 C
		 *      나머지는 D
		 * 입력값이 0보다 작거나 100보다 크면 잘못된 값
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		System.out.println("국어성적 > ");
		int kor=scan.nextInt();
		if(kor<0||kor>100) {
			System.out.println("잘못된 값입니다.");
		}
		System.out.println("영어성적 > ");
		int eng=scan.nextInt();
		if(eng<0||eng>100) {
			System.out.println("잘못된 값입니다.");
		}
		System.out.println("수학성적 > ");
		int mat=scan.nextInt();
		if(mat<0||mat>100) {
			System.out.println("잘못된 값입니다.");
		}
		
		int sum=0;
		double aver=0;
		sum=kor+eng+mat;
		aver=sum/3;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+aver);
		if(aver>=90) {
			System.out.println("A");
		}else if(aver>=80) {
			System.out.println("B");
		}else if(aver>=70){
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		scan.close();
		
		
		
		/*강사님 풀이
	    Scanner scan=new Scanner(System.in);
	    //입력 안내문자
		System.out.println("정수 입력(0~100) : 국어, 영어, 수학 순으로 입력.");
		
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		if(kor<0||kor>100) {
			System.out.println("국어점수가 입력 범위를 벗어났습니다.");
		}
		if(eng<0||eng>100) {
			System.out.println("영어점수가 입력 범위를 벗어났습니다.");
		}
		if(math<0||math>100) {
			System.out.println("수학점수가 입력 범위를 벗어났습니다.");
		}
		int sum=kor+eng+math;
		double avg=sum/3.0;
		System.out.println("합계:"+sum+", 평균:"+avg);
		char ch = 'D'; //char 형태는 ''
		if(avg>100||avg<0) {
			System.out.println("잘못된 성적");
		}else if(avg>=90) {
			ch='A';
		}else if(avg>=80) {
			ch='B';
		}else if(avg>=70) {
			ch='C';
		}else {
			ch='D';
		}
		System.out.println("평가:"+ch);
		scan.close();
		*/
	}

}
