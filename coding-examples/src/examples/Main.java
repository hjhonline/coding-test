package examples;

public class Main {

	// ���� ���(�ܼ� �����)
	public static void main (String[] args) {
		
		StringExamples S = new StringExamples();
		Memo m = new Memo();
		
		// ������ ���� ���
		m.stringSolutionMemo();
		
		// ����1. ���
		// ���ڿ� �ޱ� ���� ����
		String str1 = "Computercooler";
		// Ư�� ���� �ޱ� ���� ����
		char c = 'c';
		
		System.out.println("����1�� ������:" + S.solution1(str1, c));
		
		// ����2. ���
		// ���ڿ� �ޱ� ���� ����
		String str2 = "StuDY";
		System.out.println("����2�� ������:" + S.solution2(str2));
		
		// ����3. ���
		// ���ڿ� �ޱ� ���� ����
		String str3 = "dkjg LKKL KJkjglkd Kjgkd LKKJLJLJLKJLLLLLLL";
		System.out.println("����3�� ������:" + S.solution3(str3));
		
		// ����4. ���
		String[] strArray = {"how","do","you"};
		
		for(String tmp : S.solution4(3, strArray)) {
			System.out.println("����4�� ������:" + tmp);
		}
		
		
	}


}
