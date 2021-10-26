package com.sist.homework01;

public class BankAccount {

	private int balance;
	
	public void deposit(int money) {
		balance += money;
		System.out.println("ÀÜ¾×:"+balance);
	}
	
	public void withdraw(int money) throws NegativeBalanceException{
		if(balance < money) {
			throw new NegativeBalanceException("ÀÜ¾×À» ÃÊ°úÇÏ¿´½À´Ï´Ù.");
		}else {
			balance -= money;
			System.out.println("ÀÜ¾×:"+balance);
		}
	}
}
