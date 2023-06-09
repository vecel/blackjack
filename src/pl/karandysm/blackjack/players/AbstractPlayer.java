package pl.karandysm.blackjack.players;

import java.util.ArrayList;
import java.util.List;

import pl.karandysm.blackjack.deck.Card;
import pl.karandysm.blackjack.deck.CardDrawable;

public abstract class AbstractPlayer {
	
	private static int nextId = 0;
	private int id = nextId++;
	
	private List<Card> hand = new ArrayList<>();
	private CardDrawable deck;
	private boolean playing = true;
	
	public AbstractPlayer(CardDrawable deck) {
		this.deck = deck;
	}
	
	public abstract void play();
	
	public abstract void init();
	
	public boolean isPlaying() {
		return playing;
	}
	
	public int getHandPoints() {
		// Counting aces strategy can be improved inside child classes !
		int total = 0;
		int aces = 0;
		for (Card card : hand) {
			/**
			 * Ace has default points equals 1, but because it can take also 11 points value,
			 * we add 1 to total and later consider whether it should be 10 points more
			 */
			if (card.isAce())
				aces++;
			total += card.getPoints();
		}
		
		for (int i = 0; i < aces; i++) {
			if (total + 10 <= 21) {
				total += 10;
			}
		}
		
		return total;
	}

	/**
	 * Prepare player to next round,
	 * empty hand and set playing to true
	 */
	public void resetPlayer() {
		hand.clear();
		playing = true;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", hand=" + hand + ", playing=" + playing + ", totalPoints=" + getHandPoints() + "]";
	}

	protected void hit(boolean visible) {
		hand.add(deck.drawCard(visible));
	}
	
	protected void hit() {
		hand.add(deck.drawCard(true));
	}
	
	protected void stand() {
		playing = false;
	}
}
