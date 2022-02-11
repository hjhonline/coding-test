package examples;

public class Memo {

	public void stringSolutionMemo() {
		
		String str = "StarWars";

		// 1. CharAt()�Լ�
		char c = str.charAt(0);
		System.out.println("CharAt�Լ��� ���ڿ��� �� ���ھ� ���´�. �����:" + c);
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		
		// 2. replace�� replaceAll()�� ����
		/*
		 * str.replace("a","b") : a�� b�� �ٲٴ� �� 
		 * str.replaceAll("a","b") : a�� ���Խ��� ����.
		 */
		
		// 3. Integer.parseint()�� Integer.valueOf()�� ����
		/* 
		 * Integer.parseInt(str) �� ���ϰ��� �⺻ �ڷ���(primitive). 
		 * -> int, long, boolean...����� ������ �ִ�.
		 * Integer.valueOf(str) �� ���ϰ��� ��ü(object).
		 * -> Integer, Long, Boolean...�ּҰ��� �����ϴ� ����.
		 * 
		 * �׷��ٸ� �⺻ �ڷ����̶� ��ü�� �������̳�?!
		 * (1) �ϴ�, �⺻ �ڷ����� ���� �񱳰� �����ϰ� a=42,b=42�϶� a==b
		 *     ��üȭ�� �ڷ����� a!=b�� �� �ִ�. �׸��� ������� �Ұ�.
		 * (2) int�� null�� �ʱ�ȭ �Ұ�, Integer�� null�� �ʱ�ȭ ����.
		 * 
		 * �׷� Integer�� ���� ��?
		 * (1) DB������ ���� null������ ó���ؾ� �ϴ� ���
		 * (2) Arraylist�� ���� ���� ��������� �ϴ� ��� ex.ArrayList<Integer>
		 * 
		 * */
		
		// 4. 3���� �����ϴٺ��� ������vs�ڷ����� �������� ���� ���� ������.
		
		/* �� �⺻�� : Stack �޸𸮿� ����ȴ�.
		 * �� ������ : Object Ŭ������ ����ϴ� ��� Ŭ����.
		 *          �����ÿ� Heap �޸� ������ �����ϰ�, Garbage Collector�� ���鼭 �޸� ����.
		 *          �޸� �ּҸ� �����ϴ� ����.(�� �ּҶ�� ������ ��...��ȣ�ϴ�)
		 * 
		 * 2022.2.11 �̰Ŷ����� ��α׸� �� �����ôµ� ����� ����� ����� ���� ����.
		 *           å�̶� �缭 �о���ҵ�. 
		 *  */
		
		
		
	}
}
