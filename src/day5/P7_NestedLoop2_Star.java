package day5;

public class P7_NestedLoop2_Star {

	public static void main(String[] args) {
		/* 아래와 같이 출력되도록 코드를 작성하세요.
		 * *		i=1, *=1
		 * **		i=2, *=2
		 * ***		i=3, *=3
		 * ****		i=4, *=4
		 * *****	i=5, *=5
		 * */
		int num = 5;
		for(int i = 1; i<=num; i++) {
			//별을 i개 출력
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* 아래와 같이 출력되도록 코드를 작성하세요.
		 *     *	i=1 " "=4 *=1
		 *    **	i=2 " "=3 *=2
		 *   ***	i=3 " "=2 *=3
		 *  ****	i=4 " "=1 *=4
		 * *****	i=5 " "=0 *=5
		 * 				" "=5-i개, *=i개
		 * */
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j<=num-i; j++) {
				System.out.print(" ");
			}for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 * */
		for(int i = 1; i < num; i++) {
			//공백출력 : 5-i개 만큼
			for(int j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}// *을 출력 : 2*i개 만큼
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
