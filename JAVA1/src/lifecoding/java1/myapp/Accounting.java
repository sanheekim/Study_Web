package lifecoding.java1.myapp;

public class Accounting {

	public static void main(String[] args) {
		
		System.out.println("Value of supply(���ް�) : "+10000.0);
		System.out.println("VAT(�ΰ���ġ��) : "+ (10000.0*0.1));
		System.out.println("Total(�ǸŰ�) : "+ (10000.0 + 10000.0*0.1));
		System.out.println("Expense(���) : "+ (10000.0*0.3));
		System.out.println("Income(������) : "+ (10000.0 - 10000.0*0.3));
		System.out.println("Dividend(���)1 : " + (10000.0 - 10000.0*0.3) * 0.5);
		System.out.println("Dividend(���)2 : " + (10000.0 - 10000.0*0.3) * 0.3);
		System.out.println("Dividend(���)3 : " + (10000.0 - 10000.0*0.3) * 0.2);
	}

}
