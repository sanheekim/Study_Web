package lifecoding.java1.myapp;

public class AccountingMethod {
	
	// main �Լ� �ٱ����� �����߱⿡ ���������� �ƴ� '��������'
	public static double valueOfSupply;
	public static double vatRate;
	private static double expenseRate;

	public static void main(String[] args) {
		
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		
		double vat = getVat();
		double total = getTotal();
		double expense = getExpense();
		double income = getIncome();
		
		double dividend1 = getDiviend1();
		double dividend2 = getDiviend2();
		double dividend3 = getDiviend3();

		print();
		
	}

	private static void print() {
		System.out.println("Value of supply(���ް�) : "+ valueOfSupply);
		System.out.println("VAT(�ΰ���ġ��) : "+ getVat());
		System.out.println("Total(�ǸŰ�) : "+ getTotal());
		System.out.println("Expense(���) : "+ getExpense());
		System.out.println("Income(������) : "+ getIncome());
		System.out.println("Dividend(���)1 : " + getDiviend1());
		System.out.println("Dividend(���)2 : " + getDiviend2());
		System.out.println("Dividend(���)3 : " + getDiviend3());
	}

	private static double getDiviend1() {
		return getIncome() * 0.5;
	}
	
	private static double getDiviend2() {
		return getIncome() * 0.3;
	}
	
	private static double getDiviend3() {
		return getIncome() * 0.2;
	}

	private static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVat();
	}
	
	public static double getVat() {
		return valueOfSupply * vatRate;
	}

}
