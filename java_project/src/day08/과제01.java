package day08;

import java.util.Scanner;

public class 과제01 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 랜덤으로 생성(1~9까지) => 중복X
		 * user가 3자리 숫자를 맞추는 게임.
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball, 아무것도 없으면 out
		 * => 3 5 7
		 *    3 6 7 => 2s
		 *    
		 *    3 5 7
		 *    3 7 6 => 1s 1b
		 *    
		 *    3 5 7
		 *    7 3 5 => 3b
		 *    
		 *    3 5 7
		 *    1 2 6 => out
		 *    
		 *    --야구게임 시작--
		 *    컴퓨터가 숫자를 정했습니다.
		 *    숫자 입력(1~9, 3자리) :
		 *    3 4 5
		 *    결과
		 *    3s 다맞으면 종료 (게임 횟수 출력) 
		 *
		 */
		
		int[] comNum = new int[3];
		int[] myNum = new int[3];
		randomArray(comNum);
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<comNum.length; i++) {
			System.out.print(comNum[i]+" ");
		}
		System.out.println("컴퓨터가 숫자를 정했습니다. 숫자를 입력해주세요.(1~9, 3자리)");
		for(int i=0; i<myNum.length; i++) {
			myNum[i] = scan.nextInt();
		}
		int ball = 0;
		int strike = 0;
		for(int i=0; i<comNum.length; i++) {
			for(int j=0; j<myNum.length; j++) {
				if(comNum[i]==myNum[j] && i==j) {
					strike++;
				}else if(comNum[i]==myNum[j] && i != j) {
					ball++;
				}	
			}
		}
		System.out.println("스트라이크 :"+ strike+"개");
		System.out.println("볼 :"+ball+"개");
		System.out.println("프로그램 종료");
		
 
	}
	
	//
	public static int random() {
		return (int)(Math.random()*9)+1;
	}
	//
	
	//
	public static void randomArray(int arr[]) {
		int i=0;
		while(i<arr.length) {
			int r= random();
			if(!isContain(arr,r)) {
				arr[i]=r;
				i++;
			}
		}
    }
	//
	
	//
	public static boolean isContain(int arr[], int random) {
		for(int tmp : arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
	}
	//
	
	//
	
	
}
