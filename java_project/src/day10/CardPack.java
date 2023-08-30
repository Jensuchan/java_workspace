package day10;

public class CardPack {
	
	/* CardPack 클래스 
	 * - 카드팩 : 52장의 카드들
	 * 
	 * 멤버변수 : 카드를 52장 담을 수 있는 배열
	 * 생성자 : 52장의 카드를 모두 생성
	 * 메서드 :
	 *  - 카드를 섞는 기능
	 *  - 카드를 한장 빼내는 기능
	 *  - 카드 출력 => Card 클래스의 print메서드 사용
	 *  - 카드 초기화 메서드
	 */
	
	//멤버변수
	private Card pack[] = new Card[52];
	private int cnt = 0; //pack 배열의 index 체크용 // 멤버변수로 배열을 만들 때에는 index 멤버변수를 만드는게 편하다
	
	//생성자
	public CardPack() {
		// ♥(1~13) ♣(1~13) ♠(1~13) ◆(1~13)
		char shape = '♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: shape = '♥';
				break;
			case 2: shape = '♣';
				break;
			case 3: shape = '♠';
				break;
			case 4: shape = '◆';
				break;
			}
			for(int j=1; j<=13; j++) { //숫자
				Card c = new Card(); //카드 1장 생성
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
		}
	}

	/*  메서드:
	 *  - 카드를 섞는 기능
	 *  - 카드를 한장 빼내는 기능
	 *  - 카드 출력 => Card 클래스의 print메서드 사용
	 *  - 카드 초기화 메서드
	 */
	public void shuffle() {
		for(int i=0; i<pack.length; i++) {
			int random = (int)(Math.random()*51);
			Card tmp = pack[i];
			pack[i] = pack[random];
			pack[random] = tmp;
		}
	}
	
	//카드 한장 빼내는 메서드
	//리턴타입 Card (카드1장)
	public Card pick() {
		if(cnt == 0) {
			return null;
		}
		cnt--;
		return pack[cnt]; //52
	}
	
	//카드 초기화 메서드 : cnt만 마지막으로 다시 보내기
	public void init() {
		cnt =52;
	}
	
	
	
	
	
	
	
	
	//getter/setter
	public Card[] getPack() {
		return pack;
	}
	
	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	
	public int getCnt() {
		return cnt;
	}
	
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
	
}