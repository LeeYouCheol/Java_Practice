package dya4;

public class P10_While2_Sum {

	public static void main(String[] args) {
		/* 1~5까지의 누적합합을 구하는 코드를 while문을 이용하여 작성하세요.
		 * */
		int i = 1;
		int sum = 0;
		while(i <= 5) {
			sum += i;
			i++;
		}System.out.println(sum);
	}

}
