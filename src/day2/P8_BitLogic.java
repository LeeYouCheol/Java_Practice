package day2;

public class P8_BitLogic {

	public static void main(String[] args) {
		// & = 논리곱, | = 논리합, ^ = 베타적 논리합, ~논리 부정
		byte num1 = 3;
		byte num2 = 10;
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);

	}

}
