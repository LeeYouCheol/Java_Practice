package day2;

public class P14_Test2 {

	public static void main(String[] args) {
		/* 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * A는 90이상 100이하
		 * B는 80이상 90미만
		 * C는 70이상 80미만
		 * D는 60이상 70미만
		 * F는 0이상 60미만
		 * 0미만, 100초과인 경우 잘못된 성적이라고 출력하도록 수정하세요
		 * */
		int score = -1;
		if(score >= 90 && score <= 100) {
			System.out.println(score + "점은 A학점 입니다.");
		}else if(score >= 80 && score < 90) {
			System.out.println(score + "점은 B학점 입니다.");
		}else if(score >= 70 && score < 80) {
			System.out.println(score + "점은 C학점 입니다.");
		}else if(score >= 60 && score < 70) {
			System.out.println(score + "점은 D학점 입니다.");
		}else if(score >= 0 && score < 60) {
			System.out.println(score + "점은 F학점 입니다.");
		}else {
			System.out.println("잘못된 성적 입니다.");
		}
		//다른방법
		int score1 = 64;
		if(score1 < 0 || score1 >100) {
			System.out.println("잘못된 성적 입니다.");
		}else if(score1 >= 90) {
			System.out.println(score1 + "점은 A학점 입니다.");
		}else if(score1 >= 80) {
			System.out.println(score1 + "점은 B학점 입니다.");
		}else if(score1 >= 70) {
			System.out.println(score1 + "점은 C학점 입니다.");
		}else if(score1 >= 60) {
			System.out.println(score1 + "점은 D학점 입니다.");
		}else {
			System.out.println(score1 + "점은 F학점 입니다.");
		}

	}
}