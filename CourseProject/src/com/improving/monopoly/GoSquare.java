package com.improving.monopoly;

public class GoSquare extends Square {
	public GoSquare() {
		super("Go");
	}

	@Override
	public void landOnBy(Player player) {
		// nothing
	}

	@Override
	public void passOverBy(Player player) {
		player.credit(200);
	}
}
