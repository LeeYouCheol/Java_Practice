package day3;

import java.util.Scanner;

public class P4_If1 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		 * 방법2 예제코드를 가져옴
		 * 
		 * op1이 +이면 num3 + num4를 출력하고,
		 * op1이 -이면 num3 - num4를 출력하고,
		 * op1이 *이면 num3 * num4를 출력하고,
		 * op1이 /이면 num3 / num4를 출력하고,
		 * op1이 %이면 num3 % num4를 출력하고,
		 * op1이 산술연산자가 아니면 op1은 산술연산자가 아니라고 출력
		 * 
		 * 두정수와 산술연산자를 입력하세요(예: 1 + 2) : 1 + 2
		 * 1+2=3
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수와 산술연산자를 입력하세요(1 + 2) : ");
		int num1 = scan.nextInt();
		char op = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		
		if(op == '+') {
			System.out.println("" + num1 + op + num2 + " = " + (num1 + num2));
		}else if(op == '-') {
			System.out.println("" + num1 + op + num2 + " = " + (num1 - num2));
		}else if(op == '*') {
			System.out.println("" + num1 + op + num2 + " = " + (num1 * num2));
		}else if(op == '/') {
			System.out.println("" + num1 + op + num2 + " = " + (num1 /(double)num2));
		}else if(op == '%') {
			System.out.println("" + num1 + op + num2 + " = " + (num1 %(double)num2));
		}else {
			System.out.println(op + "는 산술연산자가 아닙니다.");
		}
		
		

	}

}
