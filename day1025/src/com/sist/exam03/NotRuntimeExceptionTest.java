package com.sist.exam03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotRuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		try {
			FileWriter fw = new FileWriter("c:/work_day1025/hello.txt");
			fw.write("안녕하세요");
			fw.close();
		}catch(IOException e) {
			System.out.println("예외발생:"+ e.getMessage());
			//예외 메시지 출력
		}*/
		
		
		try {
			FileReader fr = new FileReader("c:/work_day1025/hello.txt");
			int ch;	// 한글자씩 읽어들여야 해서
			while(  (ch = fr.read())  !=  -1) {
				System.out.print(  (char)ch  );
			}
			fr.close();
		}catch(Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}
				
	}

}
