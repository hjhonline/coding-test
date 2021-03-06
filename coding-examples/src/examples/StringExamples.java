package examples;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringExamples {

	private static String answerStr = "";
	private static int answerInt = 0;
	
	/*
	 * Example1. 문자 찾기
	 * 
	 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 
	 * 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
	 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
	 */
	public int solution1(String str, char word) {
		
		// 정답 변수 초기화
		answerInt = 0;
		
		// 대소문자 구분하지 않기 때문에 전부 대문자로 바꿔주기
		str = str.toUpperCase();
		word = Character.toUpperCase(word);
		
		// (방법1.for문)문자열 안에 몇개가 존재?
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == word) answer++;
//		}
		
		// (방법2.향상된 for문)문자열 안에 몇개가 존재?
		for (char c : str.toCharArray()) {
			if(c == word) answerInt++;
		}
		
		// 정답 리턴
		return answerInt;
	}
	
	/* 
	 * Example2. 대소문자 바꾸기
	 * 
	 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 
	 * 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요. 
	 * */
	public String solution2(String str) {
		
		// 정답 변수 초기화
		answerStr = "";
		
		// 방법1.문자열 한글자씩 쪼개서 저장하기
		for (char c : str.toCharArray()) {
			if ( Character.isUpperCase(c)) answerStr += Character.toLowerCase(c);
			else answerStr += Character.toUpperCase(c);
		}
		
		// 방법2.아스키넘버 활용하기
//		for (char c : str.toCharArray()) {
//			if(c>=97 && c<=122) answer+=(char)(c-32);
//			else answer+=(char)(c+32);
//		}
		
		// 정답 리턴
		return answerStr;
	}
	
	/* 
	 * Example3. 문장 속 단어
	 * 
	 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
	 * 문장속의 각 단어는 공백으로 구분됩니다.
	 * */
	public String solution3(String str) {
		
		// 정답 변수 초기화
		answerStr = "";
		
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
			if(tmp.length() > answerStr.length()) answerStr = tmp;
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
//		if(str.length() > max) answerStr = str;
		
		// 정답 리턴
		return answerStr;
	}
	
	/* 
	 * Example4. 단어 뒤집기
	 * 
	 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
	 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
	 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
	 * */
	public ArrayList<String> solution4(int n, String[] strArray) {
		
		// 정답 변수 선언
		ArrayList<String> answerListStr = new ArrayList<String>();
		
		// 방법1. StringBuilder 사용하기
		// StringBuilder를 쓰면 String 객체를 낭비하지 않아도 되므로 메모리 낭비X
		for(String str : strArray) {
			String tmp = new StringBuilder(str).reverse().toString();
			answerListStr.add(tmp);
		
		// 방법2. 직접 구현
		// 대칭하는 위치를 바꾼다는 이미지
	//		for(String str : strArray) {
	//			// strArray의 str을 char배열에 저장
	//			char[] ch = str.toCharArray();
	//			// 문자열의 처음 위치(lt), 마지막 위치(rt)의 변수를 선언
	//			// rt는 0번 인덱스부터 시작이니까 -1 꼭 해준다
	//			int lt = 0, rt= str.length() -1;
	//			while (lt<rt) {
	//				// 지금 문자 저장
	//				char tmp = ch[lt];
	//				// 위치 뒤집기
	//				ch[lt] = ch[rt];
	//				ch[rt] = tmp;
	//				// 그 다음 인덱스로 넘어가기
	//				lt++;
	//				rt--;
	//			}
	//			// 문자 배열을 스트링화 시켜줌
	//			String tmp = String.valueOf(ch);
	//			// 문자열을 정답리스트에 저장
	//			answerListStr.add(tmp);
		}
			
		// 정답 리턴
		return answerListStr;
	}
	
	/* 
	 * Example5. 특정 문자 뒤집기
	 * 
	 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
	 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
	 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
	 * 추가: 뒤집을때 양쪽이 알파벳이어야만 가능, 아닐 경우 자리 이동!! <이거좀 잘 설명해주지...
	 * */
	public String solution5(String str) {
		
		// 정답변수 초기화
		answerStr = "";
		
//		// 방법1. 정규식으로 풀기
//		// 정규식 이용의 준비
//		String pattern = "^[a-zA-Z]*$";
//		
//		// 처음위치(lt), 마지막 위치(rt)
//		int lt = 0, rt = str.length()-1;
//		// Charcter배열 생성
//		char[] ch = str.toCharArray();
//		
//			// 문자 C 및 뒤바뀔 자리의 문자가 조건에 부합하는가?
//			while (lt <  rt) {
//				boolean iLeft = Pattern.matches(pattern, String.valueOf(ch[lt]));
//				boolean iRight = Pattern.matches(pattern, String.valueOf(ch[rt]));
//				// 양쪽 다 알파벳인 경우 둘 다 교체
//				if(iLeft && iRight) {
//					char tmp = ch[lt];
//					ch[lt] = ch[rt];
//					ch[rt] = tmp;
//					lt++;
//					rt--;
//				}
//				// 뒤쪽의 문자는 알파벳이 아닐 경우
//				else if(iLeft && !iRight) {
//					rt--;
//				}
//				// 앞쪽 문자가 알파벳이 아닐 경우
//				else if(!iLeft) {
//					lt++;
//				}
//			}
		
		// 방법2. Character 클래스 이용해서 풀기
		// 처음위치(lt), 마지막 위치(rt) 와 Character 배열 생성(방법1하고 공통)
		int lt = 0, rt = str.length()-1;
		char[] ch = str.toCharArray();
		
		while(lt < rt) {
			// 왼쪽이 알파벳 아닌 경우 자리이동(lt증가)
			if(!Character.isAlphabetic(ch[lt])) lt++;
			// 오른쪽이 알파벳 아닌 경우 자리이동(rt증가)
			else if (!Character.isAlphabetic(ch[rt])) rt++;
			// 둘다 알파벳이면 뒤집기
			else {
				char tmp = ch[lt];
				ch[lt] = ch[rt];
				ch[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answerStr = String.valueOf(ch);
		
		return answerStr;
	}
	
	/* 
	 * Example6. 중복문자제거
	 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
	 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
	 * */
	public String solution6(String str) {
		
		// 정답 변수 초기화
		answerStr = "";
		
		for(int i=0; i<str.length(); i++){
			// System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			// (1) String.indexOf() 는 문자열내에서 가장 처음으로 발견된 위치를 뱉는다.
			// (2) String.charAt(i)는 i번째의 문자가 문자열내에서 어디에 위치해 있는지를 뱉는다.
			// 결국 (1)과 (2)값이 똑같으면 1개밖에 없는 문자라는 것!
			if(str.indexOf(str.charAt(i))==i) answerStr+=str.charAt(i);
		}
		return answerStr;
	}
	
	/* 
	 * Example7. 회문 문자열
	 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
	 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
	 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
	 * */
	public String solution7(String str) {
		
		// 정답 변수 초기화
		answerStr = "YES";
		
		// 방법1.
		// 대소문자 구별 안하므로 전부 대문자 처리
		str = str.toUpperCase();
		// char 배열 선언
		char[] ch = str.toCharArray();
		// 왼쪽, 오른쪽에서 시작하는 인덱스 번호 선언
		int lt = 0, rt = str.length() - 1; 

//		while (lt < rt) {
//			if((ch[lt] == ch[rt])) {
//				lt++;
//				rt--;
//			}
//			else {
//				answerStr = "NO";
//				break;
//			}
//		}
		
		// 방법2. 1번이랑 비슷한데 str길이만큼만 돌리는 것
		// str 길이 변수
		int len = str.length();
		
		for(int i = 0; i < len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) 
				return answerStr = "NO";
		}
		
		return answerStr;
	}
	
	/* 
	 * Example8. 유효한 팰린드롬
	 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
	 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
	 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
	 * 알파벳 이외의 문자들의 무시합니다.
	 * */
	public String solution8(String str) {
		
		// 정답 변수 초기화
		answerStr = "NO";
		
		// 영어알파벳이 아니면(^) 없애라
		str=str.toUpperCase().replaceAll("[^A-Z]", "");
		// 제거한 단어를 거꾸로 뒤집어주기
		String rvStr = new StringBuilder(str).reverse().toString();
		if(str.equals(rvStr)) answerStr="YES";
		
		return answerStr;
	}
	
	/* 
	 * Example9. 숫자만 추출
	 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
	 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
	 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
	 * */
	public int solution9(String str) {
		
		// 정답 변수 초기화
		answerInt = -1;
		
		//방법 1. StringBuilder 사용

//		// Stringbuilder 만들기
//		StringBuilder sb = new StringBuilder();
//
//		for(char c : str.toCharArray()) {
//			if(Character.isDigit(c)) sb.append(c);
//		}
//		String tmp = sb.toString();
//		answerInt = Integer.parseInt(tmp);
		
		// 방법2. StringBuilder 안 사용(이게 더 간단하다...)
		
		// 임시저장 String 변수 선언
		String tmp = "";
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) tmp += c;
		}
		answerInt = Integer.parseInt(tmp);
		
		return answerInt;
	}
	
	/* 
	 * Example10. 가장 짧은 문자 거리
	 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
	 * 문자열의 길이는 100을 넘지 않는다.
	 * */
	public int[] solution10(String str, char c10) {
		
		// 정답 변수 선언
		int[] answerIntArr = new int[str.length()];
		
		// 방법1. 각 인덱스 위치와 기준 문자 인덱스 위치와의 비교
		
//		// 기준 문자의 인덱스 위치 저장
//		int[] baseCharIndex = new int[100];
//		// 가장 최소 거리 구하기 위한 임시 배열 선언
//		int[] tmpIndex = new int[100];
//		int tmp = -1;
//		
//		for(int i = 0; i < str.length(); i++) {
//			// 문자열에서 i번째 문자가 기준 문자와 같다면 인덱스 위치 저장
//			if(str.charAt(i) == c10) baseCharIndex[i] = i;
//		}
//		
//		for(int i = 0; i < str.length(); i++) {
//			// 기준 문자가 아닌 경우
//			if(str.charAt(i) != c10) {
//				// 비교 문자와 기존 문자의 위치들을 저장
//				for(int j : baseCharIndex) {
//					tmp = str.indexOf(i) - j;
//					// 거리를 절대값으로 저장
//					tmpIndex[i] = Math.abs(tmp);
//				}
//			}
//		}
//		// 여기까지 풀다가 코드가 길어진 다는 것을 깨닫고 GG...
		
		// 방법2. 왼쪽에서 한 번, 오른쪽에서 한 번 도는 것(이중체크)
		
		// 거리 변수 선언. 아주 크게 넉넉히 잡는다.
		int p = 1000;
		
		// (1) 왼->오 방향으로 거리 측정. 
		for (int i = 0; i < str.length(); i++) {
			// 비교 문자가 기준 문자가 아닐때 p를 1만큼 증가시켜 넣기
			if(str.charAt(i) != c10) {
				/*
				 * 이게 좀 어려운 설명일 수 있는데, 처음으로 문자가 나타나기 전까지는 사실상 거리의 의미가 없는 셈. 
				 * t t t e a 일 경우, 왼->오 방향일 때 a부터는 거리를 측정할 수 있지만 e 앞의 t 세개는 불가능함. 
				 * 그래서 e의 앞의 t는 오->왼 방향으로 2차 검증을 해주면서 조정되는 것인듯.
				 * 0으로 초기값을 설정하게 되면 논리적인 오류가 발생한다(왜냐하면 첫번째 t의 경우 떨어져있는 거리가 1로 나오기 때문)
				 */
				p++;
				answerIntArr[i] = p;
			} 
			// 비교 문자에 해당될 때 p 초기화
			else {
				p = 0;
				answerIntArr[i] = p;
			}
		}
		
		// (2) 오->왼 역순 방향으로 거리 측정. 
		// 거리 초기화
		p = 1000;
		for (int i = str.length() -1 ; i >=0 ; i--) {
			if(str.charAt(i) != c10) {
				p++;
				// (1) 에서의 값이랑 최소값 비교해서 저장
				answerIntArr[i] = Math.min(answerIntArr[i], p);
			}
			// 비교 문자에 해당될 때 p 초기화
			else p = 0;
		}
		
		return answerIntArr;
	}
	
	/* 
	 * Example11. 문자열 압축
	 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
	 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
	 * 단 반복횟수가 1인 경우 생략합니다.
	 * */
	public String solution11(String str) {
		
		// 정답 변수 초기화
		answerStr = "";
		
		// cnt 변수 선언
		int cnt = 1;
		
		// 방법1. 해설 풀이
		for(int i = 0; i < str.length()-1; i++) {
			// 바로 직후에 오는 문자와 같으면 cnt만 올림
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt ++;
			}
			// 바로 직후에오는 문자와 다르면 저장 후 cnt 체크
			else {
				answerStr += str.charAt(i);
				if(cnt > 1) answerStr += String.valueOf(cnt);
				cnt = 1;
			}
		}
		
		return answerStr;
	}
	
	/* 
	 * Example12. 암호
	 * 현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
	 * 비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.
	 * 비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
	 * 만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.
	 * 1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
	 * 2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
	 * 3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
	 * 참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.
	 * 현수가 4개의 문자를 다음과 같이 신호로 보냈다면
	 * #****###**#####**#####**##**
	 * 이 신호를 4개의 문자신호로 구분하면
	 * #****## --> 'C'
	 * #**#### --> 'O'
	 * #**#### --> 'O'
	 * #**##** --> 'L'
	 * 최종적으로 “COOL"로 해석됩니다.
	 * 현수가 보낸 신호를 해석해주는 프로그램을 작성해서 영희를 도와주세요.
	 * 
	 * */
	public String solution12(int i12, String str) {
		
		// 정답 변수 초기화
		answerStr = "";
		
		// 7개씩 자르기
		for(int i = 0; i < i12 ; i++) {
			// 7글자 잘라서 #와 *의 2진수 변환
			String tmp = str.substring(0,7).replace("#", "1").replace("*", "0");
			// 2진수를 10진수로 변환
			int twoRadix = Integer.parseInt(tmp, 2);
			// 숫자를 아스키코드 문자 변환
			answerStr += (char)twoRadix;
			// 7자리부터 끝까지 자르기 ★시작지점이 들어간다는게 중요!
			str = str.substring(7);
		}
		
		return answerStr;
	}
}
