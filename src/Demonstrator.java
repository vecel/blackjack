import pl.karandysm.blackjack.game.Game;
import pl.karandysm.blackjack.players.CasualPlayerFactory;
import pl.karandysm.blackjack.players.Player;

public class Demonstrator {
	
	public static void main(String[] args) {
		Game game = new Game(2);
		
		game.addPlayer(new CasualPlayerFactory());
		game.addPlayer(new CasualPlayerFactory());
		
		game.init();
		
		System.out.println(game);
	}
}
