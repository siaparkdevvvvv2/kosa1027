package test;

public class Ex03 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		// i = "10"; / ""�� �����ָ� ���ڿ��� ��
		String str = "10"; // ���ڿ��� ��� ""�� ǥ��!
		System.out.println(str);
		// char ch = '10'; / ''�� ������ ���ڿ� ��
		//(1���ڿ� 0���ڰ� ������ ����)
		char ch = '0'; // ������ ��� : ''�� ǥ��!
		System.out.println(ch);
		ch = '9';
		System.out.println(ch);
		ch = 0;
		System.out.println(ch); //���鹮��
		ch = '0';
		System.out.println(ch); 
		System.out.println((int)ch); 
		//String str1 = 'a';
		//char ch1 = "a";
	}

}