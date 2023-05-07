package pl.karandysm.blackjack.players;

import pl.karandysm.blackjack.deck.CardDrawable;

public class Player extends AbstractPlayer {

	// dodac zetony
	
	
	public Player(CardDrawable deck) {
		super(deck);
	}

	@Override
	public void play() {
		// TODO
	}
	
	@Override
	public void init() {
		hit();
		hit();
	}
	
	private void doubleDown() {
		
	}
	
	private void split() {
		
	}
	
	private void insurance() {
		
	}
}
