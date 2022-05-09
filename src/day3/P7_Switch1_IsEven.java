package day3;

public class P7_Switch1_IsEven {

	public static void main(String[] args) {
		/* 홀수 짝수 판별 예제 
		 * num가 2로 나누었을 때 나머지가 0과 같으면 짝수라고 출력하고
		 * 아니면 홀수라고 출력한다
		 * */
		int num1 = 4;
		if(num1 % 2 == 0){
			System.out.println(num1 + "은 짝수");
		}else {
			System.out.println(num1 + "은 홀수");
		}
		int num2 = 8;
		switch(num2 % 2) {
		case 0:
			System.out.println(num2 + "은 짝수");
			break;
		case 1:
			System.out.println(num2 + "은 홀수");
			break;
		}
		int num3 = 12;
		switch(num3 % 2) {
		case 0:
			System.out.println(num3 + "은 짝수");
			break;
		default:
			System.out.println(num3 + "은 홀수");
		}

	}
}