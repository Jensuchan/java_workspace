package day05;

public class Array02 {

	public static void main(String[] args) {
		/* Array 예제
		 * 5개의 값을 가지는 배열을 생성
		 * 1~50사이의 랜덤값을 저장한 후 출력
		 */
		
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {      // 0 1 2 3 4  
			arr[i] = (int)(Math.random()*50)+1;
			System.out.print(arr[i]+" "); // 한번에 출력
		}
		System.out.println();
		System.out.println("------------------");
		
		//정렬(오름차순) 교환
		//이중 for문 필요
		
		
		for(int i=0; i<arr.length-1; i++) { //마지막까지 비교할 필요없음
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) { //오름차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				//내림차순은 부등호 반대로
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//향상된 for문
		System.out.println();
		System.out.println("향상된 for>");
		
		for(int tmp: arr) {    // 완성되어있는 배열을 탐색정도만 할수있음 // 변환 교환 불가능
			System.out.print(tmp+" ");
		}
	}

}
