package examples;

public class StringExamples {

	/*
	 * Example1. ���� ã��
	 * 
	 * �� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� 
	 * �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
	 * ��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
	 */
	public int solution1 (String str, char word) {
		
		// ���� ���� ����
		int answer = 0;
		
		// ��ҹ��� �������� �ʱ� ������ ���� �빮�ڷ� �ٲ��ֱ�
		str = str.toUpperCase();
		word = Character.toUpperCase(word);
		
		// (���1.for��)���ڿ� �ȿ� ��� ����?
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == word) answer++;
//		}
		
		// (���2.���� for��)���ڿ� �ȿ� ��� ����?
		for (char c : str.toCharArray()) {
			if(c == word) answer++;
		}
		
		// ���� ����
		return answer;
	}
	
}
