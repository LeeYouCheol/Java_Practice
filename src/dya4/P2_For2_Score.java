package dya4;

import java.util.Scanner;

public class P2_For2_Score {

	public static void main(String[] args) {
		/* 3명의 국어 점수를 입력받아 총점과 평균을 구하는 코드를 작성하세요. 반복문 이용
		 * 단, 총점과 평균만 알면 됨. => 총점과 평균을 구한 후 각 학생의 점수를 기억할 필요가 없다 
		 * 반복문 활용이 잘 안되는 분은 반복문 없이 해보고 다 한 후 반복문으로 변경해보세요.
		 * 
		 * 반복횟수 : 3번
		 * 			i는 1부터 3까지 1씩 증가
		 * 규칙성 : 성적을 입력받고 총점에 누적 
		 *  	   Scanner를 이용하여 정수를 입력받아 num에 저장한 후,
		 *  	   sum에 num를 더해서 sum에 저장
		 * 반복문 종료 후 : 총점을 출력하고, 총점을 이용하여 평균을 계산 한 후, 총점을 출력
		 *               sum을 출력하고, sum을 3으로 나누어서 avg에 저장한 후, avg을 출력
		 * */
		Scanner scan = new Scanner(System.in);
		
		int i;
		int num;
		int sum = 0;
		double avg;
		for(i = 1; i<=3; i++) {
			System.out.println("학생" + i + "의 국어 성적 : ");
			num = scan.nextInt();
			sum += num;
		}
		System.out.println("학생 3명의 국어 총점 : " + sum);
		avg = sum / (double)3;
		System.out.println("학생 3명의 국어 평균 : " + avg);
		scan.close();
	}

}
