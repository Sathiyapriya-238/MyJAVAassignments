package org.system;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposit the money to the account");
	}

	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	

	}

}
