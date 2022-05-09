package day6;

public class P8_Array6_Divisor {

	public static void main(String[] args) {
		/* 정수 num의 약수를 배열에 저장 한 후, 출력하는 코드를 작성하세요.
		 * 약수는 최대 10개만 저장 
		 * */
		int num = 12;
		int max = 10;
		int []div = new int[max];
		int count = 0;
		for(int i = 1; i <=num; i++) {
			if(num % i == 0) {
				if(count < max) {
					div[count] = i;
					count++;
				}
			}
		}
		for(int i = 0; i <count; i++) {
			System.out.println(div[i] + " ");
		}

	}

}
