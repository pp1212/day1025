package com.sist.exam06;

public class ProcessScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int []data = {80,90,50,70,60};
			ProcessScore p1 = new ProcessScore(data);
		}catch(IllegalScore e) {
			System.out.println("예외발생:" + e.getMessage());
		}
	}

}
