package day01;

public class 변수 {

	public static void main(String[] args) {
		/*변수 선언
		 * 자료형(타입) 변수명;
		 * 변수 선언 + 초기화
		 * 자료형(타입) 변수명 = 값;
		 * */
		int num=123;//선언+초기화
		System.out.println(num);
		System.out.println();
		
		// int num=456; 중복선언 불가능
		
		num=456; // = 대입연산자 : 앞의 변수에 뒤에 있는 값을 저장(덮어쓰기)
		System.out.println(num);
		
		int num1=78, num2=45, num3=89; //같은 자료형에서는 가능
		
		num1=789;
		System.out.println(num1); //노란밑줄 : 한번도 사용된 적이 없는 변수
		                          //빨간밑줄 : 에러
		
		//8개의 기본 자료형은 지역변수 범위(scope) {  }
		
		//명령어 {}
		if(true) {
			int a=10;
			System.out.println(a);
			
		}
		//System.out.println(a); {}가 끝났기 때문에 a변수는 소멸
		//a변수를 출력하고싶으면 if문 이전에 선언을 하면 됨
		
		//char 한글자만 저장 가능 char='';
		char ch='a'; // "" =>문자열(String) / '' =>한글자(char)
		double dou=3.0;
		byte b=1;
		boolean boo=true; //true, false로만 저장 가능
		
		/*float / long 자료형은 접미사를 반드시 붙여야 인식됨
		 * float(f F) long(l L)
		 */
		float f=1.2f;
		long l=1L; //일반적으로 대문자를 사용 / 1과 l의 인식구별을 위해
		
		num2 =010; //8진수로 인식(0~7까지 8=>10)
		System.out.println(num2);
		
		num3=0x10; //16진수로 인식(0~15(ABCDEF)까지 16=>10)
		System.out.println(num3);
		
		//+ - * / %(나머지)
		
		/*국어점수(kor), 영어점수(eng), 수학점수(math) 변수를 선언하고
		 * 값을 입력하여, 세 점수의 합을 콘솔에 출력
		 */
		
		int kor=100, eng=100, math=100;
		int sum=kor+eng+math;
		System.out.println("국어, 영어, 수학점수 합계 : "+sum+"점"); // + 연결연산자
		
	
			
		}
		
	}
	//num1 =123; 에러 (num1값을 찾을수 없음)

