import pl.karandysm.blackjack.game.Game;
import pl.karandysm.blackjack.players.CasualPlayerFactory;

public class Demonstrator {
	
	public static void main(String[] args) {
		Game game = new Game(2);
		
		game.addPlayer(new CasualPlayerFactory());
		game.addPlayer(new CasualPlayerFactory());
		
		game.init();
		
		System.out.println(game);
		
		game.playRound();
	}
}
