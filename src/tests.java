import pl.karandysm.blackjack.game.Game;
import pl.karandysm.blackjack.players.Player;

public class tests {
	
	public static void main(String[] args) {
		Game game = new Game(2);
		
//		game.addPalyer(new Player(null));
		// potrzeba PlayerFactory bo nie wiadomo czym jest deck
		
		game.init();
		
		System.out.println(game);
	}
}
