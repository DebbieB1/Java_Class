package com.improving.monopoly;

public class LuxTaxSquare extends Square {
	public LuxTaxSquare() {
		super("Luxury Tax");
	}
	
	@Override
	public void landOnBy(Player player) {
		player.debit(75);
	}
}
