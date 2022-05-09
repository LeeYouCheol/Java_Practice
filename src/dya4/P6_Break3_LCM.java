package dya4;

public class P6_Break3_LCM {

	public static void main(String[] args) {
		/* 두 정수의 최소 공배수를 구하는 예제를 작성하세요.
		 * 공배수 : 두 정수에 공통으로 있는 배수
		 * 최소 공배수 : 두 정수의 공배수중 최소값
		 * 10의 배수 : 10 20 30 40 50 60 ....
		 * 15의 배수 : 15 30 45 60 75 90 ....
		 * 10과 15의 공배수 : 30 60 90 ...
		 * 10과 15의 최소 공배수 : 30
		 * 
		 * 반복횟수 : i는 1부터 i는 num1*num2까지 1씩 증가
		 * 규칙성 : i가 num1의 배수이고 i가 num2의 배수이면 i를 출력하고 반복문 종료
		 * 		  i를 num1으로 나누었을 때 나머지가 0과 같고 i를 num2로 나누었을 때 나머지가 0과 같다면 i를 출력하고 반복문종료
		 * 반복문 종료 후 : 없음
		 * */
		int i;
		int num1 = 10;
		int num2 = 15;
		for(i = 1; i<=num1*num2; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(num1 + "과 " + num2 + "의 최소 공배수 : " + i);
				break;
			}
		}
	}

}
