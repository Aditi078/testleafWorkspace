package week3.day1assignment;

public class AxisBank extends BankInfo {

	void deposit() {
		System.out.println("Axis Bank Deposit Account");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
		bank.saving();
		bank.fixed();

	}

}
