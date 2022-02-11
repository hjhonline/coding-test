package examples;

public class Main {

	// 백준 방식(콘솔 입출력)
	public static void main (String[] args) {
		
		StringExamples S = new StringExamples();
		Memo m = new Memo();
		
		// 공부한 내용 출력
		m.stringSolutionMemo();
		
		// 문제1. 출력
		String str1 = "Computercooler";
		char c = 'c';
		
		System.out.println("문제1의 정답은:" + S.solution1(str1, c));
		
		// 문제2. 출력
		String str2 = "StuDY";
		System.out.println("문제2의 정답은:" + S.solution2(str2));
		
		// 문제3. 출력
		String str3 = "dkjg LKKL KJkjglkd Kjgkd LKKJLJLJLKJLLLLLLL";
		System.out.println("문제3의 정답은:" + S.solution3(str3));
		
		// 문제4. 출력
		String[] strArray = {"how","do","you"};
		for(String tmp : S.solution4(3, strArray)) {
			System.out.println("문제4의 정답은:" + tmp);
		}
		
		// 문제5. 출력
		String str5 = "kdj#@kdjg%$#kdjgk@kd$dk";
		System.out.println("문제5의 정답은:" + S.solution5(str5));
		
		// 문제6. 출력
		String str6 = "ksekkset";
		System.out.println("문제6의 정답은:" + S.solution6(str6));
		
		// 문제7. 출력
		String str7 = "gooG";
		System.out.println("문제7의 정답은:" + S.solution7(str7));
		
		// 문제8. 출력
		String str8 = "found7, time: study; Yduts; emit, 7Dnuof";
		System.out.println("문제8의 정답은:" + S.solution8(str8));
		
		// 문제9. 출력
		String str9 = "g0en2T0s8eSoft";
		System.out.println("문제9의 정답은:" + S.solution9(str9));
		
	}


}
