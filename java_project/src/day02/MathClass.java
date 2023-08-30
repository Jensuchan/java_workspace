package day02;

public class MathClass {

	public static void main(String[] args) {
		/*Math. method(함수)
		 *반올림(Math.round) : 소수점의 자리수는 무조건 0
		 *올림(Math.ceil), 버림(Math.floor) : 소수점 자리수 0
		 */
		
		double num=34.6666666;
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		
		//Math.max 최대값, Math.min 최소값
		System.out.println(Math.max(5, 3));
		System.out.println(Math.min(5, 3));
		
		
		/*Math.random : 0과 1 사이의 아무 값을 리턴
		 *0<=random<1
		 *(int)(Math.random()*10)+1 : 1부터 10개의 정수를 얻는 공식 
		 */
		System.out.println(Math.random()); //0은 포함, 1은 미포함
		System.out.println((int)(Math.random()*10)+1);
		
		
		

	}

}
