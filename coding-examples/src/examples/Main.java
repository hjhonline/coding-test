package examples;

public class Main {

	// ���� ���(�ܼ� �����)
	public static void main (String[] args) {
		
		StringExamples S = new StringExamples();
		Memo m = new Memo();
		
		// ������ ���� ���
		m.stringSolutionMemo();
		
		// ����1. ���
		String str1 = "Computercooler";
		char c = 'c';
		
		System.out.println("����1�� ������:" + S.solution1(str1, c));
		
		// ����2. ���
		String str2 = "StuDY";
		System.out.println("����2�� ������:" + S.solution2(str2));
		
		// ����3. ���
		String str3 = "dkjg LKKL KJkjglkd Kjgkd LKKJLJLJLKJLLLLLLL";
		System.out.println("����3�� ������:" + S.solution3(str3));
		
		// ����4. ���
		String[] strArray = {"how","do","you"};
		for(String tmp : S.solution4(3, strArray)) {
			System.out.println("����4�� ������:" + tmp);
		}
		
		// ����5. ���
		String str5 = "kdj#@kdjg%$#kdjgk@kd$dk";
		System.out.println("����5�� ������:" + S.solution5(str5));
		
		// ����6. ���
		String str6 = "ksekkset";
		System.out.println("����6�� ������:" + S.solution6(str6));
		
		// ����7. ���
		String str7 = "gooG";
		System.out.println("����7�� ������:" + S.solution7(str7));
		
		// ����8. ���
		String str8 = "found7, time: study; Yduts; emit, 7Dnuof";
		System.out.println("����8�� ������:" + S.solution8(str8));
		
		// ����9. ���
		String str9 = "g0en2T0s8eSoft";
		System.out.println("����9�� ������:" + S.solution9(str9));
		
	}


}
