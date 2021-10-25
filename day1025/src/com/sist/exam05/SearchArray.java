package com.sist.exam05;

public class SearchArray {

	//search 메소드 body안에 예외 객체가 생성될 수 있어요!
	//이와 같이 메소드안에서 예외가 발생될 때
	//1.메소드안에서 직접 try~catch로 예외처리 가능
	//2.메소드 호출하는 쪽으로 예외를 전파 가능 - 지금은 이 경우
	public static int search(int []arr,int value) throws NotFoundException{
		int index = -1;
		//왜 초기값을 -1을 주나요?
		//배열의 인덱스는 0부터 시작하니 인덱스가 될 수 없는 값을 설정하기 위하여 -1로 줌
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				index = i;
			}
		}
		
		//value를 배열에서 찾았는지 못 찾았는지 어떻게 알 수 있나요?
		if (index == -1) {
			throw new NotFoundException("배열에 찾는 값 "+value+"가(이) 없습니다.");
		}
		//1.메소드 안에서 예외처리
		//2.호출하는 쪽에서 예외처리(throws)
		
		return index;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int []data = {2,4,10,9,6};
			int n = search(data, 100);
			//메소드 호출하는 쪽에서 예외처리를 해야 함
			System.out.println(n);
		}catch(NotFoundException e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}

}
