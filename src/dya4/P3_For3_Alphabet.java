package dya4;

public class P3_For3_Alphabet {

	public static void main(String[] args) {
		/* 반복문을 이용하여 a부터 z까지 출력하는 코드를 작성하세요.
		 * 
		 * 반복횟수 : 26번
		 * 			i는 0부터 26보다 작을때까지 1씩증가
		 * 규칙성 :  (char)('a'+i)를 출력
		 * 반복문 종료 후 : 없음
		 * */
		char i;
		for(i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}System.out.println();
		int num1 = 1;
		char ch1 = 'a' + 1;
		System.out.println(ch1); //출력값이 b로 나온다. 리터럴 상수1은 char타입이어서 타입변환이 발생하지 않는다.
		char ch2 = (char)('a' + num1);
		System.out.println(ch2); //num1의 1은 int 타입이어서 타입변환이 발생한다. 자동타입변환이 되지 않은 상황이어서 에러가 발생.
									// 때문에 강제타입변환을 해준다.
	}

}
