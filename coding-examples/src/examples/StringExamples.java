package examples;

import java.util.ArrayList;

public class StringExamples {

	/*
	 * Example1. ���� ã��
	 * 
	 * �� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� 
	 * �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
	 * ��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
	 */
	public int solution1(String str, char word) {
		
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
	
	/* 
	 * Example2. ��ҹ��� �ٲٱ�
	 * 
	 * �빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� 
	 * �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���. 
	 * */
	public String solution2(String str) {
		
		// ���� ���� ����
		String answer = "";
		
		// ���1.���ڿ� �ѱ��ھ� �ɰ��� �����ϱ�
		for (char c : str.toCharArray()) {
			if ( Character.isUpperCase(c)) answer += Character.toLowerCase(c);
			else answer += Character.toUpperCase(c);
		}
		
		// ���2.�ƽ�Ű�ѹ� Ȱ���ϱ�
//		for (char c : str.toCharArray()) {
//			if(c>=97 && c<=122) answer+=(char)(c-32);
//			else answer+=(char)(c+32);
//		}
		
		// ���� ����
		return answer;
	}
	
	/* 
	 * Example3. ���� �� �ܾ�
	 * 
	 * �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * ������� �� �ܾ�� �������� ���е˴ϴ�.
	 * */
	public String solution3(String str) {
		
		// ���� ���� ����
		String answer = "";
		
//		// ���1. ������..
//		// �������� �ܾ� ������
//		String[] strArray = str.split("\\s+");
//		// �迭�� ����� �ܾ� �� ���� �� �� ��
//		answer = strArray[0];
//		for (int i=0; i < strArray.length; i++) {
//			if(answer.length() < strArray[i].length()) answer = strArray[i];
//		}
		
		// ���1-1. ���� �ۼ��� �ڵ带 ���� �� ������ ����
		for(String tmp : str.split("\\s+")) {
			if(tmp.length() > answer.length()) answer = tmp;
		}
		
//		//���2. indexOf�� subString ���
//		// �ϴ� ���� ���� ���� �ʱ�ȭ
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
		
		// ���� ����
		return answer;
	}
	
	/* 
	 * Example4. �ܾ� ������
	 * 
	 * N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
	 * �� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
	 * */
	public ArrayList<String> solution4(int n, String[] strArray) {
		
		// ���� ���� ����
		ArrayList<String> answerList = new ArrayList<String>();
		
		// ���1. StringBuilder ����ϱ�
		// StringBuilder�� ���� String ��ü�� �������� �ʾƵ� �ǹǷ� �޸� ����X
		for(String str : strArray) {
			String tmp = new StringBuilder(str).reverse().toString();
			answerList.add(tmp);
		}
		
		// ���2. ���� ����
		// ��Ī�ϴ� ��ġ�� �ٲ۴ٴ� �̹���
//		for(String str : strArray) {
//			// strArray�� str�� char�迭�� ����
//			char[] ch = str.toCharArray();
//			// ���ڿ��� ó�� ��ġ(lt), ������ ��ġ(rt)�� ������ ����
//			// rt�� 0�� �ε������� �����̴ϱ� -1 �� ���ش�
//			int lt = 0, rt= str.length() -1;
//			while (lt<rt) {
//				// ���� ���� ����
//				char tmp = ch[lt];
//				// ��ġ ������
//				ch[lt] = ch[rt];
//				ch[rt] = tmp;
//				// �� ���� �ε����� �Ѿ��
//				lt++;
//				rt--;
//			}
//			// ���� �迭�� ��Ʈ��ȭ ������
//			String tmp = String.valueOf(ch);
//			// ���ڿ��� ���丮��Ʈ�� ����
//			answerList.add(tmp);
//		}
		
		// ���� ����
		return answerList;
	}
	
	
}
