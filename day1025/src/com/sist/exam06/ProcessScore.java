package com.sist.exam06;

public class ProcessScore {

	public ProcessScore(int []arr) throws IllegalScore {
		super();
		// TODO Auto-generated constructor stub
		
		double tot = 0;
		double avg;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < 0) {
				throw new IllegalScore("������ ������ �� �����ϴ�.");
			}else {
				tot += arr[i];
			}
		}
		avg = tot / arr.length;
		System.out.println("���:" + avg );
		
		
		
	}


}
