package day7;

public class P3_Arr3_Sort {

	public static void main(String[] args) {
		/*버블정렬을 이용한 배열 정렬 예제
		 * */
		int arr[] = {10, 15, 5, 18 , 20, 1};
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] < arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
