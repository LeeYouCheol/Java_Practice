package day1;

public class P4_Casting {

	public static void main(String[] args) {
			/* 1. 자동 타입변환
			 * 	- 작은 타입의 값을 큰 타입에 저장하는 경우
			 * 2. 강제 타입변환
			 * 	- 큰 타입의 값을 작은 타입에 저장하는 경우
			 * 	- 계산을 위해 특정값을 일시적으로 변환하는 경우(나누기할때)
			 * */
			//자동 타입변환의 예시
			byte num1_1 = 1;
			int num1_2 = num1_1;
			double num1_3 = num1_2;
		
			//강제 타입변환의 예
			int num2_1 = 1;
			byte num2_2 = (byte)num2_1;
			num2_1 = (int)1.23;
		
			//강제 타입변환의 예 : 계산을 위해 특정값을 일시적으로 변환하는 경우
			double num3_1 = 1/2; // 1/2는 0.5가 아니라 0, 실수가 아닌 정수는 소수점 단위를 표현하지 못하기 때문.
			double num3_2 = (double)1/2; // 1.0은/2는 0.5
			System.out.println(num3_1);
			System.out.println(num3_2);
		
			//자동 타입변환의 예 : 연산과정
			int num4_1 = 1;
			double num4_2 = 1.23;
		
			double num4_3 = num4_1 + num4_2;
			//num4_1과 더하는 값이 실수 이기 때문에 num1을 실수로 자동 타입변환을 한후 실수+실수로 계산하여 num4_3에 저장.
		
			double num4_4 = num4_1 +5;
			//num4_1과 더하는 값이 정수이기 때문에 정수 + 정수를 한후 더한 값을 실수로 자동 타입변환하여 num4_4에 저장.
		
			System.out.println(num4_3);
			System.out.println(num4_4);
			
			//P.55~56 정수를 실수로 자동형변환할때 정밀도가 떨어질수있다. int -> float
			//int -> float 으로 하지말고 double로 하자.
			//1234567890 출력 예시.
			int num5_1 = 1234567890;
			float num5_2 = num5_1; //자동 타입변환
			int num5_3 = (int)num5_2; //강제 타입변환
			
			System.out.println(num5_1); //정수이기 때문에 그대로 출력
			System.out.println(num5_2); //정수를 실수로 자동 타입변환. 자릿수를 표현하기에 한계가 나타남
			System.out.println(num5_3); //실수를 정수로 강제타입변환. 같은이유.
			
	}

}
