package com.sist.game;

public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CardDeck ��ü ����
		//�����ڿ� ���ؼ� 52���� ī�尡 ������
		CardDeck deck = new CardDeck();
		
		//shuffle�� ī�带 ���� ������
		deck.shuffle();
		
		//ī������� �� ����ڸ� 2�� ����
		Player p1 = new Player();
		Player p2 = new Player();
		
		//ù ��° ����� ī�带 �ϳ� �̾ƿɴϴ�
		p1.getCard(deck.deal());
		
		//�� ��° ����� ī�带 �ϳ� �̾ƿɴϴ�
		p2.getCard(deck.deal());
		
		//ù ��° ����� �ڽ��� ��� ī�� ���
		p1.showCards();
		
		//�� ��° ����� �ڽ��� ��� ī�� ���
		p2.showCards();
		
	}

}
