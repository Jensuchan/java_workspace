package day04;

import java.util.Scanner;

public class 과제다른풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum=0;
		int high=0;
		System.out.println("차례대로 점수를 입력해주세요.(5개)");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
			if(high<arr[i]) {
				high=arr[i];
			}
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum/5.0);
		System.out.println("최고점수 : "+high);
		
		
		scan.close();

	}

}
