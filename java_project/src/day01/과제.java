package day01;

public class 과제 {

	public static void main(String[] args) {
		/*매일 마지막 시간 과제 출제
		 * 카페에 제출
		 * 국어, 영어, 수학의 점수 합계와 평균을 출력
		 * 조건선택 연산자 이용하여
		 * 평균이 80이상이면 결과: 합격, 아니면 결과: 불합격 출력 
		 */
		
		int kor=100, eng=100, mat=90, sum=kor+eng+mat;
		double aver=(double)sum/3;
		System.out.println("합계: "+sum);
		System.out.println("평균: "+aver);
		System.out.println(aver>=80?"결과: 합격":"결과: 불합격");
		
		
		int a=78, b=45, c=23;
		//지역변수는 반드시 초기화를 해야한다.
		int sum1=0;
		double avg=0;
		sum1=a+b+c;
		avg=sum1/3.0;
		System.out.println("합계: "+sum1+", 평균: "+avg);
		System.out.println("결과: "+(avg>=80?"합격":"불합격"));
		
		

	}

}
