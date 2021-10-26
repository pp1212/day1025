package com.sist.homework01;

public class BankAccount {

	private int balance;
	
	public void deposit(int money) {
		balance += money;
		System.out.println("�ܾ�:"+balance);
	}
	
	public void withdraw(int money) throws NegativeBalanceException{
		if(balance < money) {
			throw new NegativeBalanceException("�ܾ��� �ʰ��Ͽ����ϴ�.");
		}else {
			balance -= money;
			System.out.println("�ܾ�:"+balance);
		}
	}
}
