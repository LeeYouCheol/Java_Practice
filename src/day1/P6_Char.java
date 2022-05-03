package day1;

public class P6_Char {

	public static void main(String[] args) {
			/* 문자는 ''안에 들어가는 한 글자
			 * 예외 : P.34
			 * */
			char ch1 = '\t'; //Tab 키만큼 공백
			char ch2 = '\n'; //엔터
			char ch3 = '\r'; //커서를 앞으로 이동
			char ch4 = '\"'; // "문자
			char ch5 = '\''; // '문자
			char ch6 = '\\'; // \문자
			char ch7 = '\u0000'; //유니코드에 0에 해당하는 문자
			char ch8 = 'a'; //일반적인 경우
			
			int num = 65;
			char ch9 = (char)num;
			System.out.println(ch9); //유니코드 표에서 65는 A에 해당한다. 정수를 문자로 변환했기 때문에 A가 출력
			ch9 = (char)(num+1); //65에 1을 더한 값을 문자로 강제 타입변환
			System.out.println(ch9); //따라서 66을 문자로 강제 변환했기 때문에 유니코드표에서 B를 출력
	}

}
