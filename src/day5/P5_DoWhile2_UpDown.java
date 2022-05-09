package day5;

import java.util.Scanner;

public class P5_DoWhile2_UpDown {

	public static void main(String[] args) {
		/* 랜덤으로 생성한 수(1~100)를 맞추는 게임을 작성하세요.
		 * 정수를 입력했을 때 입력한 정수보다 랜덤으로 생성된 수가 크면 UP, 작으면 DOWN을 표시,
		 * 맞으면 맞췄습니다라고 표시
		 * 랜덤으로 생성한 수 : 40
		 * 입력 : 100
		 * DOWN
		 * 입력 : 50
		 * DOWN
		 * 입력 : 25
		 * UP
		 * 입력 : 40
		 * 정답입니다.
		 * 
		 **/
		int min = 1, max = 100;
		int r = (int)(Math.random() * (max-min+1) + min);
		Scanner scan = new Scanner(System.in);
		System.out.println("랜덤한 수 생성 : " + r);
		int num;
		
		do {
			System.out.println("정수를 입력하세요 : ");
			num = scan.nextInt();
			if(num < 0 || num > 100) {
				continue;
			}if(num > r) {
				System.out.println("Down");
			}else if(num < r){
				System.out.println("Up");
			}
		}while(num != r);
		System.out.println("정답입니다.");
	}
}