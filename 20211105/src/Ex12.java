
public class Ex12 {

	public static void main(String[] args) {
		/* <���̽�>
		 * num = 1 			//��������
		 * def test():
		 * 		num = 100	//��������, <�ڹ�>��������
		 * 		print(num)
		 * test()
		 * print(num) 
		 */
		
		int num = 1;
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
			int a = 10;
		//���� i, a�� ���� �ȿ��� ��� ������ �������� ���� ������� �Ѵ�
		}
		/* ���� �ۿ��� ����Ϸ� �ϸ� ������ �߻��Ѵ�
		System.out.println(i);
		System.out.println(a);
		 */
		
		for (num = 1; num <= 10; num ++) {
			System.out.println(num);
			//���� �ۿ� �ִ� ���� num�� ���� �ȿ��� ��� �����ϴ�
		}
	}
}