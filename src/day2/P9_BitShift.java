package day2;

public class P9_BitShift {

	public static void main(String[] args) {
		/* A << B : A를 2의 B제곱만큼 곱한 결과값
		 * 3 << 2 => 12
		 * A >> B : A를 2의 B제곱한 값으로 나눈 결과의 몫
		 * 3 >> 1 => 1
		 * 
		 * -4 >> 1 = -2
		 * -4 >>> 1 =126
		 * */
		byte num1 = 3;
		byte num2 = -4;
		System.out.println(num1 << 2);
		System.out.println(num1 >> 1);
		System.out.println(num2 >> 1);
		System.out.println((num2 >>> 1));

	}

}
