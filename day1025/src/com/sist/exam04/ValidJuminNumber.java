package com.sist.exam04;

import java.util.Scanner;

public class ValidJuminNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin;
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(하이픈을 입력하세요)==>");
		jumin = sc.next();
		
		int []n = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//800101-1234567 
		//인덱스가 6번째는 계산에 참여하지 않음
		//문자열의 길이는 14자
		//반복실행해야 할 인덱스는 12		=> i<jumin.length()-1
		
		int sum = 0;
		for(int i=0;i<jumin.length()-1;i++) {
			if(i != 6) {
				sum += Integer.parseInt( jumin.charAt(i)+"" ) * n[i];  //+""하면 문자열됨
			}
		}
		
		sum = sum % 11;
		sum = 11 - sum;
		if(sum == 10) {
			sum = 0;
		}
		if(sum == 11) {
			sum = 1;
		}
		
		int check = Integer.parseInt(jumin.charAt(13)+"");	
		//char은 바로 int로 못 바꾸고 ""붙이고 Integer.parseInt해서 정수로 바꿔야 함
		//charAt()의 결과는 char입니다
		//char를 문자열로 만들기 위하여 빈문자 ""으로 더하기 해 준다
		//그렇게 만들어진 문자열을 Integer.parseInt를 이용하여 정수로 만들 수 있음
		
		if(sum == check) {
			System.out.println("올바른 주민등록번호입니다.");
		}else {
			try {
				throw new InValidJuminNumberException("올바른 주민번호 형식이 아닙니다.");
				//여기에 왜 에러가 났을까?
				//우리가 만든 InValidJuminNumberException은 RuntimeException의 후손이 아님
				//그래서 예외처리를 해야 함
			}catch(InValidJuminNumberException e){
				System.out.println("예외발생:"+e.getMessage());
			}
		}
		
	}

}
