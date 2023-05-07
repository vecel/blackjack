package pl.karandysm.blackjack.players;

import pl.karandysm.blackjack.deck.Deck;

public class Player extends AbstractPlayer {

	// dodac zetony
	
	
	public Player(Deck deck) {
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
