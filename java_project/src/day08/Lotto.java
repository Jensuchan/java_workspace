package day08;

public class Lotto {

	public static void main(String[] args) {
		/* 로또번호 생성 (1~45 랜덤으로 생성)
		 * 로또번호 => 1~45까지 6개 => 사용자번호
		 * 당첨번호 => 1~45까지 7개 => 보너스번호
		 * 
		 * 로또번호 (6자리)         1 2 3 4 5 6
		 * 당첨번호 (6자리+1자리)     1 2 3 4 5 6 [7]
		 * 로또번호는 중복되면 안됨.
		 * 로또 등수 확인
		 * 1등 => 6자리 일치
		 * 2등 => 5자리 일치 + 보너스번호일치
		 * 3등 => 5자리 일치
		 * 4등 => 4자리 일치
		 * 5등 => 3자리 일치
		 * 꽝~!!
		 */
		
		System.out.println("당첨번호 + 보너스번호 > ");
		int[] win = winNum();
		for(int i=0; i<win.length-1; i++) {
			System.out.print(win[i]+" ");
		}
		System.out.print("["+win[6]+"]");
		System.out.println();
		System.out.println("내 번호 > ");
		int[] mine = myNum();
		System.out.println();
		check();

	}
	public static int[] winNum() {
		int[] win = new int[7];
		for(int i=0; i<win.length; i++) {
			win[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(win[i] == win[j]) {
					i--;
					break;
				}
			}
		}
		
		return win;
	}
	
	public static int[] myNum() {
		int[] mine = new int[6];
		for(int i=0; i<mine.length; i++) {
			mine[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(mine[i] == mine[j]) {
					i--;
					break;
				}
			}
		}
		return mine;
	}
	public static void check() {
		int count = 0;
		int second =0;
		int[] win = winNum();
		int[] mine = myNum();
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(win[i] == mine[j]) {
					count++;
				}else if(win[6]==mine[j]) {
					second++;
				}
			}
		}
		if(count==6) {
			System.out.println("1등입니다.");
		}else if(count==5 && second ==1) {
			System.out.println("2등입니다.");
		}else if(count==5) {
			System.out.println("3등입니다.");
		}else if(count==4) {
			System.out.println("4등입니다.");
		}else if(count==3) {
			System.out.println("5등입니다.");
		}else {
			System.out.println("꽝~!!");
		}
	}

}
