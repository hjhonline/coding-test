package examples;

public class StringExamples {

	/*
	 * Example1. 문자 찾기
	 * 
	 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 
	 * 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
	 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
	 */
	public int solution1 (String str, char word) {
		
		// 정답 변수 선언
		int answer = 0;
		
		// 대소문자 구분하지 않기 때문에 전부 대문자로 바꿔주기
		str = str.toUpperCase();
		word = Character.toUpperCase(word);
		
		// (방법1.for문)문자열 안에 몇개가 존재?
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == word) answer++;
//		}
		
		// (방법2.향상된 for문)문자열 안에 몇개가 존재?
		for (char c : str.toCharArray()) {
			if(c == word) answer++;
		}
		
		// 정답 리턴
		return answer;
	}
	
}
