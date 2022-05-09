package day6;

public class P2_Break {

	public static void main(String[] args) {
		int i, j;
		for(i = 1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.println(i+ ", " + j);
				if(j==3) {
					break;
				}
			}
		}
		//break를 만나면 반복문을 종료한다.
		System.out.println("----------------------");
	}

}
