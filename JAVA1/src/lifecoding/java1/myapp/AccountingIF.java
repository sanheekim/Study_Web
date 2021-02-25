package lifecoding.java1.myapp;

public class AccountingIF {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		// ������ �� �� �̻��̰� ������ �� �������� �ٸ�.
		if (income > 1000.0) {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		} else {
			dividend1 = income * 1.0;
			dividend2 = income * 0;
			dividend3 = income * 0;
		}
		System.out.println("Value of supply(���ް�) : "+ valueOfSupply);
		System.out.println("VAT(�ΰ���ġ��) : "+ vat);
		System.out.println("Total(�ǸŰ�) : "+ total);
		System.out.println("Expense(���) : "+ expense);
		System.out.println("Income(������) : "+ income);
		System.out.println("Dividend(���)1 : " + dividend1);
		System.out.println("Dividend(���)2 : " + dividend2);
		System.out.println("Dividend(���)3 : " + dividend3);
	}

}
