package day6;

public class P6_Array4_Squared {

	public static void main(String[] args) {
		/* 배열에 1의 제곱부터 10의 제곱까지 저장하고, 출력하는 코드를 작성하세요.
		 * */
		/* 방법1 : 10개짜리 배열을 만들어서 활용.
		 * 장점 : 10개를 사용
		 * 단점 : i의 제곱을 하려면 약간의 작업이 필요
		 */
		int []arr1 = new int [10];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (i + 1) * (i + 1);
			System.out.println(i+1+"의 제곱 : " + arr1[i]);
		}
		int []arr2 = new int[11];
		for(int i = 1; i<arr2.length; i++) {
			arr2[i] = i*i;
			System.out.println(i + "의 제곱 : " + arr2[i]);
		}
	}

}