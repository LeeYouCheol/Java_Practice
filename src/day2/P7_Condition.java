package day2;

public class P7_Condition {

	public static void main(String[] args) {
		/* 조건 선택 연산자 예제
		 * (조건식) ? 참일때 값 : 거짓일 때 값;
		 * 성적이 A학점이면 A학점으로 출력하고, 아니면 A학점이 아님으로 출력하는 예제
		 * */
		int score = 90;
		String isA = (score >= 90 && score <= 100)? "A학점" : "A학점 아님";
		System.out.println(score + " 점은 " + isA);
		
		int score2 = 85;
		String isB = (score2 >= 80 && score2 < 90)? "B학점" : "B학점 아님";
		System.out.println(score2 + " 점은 " + isB);
		
		int score3 = 75;
		String isC= (score3 >= 70 && score3 < 80)? "C학점" : "C학점 아님";
		System.out.println(score3 + " 점은 " + isC);

	}

}
