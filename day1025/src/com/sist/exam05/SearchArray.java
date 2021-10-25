package com.sist.exam05;

public class SearchArray {

	//search �޼ҵ� body�ȿ� ���� ��ü�� ������ �� �־��!
	//�̿� ���� �޼ҵ�ȿ��� ���ܰ� �߻��� ��
	//1.�޼ҵ�ȿ��� ���� try~catch�� ����ó�� ����
	//2.�޼ҵ� ȣ���ϴ� ������ ���ܸ� ���� ���� - ������ �� ���
	public static int search(int []arr,int value) throws NotFoundException{
		int index = -1;
		//�� �ʱⰪ�� -1�� �ֳ���?
		//�迭�� �ε����� 0���� �����ϴ� �ε����� �� �� ���� ���� �����ϱ� ���Ͽ� -1�� ��
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				index = i;
			}
		}
		
		//value�� �迭���� ã�Ҵ��� �� ã�Ҵ��� ��� �� �� �ֳ���?
		if (index == -1) {
			throw new NotFoundException("�迭�� ã�� �� "+value+"��(��) �����ϴ�.");
		}
		//1.�޼ҵ� �ȿ��� ����ó��
		//2.ȣ���ϴ� �ʿ��� ����ó��(throws)
		
		return index;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int []data = {2,4,10,9,6};
			int n = search(data, 100);
			//�޼ҵ� ȣ���ϴ� �ʿ��� ����ó���� �ؾ� ��
			System.out.println(n);
		}catch(NotFoundException e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}

}
