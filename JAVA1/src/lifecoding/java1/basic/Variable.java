package lifecoding.java1.basic;

public class Variable {
	
	public static void main(String[] args) {
		
		// a = 1; // ������Ÿ���� ��� �� �ż� error
		int a = 1; // Number -> integer(=����)
		System.out.println(a);
		
		// int b = 1.1; // 1.1�� ������ �ƴ� �Ǽ�(real number)�̹Ƿ� error
		double b = 1.1; // Real Number -> double(=�Ǽ�)
		
		String c = "Hello World";
		System.out.println(c);
		
		String name = "sanhee";
		System.out.println("Hello, sanhee ... sanhee ... sanhee ...bye");
		System.out.println("Hello, "+name+" ... "+name+" ... sanhee ...bye");
		
		double VAT = 10.0;
		System.out.println(10.0);
		System.out.println(VAT);
		
		// CASTING : ������ Ÿ���� ��ȯ�ϴ� ��
		double d = 1.1;
		double e = 1;
		double e2 = (double) 1;
		System.out.println(e); // 1������ double�̴ϱ� �ڵ����� 1.0�� ����.
		System.out.println(e2);
		int f = (int) 1.1; // (int) : 1.1�� double�ε� �װ� ������ int�� �ٲٰڴٴ� ��.
		System.out.println(f);
		
		// 1 to String
		String g = Integer.toString(1);
		System.out.println(g); // ���ڰ� �ƴ϶��ڿ� 1�� ����.
		System.out.println(g.getClass()); // getClass�� ���� g�� ���� �ִ� ���� � ������Ÿ������ �˷���. // class java.lang.String
		
	}

}
