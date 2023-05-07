package pl.karandysm.blackjack.deck;

public class Card {
	
	private int value;
	private Suit suit;
	private int points;
	
	public Card(int value, Suit suit) {
		this.value = value;
		this.suit = suit;
		initPoints();
	}
	
	public int getValue() {
		return value;
	}

	public int getPoints() {
		return points;
	}
	
	public boolean isAce() {
		return value == 1;
	}

	@Override
	public String toString() {
		return "Card [value=" + value + ",suit=" + suit + "]";
	}
	
	
	private void initPoints() {
		/*
		 * Ace has value 1 because in blackjack it can take values 1 or 11,
		 * 11 is considered when computing player's total points
		 * inside AbstractPlayer class getHandPoints() method
		 * */
		if (value > 10)
			points = 10;
		else
			points = value;
	}
	
	
	
}
