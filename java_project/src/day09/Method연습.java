package day09;

public class Method연습 {

	public static void main(String[] args) {
		/* 정리
		 * 1. 변수
		 *  - 일반변수(지역변수, 기본형변수) : 값을 저장하는 기본 메모리공간
		 *     - 정수형 : int, byte, short, long(접미사 l(L))
		 *     - 실수형 : double, float(접미사 f(F))
		 *     - 정수형(문자) : char(정수형, 아스키코드 문자표에 저장되어 있는 코드로 저장) : 1글자
		 *     - 논리형 : boolean(true, false)
		 *  - 참조변수 : 객체의 주소를 저장하는 변수(객체명) : new 키워드를 통해 객체 생성
		 *     - 힙 영역에 객체가 생성, 스택영역에 객체의 주소를 연결
		 *     - 기본형(일반변수)를 제외한 모든 형태는 참조변수
		 *  - 자료형 변환 : 변수, 상수, 리터럴 값들을 일시적으로 다른 자료형으로 변환
		 *     - 자동형변환 : 정수 -> 실수, 작은공간 -> 큰공간
		 *     - 명시적형변환 : 자동형변환이 안되는 형태 -> (자료형)변수명
		 *     
		 * 2. 연산자
		 *  > 대입연산자 (=)
		 *   - 오른쪽에 있는 값을 왼쪽 변수에 저장
		 *   - 왼쪽에는 반드시 저장가능한 변수 /객체 형태여야 함
		 *   - 왼쪽과 오른쪽의 자료형은 반드시 같아야 함.
		 *  > 산술연산자 (+ - * / %)
		 *   - 정수 / 정수 = 정수
		 *   - / 0 으로 나누면 에러발생, 0으로 나눌 수 없음
		 *  > 비교연산자 (>=, <=, >, <, ==, !=)
		 *   - 항상 결과가 true, false
		 *  > 논리연산자 (&&, ||, !)
		 *   - && : and, 둘 다 만족해야 true ~이고, ~면서
		 *   - || : or, 둘 중 하나만 만족하면 true ~이거나, ~또는
		 *   - ! : not, 반대    
		 *  > 증감연산자 (++, --)
		 *   - 1씩 증가, 1씩 감소
		 *   - 위치에 따라 증가가 먼저 되거나, 출력이 먼저 되거나 순서가 결정됨.
		 *   - i++ , ++i
		 *  > 조건선택연산자 (조건식? true : false)
		 *   - 조건식이 참이면 true, 아니면 false를 선택
		 *   - 간편한 형태의 if 역할
		 *   
		 * 3. 조건문
		 *  - if, switch
		 *   - if(조건식) : 조건식은 반드시 true/false로 구분이 되어야 함.
		 *   - switch(값/식) : 값이 나오는 식, 변수
		 *    - 하나의 case가 끝나면 break;로 닫아줘야 함.
		 *    - break를 생략하면 하위 모든 case 실행
		 *    
		 * 4. 반복문 : 반복을 결정하는 식
		 *  - for, while, do~while: 조건식을 true로 작성
		 *  - for, while문은 조건식에 따라서 한번도 실행이 안될 수도 있음.
		 *  - do~while문은 한번은 무조건 실행됨.
		 *  
		 * 5. break, continue문
		 *  > break문 : 반복문을 빠져나가기 위한 구문 / if문을 같이 동반하게 됨.
		 *  > continue문 : pass하는 역할
		 *   - 조건이 맞을 때 실행하지 않고, 다음 증감으로 이동
		 *   - while문에서는 증감식이 실행문안에 포함되기 때문에 조건식 안에서 증감식을 찾지
		 *     못하는 경우 무한루프에 빠질 수 있음.
		 *     
		 * 6. 배열
		 *  - 동일한 자료형을 가진 데이터를 모아놓은 형태
		 *  - 배열 선언, 초기화
		 *  - 자료형 배열명[] = new 자료형[개수];
		 *  - int arr[] = new int[10];
		 *  - 배열의 index는 0번지부터 시작
		 *  - 배열의 총길이는 length로 확인가능 배열.length
		 *  - 배열[index] = 값; //배열의 index번지에 값을 저장
		 *  - 변수 = 배열[index]; // 변수로 배열의 index번지 값을 가져오기
		 *  
		 * 7. 메서드
		 *  > 메서드 : 기능.(특정 기능을 하는 하나의 명령문)
		 *    접근제한자 리턴타입 메서드명(매개변수){
		 *    실행문;
		 *    }
		 *  > 접근제한자(제어자) :
		 *   - public : 모두 사용 가능 => 메서드는 public으로 선언
		 *   - protected : 나 + 패키지 + 자식클래스
		 *   - (default) : 나 + 패키지
		 *   - private : 나 => 멤버변수는 private으로 선언 
		 *   
		 *  > static : 메모리에 가장 먼저 올라가는 키워드
		 *   - 메서드에 static이 있으면 클래스메서드라고 부름
		 *   - static이 있으면 객체생성을 하지 않고 클래스메서드 또는 클래스변수를 호출가능
		 *   - static => 클래스명.메서드(), 클래스명.변수() 사용
		 *        
		 *  > 리턴타입 : 메서드를 실행한 후 결과값을 돌려주는 형태
		 *   - 자료형으로만 사용
		 *   - 결과값이 없을경우 void
		 *   - return 값;
		 *   
		 *  > 매개변수 : 메서드를 사용할 때 필요한 값을 넣어주는 형태
		 *   - 메서드의 같은 값을 유지하기 위해 필요
		 *   - 자료형 변수명, 자료형 변수명
		 *   
		 *  > return : 메서드의 결과를 돌려주기  위한 키워드
		 *   - 메서드를 종료하는 키워드
		 *   - 변수 여러개를 리턴할 수는 없다.
		 *   
		 * > 메서드는 하나의 기능만을 기준으로 만들어주는 것을 원칙
		 * 
		 * 8. 클래스 - 설계도
		 *  > 객체를 생성하기 위한 설계도
		 *  > 메서드 : 기능
		 *  > 클래스의 구성정보
		 *   - 속성 : 멤버변수
		 *   - 기능 : 메서드
		 *   
		 *  > 접근제한자 class 클래스명{
		 *    //클래스명은 반드시 대문자로 시작
		 *    }
		 *    
		 *  > 변수, 객체, 메서드명은 소문자로 시작
		 *   - 객체 선언
		 *     클래스명 객체명 = new 클래스명();
		 *   - 메서드 사용
		 *     객체명.메서드명();
		 *   - 멤버변수 사용
		 *     객체명.멤버변수(); => 일반적으로 멤버변수는 private으로 선언되기 때문에 보통은 호출 불가능
		 *   - getter/setter 메서드를 만들어 private의 멤버변수에 접근
		 *   
		 *  > 같은 클래스안에서 메서드를 호출할 때는 메서드명으로 호출 => 메서드명(); 
		 *  > 다른 클래스안에서 메서드를 호출할 때는 객체명을 이용하여 호출 => 객체명.메서드명();       
		 *               
		 */

	}

}
