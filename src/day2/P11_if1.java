package day2;

public class P11_if1 {

	public static void main(String[] args) {
		if(true) {
			System.out.println("참 입니다.");
		}
		/* 조건문이 거짓이기 때문에 실행이 안되는 경우
		 * if(flase){
		 * 	 	System.out.println("참입니다.");
		 * }
		 * */
		/* num가 짝수이면 짝수라고 출력하는 코드를 if문을 이용하여 작성하세요
		 * */
		int num = 2;
		if(num % 2 == 0) {
			System.out.println(num + "는 " + "짝수");
		}
		/* score가 90점이상이고, 100점이하이면 A학점이라고 출력하는 코드를 if문을 이용하요 작성하세요*/
		int score = 90;
		if(score >= 90 && score <= 100) {
			System.out.println(score + "점은 A학점 입니다.");
		}
	}

}
