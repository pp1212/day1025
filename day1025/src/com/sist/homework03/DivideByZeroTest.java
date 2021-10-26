package com.sist.homework03;

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
			
			result = number1 / number2;
			System.out.println(result);
		}catch(InputMismatchException e) {
			System.out.println("������ �Է��ϼ���!");
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �����!");
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		}finally {
			System.out.println("�۾�����");
		}
	}

}
