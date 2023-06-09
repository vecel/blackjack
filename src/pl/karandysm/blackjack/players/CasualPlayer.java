package pl.karandysm.blackjack.players;

import pl.karandysm.blackjack.deck.CardDrawable;


/**
 * This player hits when his hand is below or equal 16 points, stands otherwise.
 * Plays like dealer
 * 
 * @param  deck		a CardDrawable that is present in the current game
 *  
 * @author Mateusz Karandys
 *
 */
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

	@Override
	public String toString() {
		return "CasualPlayer " + super.toString();
	}

	
}
