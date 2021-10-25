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
		
		//인덱스 변수를 사용하는 보통의 for 루프
		for(int i=0 ;i<list.size()  ;i++) {
			//Double data = list.get(i);
			//double n = data.doubleValue();
			double n = list.get(i);	//auto UnBoxing
			System.out.println(n);
		}
		
		System.out.println("========================================");
		
		//for each 구문 사용
		for(double n : list) {		//auto UnBoxing -> Double말고 double로 쓰면 됨 
			System.out.println(n);
		}
		
		System.out.println("========================================");
		
		//Iterator(반복자) 사용 => 데이터가 있는 만큼 반복수행하기 위한 클래스
		Iterator<Double> iter = list.iterator();
		while( iter.hasNext() ) {
			double n = iter.next();
			System.out.println(n);
		}
	}

}

	
