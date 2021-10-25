package com.sist.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Player {
	
	//카드의 숫자를 map의key로 함
	String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	
	//map을 만듬
	HashMap<String, Integer> map = new HashMap<String, Integer>();


	public TreeSet<Integer> pairList = new TreeSet<Integer>();
	//쌍을 이루는 카드목록을 담아 놓기 위한 리스트를 생성함	
	//카드가 이렇다면 2342346	위의 리스트에 2,3,4 넣음
	
	
	
	
	
	
	//게임을 하는 경기자가 CardDeck으로부터 카드를 하나씩 가져와서 담을 리스트 만든다
	private ArrayList<Card> list = new ArrayList<Card>();
	
	public Player() {
		int value = 2;
		
		for(int i=0;i<number.length;i++) {		//카드의 숫자 배열만큼 반복실행
			map.put(number[i], value++);		//map에 key는 카드의 숫자로 하고 value는 2부터 1씩 증가한 값으로 함
		}
		
	}
	
	//카드를 매개변수로 받아서 나의 list에 담는다
	public void getCard(Card card) {
		list.add(card);
	}
	
	public int pairProcess(String player) {
		int n = 0;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				
				//i번째 카드의 숫자와 j번째 숫자가 동일한지 판별
				if(list.get(i).getNumber().equals(list.get(j).getNumber())) { 
					
					//동일한 카드의 숫자(아직 문자열입니다)에 해당하는 정수를 map으로부터 뽑아옴 
					n = map.get(list.get(i).getNumber());
					
					//쌍을 이루는 숫자를 pairList에 담아요
					pairList.add(n);
				}
			}
		}
		
		Iterator<Integer>iter = pairList.iterator();
		
		//pairList가 3개 일때
		//큰값 두개만 뽑아오도록 한다
		if(pairList.size() == 3) {			//쌍을 이루는 카드가 3장이면
			//3개니까 반복 안돌고 그냥
			System.out.println(player +"는 투페어입니다.");
			iter.next();						//숫자가 가장 작은 카드는 버려요
			n = iter.next() + iter.next();		//나머지 두개의 숫자 두개를 더하기 해요
		}else if(pairList.size() == 2) {		//쌍을 이루는 카드가 2장이면 
			System.out.println(player +"는 투페어입니다.");
			n = iter.next() + iter.next();		//두개의 숫자를 더하기 해요
		}else if(pairList.size() == 1) {		//쌍을 이루는 카드가 한 개면
			System.out.println(player +"는 원페어입니다.");
			n = iter.next();					//그 숫자를 n에 담아요
		}
		return n;
	}
	
	
	//원페어인지 판별하여
	//누가 이겼는지 처리하려면 원페어인 숫자를 반환하려고 함
	//숫자가 2~10까지는 Integer.parseInt() 하면 정수로 만들어 주는데 문제가 없음
	//그런데 카드의 숫자가 "Jack","Queen","King","Ace" 이런것들은 Integer.parseInt를 못함
	//그래서 "2"를 key로 하고 2를 value로 하는 map을 만듬
	//~ "Jack"이라는 key에는 11이라는 value를 담음
	
	
	//나의 카드를 모두 출력
	public void showCards() {
		System.out.println(list);
	}
	
	
}
