package day05;

import java.util.Scanner;

public class 지난과제풀이 {

	public static void main(String[] args) { //메모리의 처음으로 바로 올라감(일반변수라 참조변수보다 특별한 공간)
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와 평균을 출력
		 * 최고점수
		 * 입력 => Scanner
		 * 배열 생성
		 * for문을 활용하여 입력받은 점수를 저장
		 * 최대값 if / Math.max
		 */
		
		Scanner scan = new Scanner(System.in);
		int size = 5;
		int arr[] = new int[size]; // 78 90 85 75 69
		int sum=0;
		double avg=0;
		int max=0;
		int max1=0;
		int min=100;
		int min1=100;
		
		System.out.println("점수를 입력해주세요. (5명)");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i]; // 0+78+90+85+75+69
			//최대값
			if(max<arr[i]) {
				max=arr[i]; // 0<=78<=90
			}
			//최소값
			if(min>arr[i]) {
				min=arr[i];
			}
			//Math.max(min)
			max1 = Math.max(max1, arr[i]);
			min1 = Math.min(min1, arr[i]);
		}
		avg = (double)sum / arr.length;
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
		System.out.println("최고점수:"+max);
		System.out.println("Math.최고점수:"+max1);
		System.out.println("최저점수:"+min);
		System.out.println("Math.최저점수:"+min1);
	
		scan.close();

	}

}
