package com.sist.exam06;

public class ProcessScore {

	public ProcessScore(int []arr) throws IllegalScore {
		super();
		// TODO Auto-generated constructor stub
		
		double tot = 0;
		double avg;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < 0) {
				throw new IllegalScore("성적이 음수일 수 없습니다.");
			}else {
				tot += arr[i];
			}
		}
		avg = tot / arr.length;
		System.out.println("평균:" + avg );
		
		
		
	}


}
