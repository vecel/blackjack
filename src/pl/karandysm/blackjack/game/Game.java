package pl.karandysm.blackjack.game;

import java.util.ArrayList;
import java.util.List;

import pl.karandysm.blackjack.deck.Deck;
import pl.karandysm.blackjack.players.Dealer;
import pl.karandysm.blackjack.players.Player;
import pl.karandysm.blackjack.players.PlayerFactory;

public class Game {
	
	private Deck deck;
	private Dealer dealer;
	private List<Player> players;
	
	public Game(int decksNumber) {
		deck = new Deck(decksNumber);
		dealer = new Dealer(deck);
		players = new ArrayList<>();
	}
	
	public void addPlayer(PlayerFactory playerFactory) {
		players.add(playerFactory.createPlayer(deck));
	}
	
	public void init() {
		deck.shuffle();
		dealer.init();
		for (Player player : players)
			player.init();
	}

	@Override
	public String toString() {
		return "Game [\ndeck = " + deck + ",\ndealer = " + dealer + ",\nplayers = " + players + "\n]";
	}
	
	
}
