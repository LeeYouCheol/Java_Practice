package day7;

import java.util.Scanner;

public class P2_Array2_Duplicated {

	public static void main(String[] args) {
		/* 정수 num를 입력받고, 입력받은 정수가 배열에 있는지 없는지 확인하는 코드를 작성하세요. */
		Scanner scan = new Scanner(System.in);
		int arr[]= {1,2,3};
		int num;
		int count;
		System.out.println("정수를 입력하세요 : ");
		num = scan.nextInt();
		count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == num) {
				count++;
			}
			}if(count >= 1) {
				System.out.println("배열에 " + num + "가 있습니다");
			}else {
				System.out.println("배열에 " + num + "가 없습니다.");
		}
	}
}
