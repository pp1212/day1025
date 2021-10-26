package com.sist.homework01;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BankAccount account = new BankAccount();
			account.deposit(10000);
			account.withdraw(20000);
		}catch(NegativeBalanceException e) {
			System.out.println("예외발생:" + e.getMessage());
		}
	}

}
