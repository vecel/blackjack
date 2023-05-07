package pl.karandysm.blackjack.players;

import pl.karandysm.blackjack.deck.CardDrawable;

public interface PlayerFactory {
	Player createPlayer(CardDrawable deck);
}
