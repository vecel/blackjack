package pl.karandysm.blackjack.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Deck implements CardDrawable {

	private Stack<Card> deck = new Stack<>();
	private List<Card> facedUpCards = new ArrayList<>();

	public Deck(int decksNumber) {
		for (int i = 0; i < decksNumber; i++)
			initDeck();
	}
	
	public int size() {
		return deck.size();
	}
	
	@Override
	public Card drawCard(boolean visible) {
		Card card = deck.pop();
		if (visible)
			facedUpCards.add(card);
		return card;
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	@Override
	public List<Card> getFacedUpCards() {
		return facedUpCards;
	}

	@Override
	public String toString() {
		return deck.toString();
	}

	private void initDeck() {
		for (int i = 1; i <= 13; i++) {
			for (Suit suit : Suit.values()) {
				deck.add(new Card(i, suit));
			}
		}

	}
}
