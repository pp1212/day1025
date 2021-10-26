package com.sist.homework04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int number1, number2, result;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("ù ��° ����: ");
			number1 = sc.nextInt();
			
			System.out.print("�� ��° ����: ");
			number2 = sc.nextInt();
			
			result = quotient(number1, number2);
			System.out.println(result);
		}catch(DivideByZeroException e) {
			System.out.println("����ó��:" + e.getMessage());
		}
	}
	
	public static int quotient(int numerator,int denominator) throws DivideByZeroException {
		if(denominator == 0)
			throw new DivideByZeroException("0���� ���� �� �����!");
		return numerator / denominator;
	}

}
