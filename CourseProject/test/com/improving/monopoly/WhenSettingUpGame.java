package com.improving.monopoly;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class WhenSettingUpGame {
	

	@Test
	public void shouldHave40Squares() {
		// Setup
		Game game = new Game();

		// Square[] squares = game.getSquares();
		List<Square> squares = game.getSquares();

		assertEquals(40, squares.size());

	}

	@Test
	public void shouldHaveCorrectNameOnSquares() {
		Game game = new Game();

		// Square[] squares = game.getSquares();
		List<Square> squares = game.getSquares();
		Square startSquare = squares.get(0);
		assertEquals("Go", startSquare.getName());
		assertEquals("Square1", squares.get(1).getName());
		assertEquals("Square2", squares.get(2).getName());
		assertEquals("Square3", squares.get(3).getName());
		assertEquals("Square4", squares.get(4).getName());
		assertEquals("Square5", squares.get(5).getName());
		assertEquals("Square6", squares.get(6).getName());
		assertEquals("Square7", squares.get(7).getName());
		assertEquals("Square8", squares.get(8).getName());
		assertEquals("Square9", squares.get(9).getName());
		assertEquals("Square10", squares.get(10).getName());
		assertEquals("Square11", squares.get(11).getName());
		assertEquals("Square12", squares.get(12).getName());
		assertEquals("Square13", squares.get(13).getName());
		assertEquals("Square39", squares.get(39).getName());

	}

	@Test
	public void shouldDefaultTo2Players() {
		Game game = new Game();
		Player[] players = game.getPlayers();
		assertEquals(2, players.length);
	}

	@Test
	public void shouldAllowMorePlayers() {
		Game game = new Game(8);
		Player[] players = game.getPlayers();
		assertEquals(8, players.length);
	}

	@Test
	public void shouldHaveMoreThanOnePlayer() {
		try {
			Game game = new Game(1);
			fail("Should have thrown an exception");
		} catch (IllegalArgumentException e) {
			assertEquals("Not enough Players!", e.getMessage());
		}

		;
	}

	@Test
	public void shouldHaveLessThanNinePlayers() {
		try {
			Game game = new Game(10);
			fail("Should have thrown an exception");
		} catch (IllegalArgumentException e) {
			assertEquals("Too many Players!", e.getMessage());
		}

		;
	}

	@Test
	public void shouldSetTokensForPlayers() {
		Game game = new Game(8);
		Player[] players = game.getPlayers();

		assertEquals(Tokens.Thimble, players[0].getToken());
		assertEquals(Tokens.Shoe, players[1].getToken());
		assertEquals(Tokens.Car, players[2].getToken());
		assertEquals(Tokens.TopHat, players[3].getToken());
		assertEquals(Tokens.Battleship, players[4].getToken());
		assertEquals(Tokens.Iron, players[5].getToken());
		assertEquals(Tokens.Dog, players[6].getToken());
		assertEquals(Tokens.Wheelbarrow, players[7].getToken());
	}

	@Test
	public void shouldStartEachPlayerWith$1500() {
		Game game = new Game(8);

		Player[] players = game.getPlayers();

		for (int i = 0; i < players.length; i++) {
			assertEquals(1500, players[i].getMoney());
		}

	}

	@Test
	public void shouldStartEachPlayerOnTheFirstSquare() {
		Game game = new Game(8);

		Player[] players = game.getPlayers();
		// Square[] squares = game.getSquares();
		List<Square> squares = game.getSquares(); 
		for (int i = 0; i < players.length; i++) {
			Square startSquare = squares.get(0);
			assertEquals(startSquare, players[i].getLocation());

		}
	}

}
