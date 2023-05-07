import pl.karandysm.blackjack.game.Game;
import pl.karandysm.blackjack.players.CasualPlayerFactory;
import pl.karandysm.blackjack.players.StupidPlayerFactory;

public class Demonstrator {
	
	public static void main(String[] args) {
		Game game = new Game(2);
		
		game.addPlayer(new CasualPlayerFactory());
		game.addPlayer(new CasualPlayerFactory());
		game.addPlayer(new StupidPlayerFactory());
		
		game.init();
		
		System.out.println(game);
		
		game.playRound();
	}
}
