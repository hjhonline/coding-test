package examples;

public class Memo {

	public void stringSolutionMemo() {
		
		String str = "StarWars";

		// 1. CharAt()함수
		char c = str.charAt(0);
		System.out.println("CharAt함수는 문자열을 한 글자씩 끊는다. 결과값:" + c);
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		
		// 2. replace와 replaceAll()의 차이
		/*
		 * str.replace("a","b") : a를 b로 바꾸는 것 
		 * str.replaceAll("a","b") : a에 정규식이 들어간다.
		 */
		
		// 3. Integer.parseint()와 Integer.valueOf()의 차이
		/* 
		 * Integer.parseInt(str) 의 리턴값은 기본 자료형(primitive). 
		 * -> int, long, boolean...사이즈가 정해져 있다.
		 * Integer.valueOf(str) 의 리턴값은 객체(object).
		 * -> Integer, Long, Boolean...주소값을 참조하는 형태.
		 * 
		 * 그렇다면 기본 자료형이랑 객체는 무슨차이냐?!
		 * (1) 일단, 기본 자료형은 서로 비교가 가능하고 a=42,b=42일때 a==b
		 *     객체화된 자료형은 a!=b일 수 있다. 그리고 산술연산 불가.
		 * (2) int는 null로 초기화 불가, Integer는 null로 초기화 가능.
		 * 
		 * 그럼 Integer는 언제 써?
		 * (1) DB연동과 같이 null값으로 처리해야 하는 경우
		 * (2) Arraylist와 같이 형을 제시해줘야 하는 경우 ex.ArrayList<Integer>
		 * 
		 * */
		
		// 4. 3번을 공부하다보니 참조형vs자료형을 조사하지 않을 수가 없었다.
		
		/* ㅇ 기본형 : Stack 메모리에 저장된다.
		 * ㅇ 참조형 : Object 클래스를 상속하는 모든 클래스.
		 *          생성시에 Heap 메모리 영역에 생성하고, Garbage Collector가 돌면서 메모리 해제.
		 *          메모리 주소를 저장하는 변수.(아 주소라는 개념이 참...모호하다)
		 * 
		 * 2022.2.11 이거때문에 블로그를 좀 뒤져봤는데 제대로 써놓은 사람이 별로 없다.
		 *           책이라도 사서 읽어야할듯. 
		 *  */
		
		
		
	}
}
