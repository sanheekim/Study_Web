package lifecoding.java1.basic;

public class StringApp {
	
	public static void main(String[] args) {
		
		// java������ ""�� ''�� �����ؼ� �����.
		System.out.println("Hello World"); // String, ���ڿ�
		// System.out.println('Hello World'); // error. java������ ''�� Ư���� ������Ÿ��(Character, ���� 1��)���� ǥ����
		System.out.println('H'); // Character, ���� 1��
		System.out.println("H"); // String, �� �������� ���ڿ�
		
		System.out.println("Hello "
				+ "World"); // �ٹٲ� �� ��.
		System.out.println("Hello \nWorld"); // \n�� new line�̶�� ������ �ٹٲ� ��.
		
		// java���� ""�� ������ ���۰� ���� �˸�.
		// \"�� escape��� ��.
		System.out.println("Hello \"World\""); // Hello "World"
		
		System.out.println("Hello World".length()); // 11. ���⸦ ������ ���ڼ��� ��.
		System.out.println("Hello, leezche ... bye. ".replace("leezche", "sanhee")); // leezche�� sanhee�� �ٲ�.
		
	}

}
