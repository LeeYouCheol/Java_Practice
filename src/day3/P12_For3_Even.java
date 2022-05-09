package day3;

public class P12_For3_Even {

	public static void main(String[] args) {
		/* 1부터 10사이의 짝수를 출력하는 코드를 작성하세요. 
		 * 2	i=1
		 * 4	i=2
		 * 6	i=3
		 * 8	i=4
		 * 10	i=5
		 * 반복횟수 : i는 1부터 5까지 1씩 증가 
		 * 규칙성 : 2*i를 출력
		 * */
		//방법1
		int i;
		for(i = 1; i <= 5; i++) {
			System.out.println(2*i);
		}
		//방법2
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		for(i = 2; i<=10; i +=2) {
			System.out.println(i);
		}
	}
}