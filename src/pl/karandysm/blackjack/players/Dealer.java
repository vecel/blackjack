package pl.karandysm.blackjack.players;

import pl.karandysm.blackjack.deck.Deck;

public class Dealer extends AbstractPlayer {
	
	public Dealer(Deck deck) {
		super(deck);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		if (getHandPoints() < 16)
			hit();
		else
			stand();
		
	}

	@Override
	public void init() {
		hit();
		hit(false);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	
}
