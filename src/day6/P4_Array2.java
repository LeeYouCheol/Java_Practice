package day6;

public class P4_Array2 {

	public static void main(String[] args) {
		int []arr = new int[5];
		//0번지에 1을 저장
		arr[0] = 1;
		arr[1] = 2;
		/* 5개짜리 배열은 5번지까지 접근 불가.
		 * arr[5] = 6; 이건 오류발생
		 * //System.out.println(arr[5]); 이것도 오류발생
		 * */
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("----------------");
		
		for(int i = 0; i<=4; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------");
		
		for(int i = 0; i<5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------");
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
