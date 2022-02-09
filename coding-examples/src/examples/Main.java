package examples;

public class Main {

	// 백준 방식(콘솔 입출력)
	public static void main (String[] args) {
		
		StringExamples S = new StringExamples();
		Memo m = new Memo();
		
		// 공부한 내용 출력
		m.stringSolutionMemo();
		
		// 문제1. 출력
		// 문자열 받기 위해 생성
		String str = "Computercooler";
		// 특정 문자 받기 위해 생성
		char c = 'c';
		
		System.out.println("문제1의 정답은:" + S.solution1(str, c));
		
	}


}
