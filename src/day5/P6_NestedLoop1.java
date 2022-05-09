package day5;

public class P6_NestedLoop1 {

	public static void main(String[] args) {
		//별 5개를 5번 반복출력 하는 코드
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j<= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
