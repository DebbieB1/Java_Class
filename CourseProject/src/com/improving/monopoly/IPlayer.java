package com.improving.monopoly;

public interface IPlayer {

	Tokens getToken();

	int getMoney();

	Square getLocation();

	int getLastRoll();

}
