package examples;

import java.util.ArrayList;

public class StringExamples {

	/*
	 * Example1. 문자 찾기
	 * 
	 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 
	 * 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
	 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
	 */
	public int solution1(String str, char word) {
		
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
	
	/* 
	 * Example2. 대소문자 바꾸기
	 * 
	 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 
	 * 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요. 
	 * */
	public String solution2(String str) {
		
		// 정답 변수 선언
		String answer = "";
		
		// 방법1.문자열 한글자씩 쪼개서 저장하기
		for (char c : str.toCharArray()) {
			if ( Character.isUpperCase(c)) answer += Character.toLowerCase(c);
			else answer += Character.toUpperCase(c);
		}
		
		// 방법2.아스키넘버 활용하기
//		for (char c : str.toCharArray()) {
//			if(c>=97 && c<=122) answer+=(char)(c-32);
//			else answer+=(char)(c+32);
//		}
		
		// 정답 리턴
		return answer;
	}
	
	/* 
	 * Example3. 문장 속 단어
	 * 
	 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
	 * 문장속의 각 단어는 공백으로 구분됩니다.
	 * */
	public String solution3(String str) {
		
		// 정답 변수 선언
		String answer = "";
		
//		// 방법1. 정석적..
//		// 공백으로 단어 가르기
//		String[] strArray = str.split("\\s+");
//		// 배열의 저장된 단어 중 가장 긴 것 비교
//		answer = strArray[0];
//		for (int i=0; i < strArray.length; i++) {
//			if(answer.length() < strArray[i].length()) answer = strArray[i];
//		}
		
		// 방법1-1. 내가 작성한 코드를 조금 더 간단히 구현
		for(String tmp : str.split("\\s+")) {
			if(tmp.length() > answer.length()) answer = tmp;
		}
		
//		//방법2. indexOf랑 subString 사용
//		// 일단 가장 작은 수로 초기화
//		int max = Integer.MIN_VALUE, pos;
//		while((pos=str.indexOf(" ")) != -1) {
//			String tmp = str.substring(0,pos);
//			int len = tmp.length();
//			if (len > max) {
//				max =len;
//				answer = tmp;
//			}
//			str = str.substring(pos+1);
//		};
//		
//		if(str.length() > max) answer = str;
		
		// 정답 리턴
		return answer;
	}
	
	/* 
	 * Example4. 단어 뒤집기
	 * 
	 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
	 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
	 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
	 * */
	public ArrayList<String> solution4(int n, String[] strArray) {
		
		// 정답 변수 생성
		ArrayList<String> list = new ArrayList<String>();
		
		// 방법1. StringBuilder 사용하기
		for(String str : strArray) {
			
			String tmp = new StringBuilder(str).reverse().toString();
			list.add(tmp);
		}
		
		// 정답 리턴
		return list;
		
	}
}
