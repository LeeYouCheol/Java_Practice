package day5;

public class P10_NestedLoop4_Alphabet {

	public static void main(String[] args) {
		/* a				'a'부터 'a'까지
		 * ab				'a'부터 'b'까지
		 * abc				
		 * ...				
		 * abcdfg...xyz		'a'부터 'z'까지
		 * 
		 * 반복횟수 : end는 'a'부터 'z'까지 1씩 증가
		 * 규칙성 : ch는 'a'부터 end까지 1씩 증가하며 ch를 출력 
		 * */
		char i;
		char j;
		for(i = 'a'; i <= 'z'; i++) {
			for(j = 'a'; j<=i; j++) {
				System.out.print(j);
			}System.out.println();
		}

	}

}
