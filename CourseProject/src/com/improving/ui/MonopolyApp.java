package com.improving.ui;

import com.improving.monopoly.Game;
import com.improving.monopoly.Player;

public class MonopolyApp {

	public static void main(String[] args) {
      Game game = new Game(2);
      Player[] players = game.getPlayers();
      
      for (int i = 0; i < 10; i++) {
		game.playRound();
		for (Player player : players) {
			System.out.println(player.getToken() + " rolled a " + player.getLastRoll());
			System.out.println(player.getToken() + " landed on " + player.getLocation().getName());
			System.out.println(player.getToken() + " new balance is " + player.getMoney());

		} 
	}

	}

}
