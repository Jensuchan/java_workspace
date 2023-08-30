package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와 평균을 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int sum=0;
		System.out.println("점수를 입력해주세요.");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			sum+=arr[i];
		}System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum/5.0);
		System.out.println("최고점수 : "+Math.max(Math.max(arr[0], arr[1]), Math.max(arr[2], Math.max(arr[3], arr[4]))));
		
		
		
		scan.close();

	}

}
