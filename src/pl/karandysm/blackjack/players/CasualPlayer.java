package pl.karandysm.blackjack.players;

import pl.karandysm.blackjack.deck.CardDrawable;

public class CasualPlayer extends Player {

	public CasualPlayer(CardDrawable deck) {
		super(deck);
		
	}

	@Override
	public void play() {
		if (getHandPoints() <= 16)
			hit();
		else
			stand();
	}

	
}
