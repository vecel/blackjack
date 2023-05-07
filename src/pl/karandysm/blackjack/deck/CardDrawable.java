package pl.karandysm.blackjack.deck;

import java.util.List;

public interface CardDrawable {
	Card drawCard(boolean visible);
	List<Card> getFacedUpCards();
}
