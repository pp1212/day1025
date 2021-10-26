package com.sist.homework02;

import java.util.StringTokenizer;

public class MyDate {
	private String year;
	private String month;
	private String date;
	
	public MyDate(String str)throws IllegalArgumentException  {
		
		if(str == null) {
			throw new IllegalArgumentException("문자열을 입력하세요!");
		}
		
		StringTokenizer st = new StringTokenizer(str, "/");
		year = st.nextToken();
		month = st.nextToken();
		date = st.nextToken();
	
	}

	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", date=" + date + "]";
	}	
	
}		
		
		
	
	
