package pl.karandysm.blackjack.players;

import pl.karandysm.blackjack.deck.CardDrawable;

public class StupidPlayerFactory implements PlayerFactory {

	@Override
	public Player createPlayer(CardDrawable deck) {
		return new StupidPlayer(deck);
	}

	
}
