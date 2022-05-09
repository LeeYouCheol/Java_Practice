package day3;

import java.util.Scanner;

public class P3_Scanner3 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자(+ - * / %)를 입력받아 출력하는 코드를 작성하세요.
		 * 산술연산자는 문자로 받아주세요.
		 * 
		 * 방법1.
		 * 정수1을 입력하세요 : 1
		 * 정수2를 입력하세요 : 2
		 * 산술 연산자를 입력하세요 : +
		 * 1+2
		 * 
		 * 방법2.
		 * 두정수와 산술연산자를 입력하세요(예: 1 + 2) : 1 + 2
		 * 1+2
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수1을 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println("정수2를 입력하세요 : ");
		double num2 = scan.nextDouble();
		System.out.println("산술 연산자를 입력하세요 : ");
		char op = scan.next().charAt(0);
		System.out.println("" + num1 + op + num2);
		
		// 정수 + 정수 => 정수
		//+는 유니코드표에서 십진수 43에 해당
		// 문자열 + 정수 => 문자열
		
		scan.close();

	}

}
