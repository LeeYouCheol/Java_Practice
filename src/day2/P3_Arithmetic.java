package day2;

public class P3_Arithmetic {

	public static void main(String[] args) {
		/* 산술연산자 주의사항 : 나누기할 때 소수점 사라지는 현상 조심
		 * 정수 연산자 정수 => 정수
		 * 5 + 2 = 7
		 * 5 - 2 = 3
		 * 5 * 2 = 10
		 * 5 % 2 = 1
		 * 5 / 2 = 2  : 나누는 수가 정수이기 때문에 2.5가 아니라 2가 나온다.
		 * 정수 연산자 실수 => 실수
		 * 실수 연산자 실수 => 실수
		 * 결가과값이 어떠한 수
		 * */
		System.out.println(5 + 2);
		System.out.println(5 - 2);
		System.out.println(5 * 2);
		System.out.println(5 % 2);
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		System.out.println(5 / (double)2);
		//0으로 나눈 경우 예외가 발생할수 있다.
		//이건 안된다. System.out.println(5 / 0);
		System.out.println(5 / 0.0); // .0을 붙이면 무한대가 나온다.
		//나머지 연산자도 마찬가지 System.out.println(5 % 0);
		System.out.println(5 % 0.0); //NaN 이 나온다.

	}

}
