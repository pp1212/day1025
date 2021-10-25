package com.sist.exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> list = new ArrayList<Double>();
		list.add(3.4);
		list.add(2.7);
		list.add(5.5);
		
		//�ε��� ������ ����ϴ� ������ for ����
		for(int i=0 ;i<list.size()  ;i++) {
			//Double data = list.get(i);
			//double n = data.doubleValue();
			double n = list.get(i);	//auto UnBoxing
			System.out.println(n);
		}
		
		System.out.println("========================================");
		
		//for each ���� ���
		for(double n : list) {		//auto UnBoxing -> Double���� double�� ���� �� 
			System.out.println(n);
		}
		
		System.out.println("========================================");
		
		//Iterator(�ݺ���) ��� => �����Ͱ� �ִ� ��ŭ �ݺ������ϱ� ���� Ŭ����
		Iterator<Double> iter = list.iterator();
		while( iter.hasNext() ) {
			double n = iter.next();
			System.out.println(n);
		}
	}

}

	
