package Week3Day2;

public class Bank extends Sbi implements CIBIL,PNB{

	@Override
	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("123244");
	}

	@Override
	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("780");
	}

	@Override
	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("9.5");
	}

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("2000000");
	}

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("5000000");
	}
public static void main(String[] args) {
	Bank loan= new Bank();
	loan.ItLoan();
	loan.cibilScore();
	loan.creditScore();
	loan.maximumLoanAmount();
	loan.minimumBalance();
}
}
