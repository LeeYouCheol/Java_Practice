package day5;

public class P9_MultiplicationTable {

	public static void main(String[] args) {
		/* 구구단 7단을 출력하는 코드를 작성하세요. 
		 * 7 X 1 = 7	7 X ? = ??
		 * 7 X 2 = 14	
		 * 7 X 3 = 21	
		 * ...		
		 * 7 X 9 = 63	
		 * 
		 * 반복횟수 : i는 1부터 9까지 1씩 증가
		 * 규칙성 : 7 x i = (7*i) 를 출력
		 * 반복문종료 후 : 없음
		 * */
		int num = 7;
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
		//구구단 2단~9단까지 출력하는 코드를 작성하세요.
		for(int num2 = 2; num2 <= 9; num2++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(num2 + " x " + j + " = " + (num2*j));
			}
		}

	}

}
