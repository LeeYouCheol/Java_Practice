package day1;

public class P2_Type {

	public static void main(String[] args) {
		/* 1. 변수 선언 방법
		 * - 타입 변수명;
		 * 2. 변수 초기화 방법1(변수 선언및 초기화 : 선언과 초기화를 같이하는 방법)
		 * - 타입 변수명 - 초기값;
		 * 3. 변수 초기화 방법2(변수 선언 후 초기화
		 * - 타입 변수명;
		 *   변수명 = 초기값;
		 * */
		byte num1 = 1; //십진수 1을 저장(변수 선언및 초기화)
		short num2 = 020; //8진수 20을 저장, 10진수로 16
		int num3 = 0x26; // 16진수 2를 저장, 십진수로 47
		long num4 = 10L; //십진수 10을 저장. long(타입명)은 뒤에 L이나 l을 붙여야한다.
		System.out.println("십진수 1 : " + num1);
		System.out.println("8진수 20 : " + num2);
		System.out.println("16진수 2F : " + num3);
		
		//문자는 한글자를 의미. '1'은 가능, '11'은 불가능. 문자는 작은따옴표를 사용
		//문자열은 0글자 이상을 의미. 큰타옴표를 사용
		char ch = 'a'; // 문자 변수선언, 초기화. ch에 문자 'a'를 저장.
		
		float num5 = 1.23f; //실수 1.23을 저장, float형이면 뒤에 f나 F를 붙여야한다.
		double num6 = 3.14; //실수 3.14를 저장.
		
		boolean istrue = true; // 참을 저장.
		
		// 변수 선언 규칙
		//변수명은 중복선언 불가능
		//int 1num;  변수명 첫 글자에 숫자사용 불가능
		//int int; 변수명에 예약어 사용 불가
		// 변수명에 '_'와 '$'사용가능.
		int $num1;
		int _num1;

	}

}
