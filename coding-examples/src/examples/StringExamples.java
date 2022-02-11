package examples;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringExamples {

	private static String answerStr = "";
	private static int answerInt = 0;
	
	/*
	 * Example1. ���� ã��
	 * 
	 * �� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� 
	 * �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
	 * ��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
	 */
	public int solution1(String str, char word) {
		
		// ���� ���� �ʱ�ȭ
		answerInt = 0;
		
		// ��ҹ��� �������� �ʱ� ������ ���� �빮�ڷ� �ٲ��ֱ�
		str = str.toUpperCase();
		word = Character.toUpperCase(word);
		
		// (���1.for��)���ڿ� �ȿ� ��� ����?
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == word) answer++;
//		}
		
		// (���2.���� for��)���ڿ� �ȿ� ��� ����?
		for (char c : str.toCharArray()) {
			if(c == word) answerInt++;
		}
		
		// ���� ����
		return answerInt;
	}
	
	/* 
	 * Example2. ��ҹ��� �ٲٱ�
	 * 
	 * �빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� 
	 * �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���. 
	 * */
	public String solution2(String str) {
		
		// ���� ���� �ʱ�ȭ
		answerStr = "";
		
		// ���1.���ڿ� �ѱ��ھ� �ɰ��� �����ϱ�
		for (char c : str.toCharArray()) {
			if ( Character.isUpperCase(c)) answerStr += Character.toLowerCase(c);
			else answerStr += Character.toUpperCase(c);
		}
		
		// ���2.�ƽ�Ű�ѹ� Ȱ���ϱ�
//		for (char c : str.toCharArray()) {
//			if(c>=97 && c<=122) answer+=(char)(c-32);
//			else answer+=(char)(c+32);
//		}
		
		// ���� ����
		return answerStr;
	}
	
	/* 
	 * Example3. ���� �� �ܾ�
	 * 
	 * �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * ������� �� �ܾ�� �������� ���е˴ϴ�.
	 * */
	public String solution3(String str) {
		
		// ���� ���� �ʱ�ȭ
		answerStr = "";
		
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
			if(tmp.length() > answerStr.length()) answerStr = tmp;
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
//		if(str.length() > max) answerStr = str;
		
		// ���� ����
		return answerStr;
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
		ArrayList<String> answerListStr = new ArrayList<String>();
		
		// ���1. StringBuilder ����ϱ�
		// StringBuilder�� ���� String ��ü�� �������� �ʾƵ� �ǹǷ� �޸� ����X
		for(String str : strArray) {
			String tmp = new StringBuilder(str).reverse().toString();
			answerListStr.add(tmp);
		
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
	//			answerListStr.add(tmp);
		}
			
		// ���� ����
		return answerListStr;
	}
	
	/* 
	 * Example5. Ư�� ���� ������
	 * 
	 * ���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
	 * Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.
	 * �߰�: �������� ������ ���ĺ��̾�߸� ����, �ƴ� ��� �ڸ� �̵�!! <�̰��� �� ����������...
	 * */
	public String solution5(String str) {
		
		// ���亯�� �ʱ�ȭ
		answerStr = "";
		
//		// ���1. ���Խ����� Ǯ��
//		// ���Խ� �̿��� �غ�
//		String pattern = "^[a-zA-Z]*$";
//		
//		// ó����ġ(lt), ������ ��ġ(rt)
//		int lt = 0, rt = str.length()-1;
//		// Charcter�迭 ����
//		char[] ch = str.toCharArray();
//		
//			// ���� C �� �ڹٲ� �ڸ��� ���ڰ� ���ǿ� �����ϴ°�?
//			while (lt <  rt) {
//				boolean iLeft = Pattern.matches(pattern, String.valueOf(ch[lt]));
//				boolean iRight = Pattern.matches(pattern, String.valueOf(ch[rt]));
//				// ���� �� ���ĺ��� ��� �� �� ��ü
//				if(iLeft && iRight) {
//					char tmp = ch[lt];
//					ch[lt] = ch[rt];
//					ch[rt] = tmp;
//					lt++;
//					rt--;
//				}
//				// ������ ���ڴ� ���ĺ��� �ƴ� ���
//				else if(iLeft && !iRight) {
//					rt--;
//				}
//				// ���� ���ڰ� ���ĺ��� �ƴ� ���
//				else if(!iLeft) {
//					lt++;
//				}
//			}
		
		// ���2. Character Ŭ���� �̿��ؼ� Ǯ��
		// ó����ġ(lt), ������ ��ġ(rt) �� Character �迭 ����(���1�ϰ� ����)
		int lt = 0, rt = str.length()-1;
		char[] ch = str.toCharArray();
		
		while(lt < rt) {
			// ������ ���ĺ� �ƴ� ��� �ڸ��̵�(lt����)
			if(!Character.isAlphabetic(ch[lt])) lt++;
			// �������� ���ĺ� �ƴ� ��� �ڸ��̵�(rt����)
			else if (!Character.isAlphabetic(ch[rt])) rt++;
			// �Ѵ� ���ĺ��̸� ������
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
	 * Example6. �ߺ���������
	 * �ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * �ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.
	 * */
	public String solution6(String str) {
		
		// ���� ���� �ʱ�ȭ
		answerStr = "";
		
		for(int i=0; i<str.length(); i++){
			// System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			// (1) String.indexOf() �� ���ڿ������� ���� ó������ �߰ߵ� ��ġ�� ��´�.
			// (2) String.charAt(i)�� i��°�� ���ڰ� ���ڿ������� ��� ��ġ�� �ִ����� ��´�.
			// �ᱹ (1)�� (2)���� �Ȱ����� 1���ۿ� ���� ���ڶ�� ��!
			if(str.indexOf(str.charAt(i))==i) answerStr+=str.charAt(i);
		}
		return answerStr;
	}
	
	/* 
	 * Example7. ȸ�� ���ڿ�
	 * �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
	 * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * �� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.
	 * */
	public String solution7(String str) {
		
		// ���� ���� �ʱ�ȭ
		answerStr = "YES";
		
		// ���1.
		// ��ҹ��� ���� ���ϹǷ� ���� �빮�� ó��
		str = str.toUpperCase();
		// char �迭 ����
		char[] ch = str.toCharArray();
		// ����, �����ʿ��� �����ϴ� �ε��� ��ȣ ����
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
		
		// ���2. 1���̶� ����ѵ� str���̸�ŭ�� ������ ��
		// str ���� ����
		int len = str.length();
		
		for(int i = 0; i < len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) 
				return answerStr = "NO";
		}
		
		return answerStr;
	}
	
	/* 
	 * Example8. ��ȿ�� �Ӹ����
	 * �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
	 * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * �� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
	 * ���ĺ� �̿��� ���ڵ��� �����մϴ�.
	 * */
	public String solution8(String str) {
		
		// ���� ���� �ʱ�ȭ
		answerStr = "NO";
		
		// ������ĺ��� �ƴϸ�(^) ���ֶ�
		str=str.toUpperCase().replaceAll("[^A-Z]", "");
		// ������ �ܾ �Ųٷ� �������ֱ�
		String rvStr = new StringBuilder(str).reverse().toString();
		if(str.equals(rvStr)) answerStr="YES";
		
		return answerStr;
	}
	
	/* 
	 * Example9. ���ڸ� ����
	 * ���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
	 * ���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
	 * �����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.
	 * */
	public int solution9(String str) {
		
		// ���� ���� �ʱ�ȭ
		answerInt = -1;
		
		//��� 1. StringBuilder ���

//		// Stringbuilder �����
//		StringBuilder sb = new StringBuilder();
//
//		for(char c : str.toCharArray()) {
//			if(Character.isDigit(c)) sb.append(c);
//		}
//		String tmp = sb.toString();
//		answerInt = Integer.parseInt(tmp);
		
		// ���2. StringBuilder �� ���(�̰� �� �����ϴ�...)
		
		// �ӽ����� String ���� ����
		String tmp = "";
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) tmp += c;
		}
		answerInt = Integer.parseInt(tmp);
		
		return answerInt;
	}
}
