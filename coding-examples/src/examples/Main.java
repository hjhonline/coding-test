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
		String str1 = "Computercooler";
		// 특정 문자 받기 위해 생성
		char c = 'c';
		
		System.out.println("문제1의 정답은:" + S.solution1(str1, c));
		
		// 문제2. 출력
		// 문자열 받기 위해 생성
		String str2 = "StuDY";
		System.out.println("문제2의 정답은:" + S.solution2(str2));
		
		// 문제3. 출력
		// 문자열 받기 위해 생성
		String str3 = "dkjg LKKL KJkjglkd Kjgkd LKKJLJLJLKJLLLLLLL";
		System.out.println("문제3의 정답은:" + S.solution3(str3));
		
		// 문제4. 출력
		String[] strArray = {"how","do","you"};
		
		for(String tmp : S.solution4(3, strArray)) {
			System.out.println("문제4의 정답은:" + tmp);
		}
		
		
	}


}
