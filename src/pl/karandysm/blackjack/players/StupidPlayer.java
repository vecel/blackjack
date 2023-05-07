package pl.karandysm.blackjack.players;

import pl.karandysm.blackjack.deck.CardDrawable;

/**
 * This player hits unless his hand's has over 21 points.
 * Always loses
 * 
 * @param  deck		a CardDrawable that is present in the current game
 *  
 * @author Mateusz Karandys
 *
 */

public class StupidPlayer extends Player {

	
	public StupidPlayer(CardDrawable deck) {
		super(deck);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		if (getHandPoints() > 21)
			stand();
		else
			hit();
	}

	@Override
	public String toString() {
		return "StupidPlayer " + super.toString();
	}

	
}
