package lifecoding.java1.myapp;

public class AccountingArray {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		//double rate1 = 0.5;
		//double rate2 = 0.3;
		//double rate3 = 0.2;
		// ��ó�� rate��� �������� ���ؼ� �ٸ� ����� �� �������� ���� �� �ٸ� ���� �Ἥ �򰥸� �� ����.
		// �װ� �����ϱ� ���� �� ������ �� ���� ��������� �迭�� ����.
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];

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
