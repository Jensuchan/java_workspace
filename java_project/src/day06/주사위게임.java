package day06;

public class 주사위게임 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6까지 랜덤수
		 * ex)
		 * 주사위 : 3
		 * 3칸 이동 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 이동 => 21칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동 횟수 : 8번 완주 
		 */
		
		int count = 0;
		int arrive = 30;
		int sum = 0;
		
		for(;;) {
			int a = (int)(Math.random()*6)+1;
			sum += a;
			count++;
			if(sum<30) {
				System.out.println("주사위:"+a);
				System.out.println(a+"칸 이동 => "+(arrive-sum)+"칸남았습니다.");
				System.out.println();
			}else {
				System.out.println("주사위:"+a);
				System.out.println(a+"칸 이동 => 도착했습니다.");
				System.out.println("총 이동 횟수 : "+count+"회");
				break;
			}
		}

	}

}
