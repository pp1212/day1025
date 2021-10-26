package com.sist.homework03;

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
			
			result = number1 / number2;
			System.out.println(result);
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요!");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없어요!");
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		}finally {
			System.out.println("작업종료");
		}
	}

}
