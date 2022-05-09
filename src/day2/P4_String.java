package day2;

public class P4_String {

	public static void main(String[] args) {
		/* 문자열 + 문자열 = 문자열
		 * 문자열 + 정수 = 문자열
		 * 문자열 + 문자 = 문자열
		 * 문자열 + 실수 = 문자열
		 * 문자열 + 논리형 = 문자열
		 * */
			String str = "Hello";
			str = str + "world";
			System.out.println(str);
			str = str + '!';
			System.out.println(str);
			str = str + 123;
			System.out.println(str);
			str = str + 3.45;
			System.out.println(str); //정수가 더해진게아니라 이어서 써진것이다. 문자열취급.
			str = str + true;
			System.out.println(str);
	}

}
