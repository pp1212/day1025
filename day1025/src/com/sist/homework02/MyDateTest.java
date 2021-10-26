package com.sist.homework02;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String data = "";
			MyDate date = new MyDate(data);
			System.out.println(date);
		}catch(IllegalArgumentException e) {
			System.out.println("예외처리:"+e.getMessage());
		}
	}
}
