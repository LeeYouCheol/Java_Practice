package day2;

public class P2_Increase {

	public static void main(String[] args) {
		/* 증감연산자 : 최종적으로 1증가 또는 1감소
		 * 전위형 : ++변수명, --변수명; -> 증가(감소)후 동작
		 * 후위형 : 변수명++, --변수명; -> 동작후 증가(감소)
		 * */
		int num1 = 10, num2 = 10;
		System.out.println(num1 + " , " + num2);
		//그대로 출력
		System.out.println(++num1 + " , " + num2++);
		//num1은 전위형(증가후 동작) 이기때문에 11로 출력, num2는 후위형(동작후 증가) 이기때문에 증가전인 10으로 출력
		System.out.println(num1 + " , " + num2);
		//num1은 위에서 증가한대로 11로 출력, num2는 동작후 출력이었으므로 이번에 11로 출력
		
		int num3 = 10, num4 = 10;
		System.out.println(num3 + " , " + num4);
		//그대로 출력
		num3++;
		System.out.println(num3 + " , " + num4);
		//num3++;의 영향을 받아 동작후인 이번에 11로 출력
		num4++;
		System.out.println(num3 + " , " + num4);
		//위와 같이 후위형 이기때문에 num4도 이번에 11로 출력
	}

}
