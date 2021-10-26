package com.sist.homework05;

import java.util.Scanner;

public class Lab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int []arr = new int [10];
		for (int i=0; i<arr.length; i++) {
			System.out.print(i+1 + "번째 수를 입력하세요");
			arr[i] = sc.nextInt();
		}
		
		getAverage(arr);
		
	}

	public static void getAverage(int []arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println("평균:"+avg);
	}
}
