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
		String str = "Computercooler";
		// Ư�� ���� �ޱ� ���� ����
		char c = 'c';
		
		System.out.println("����1�� ������:" + S.solution1(str, c));
		
	}


}
