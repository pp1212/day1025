package com.sist.homework04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int number1, number2, result;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 정수: ");
			number1 = sc.nextInt();
			
			System.out.print("두 번째 정수: ");
			number2 = sc.nextInt();
			
			result = quotient(number1, number2);
			System.out.println(result);
		}catch(DivideByZeroException e) {
			System.out.println("예외처리:" + e.getMessage());
		}
	}
	
	public static int quotient(int numerator,int denominator) throws DivideByZeroException {
		if(denominator == 0)
			throw new DivideByZeroException("0으로 나눌 수 없어요!");
		return numerator / denominator;
	}

}
