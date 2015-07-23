package com.improving.dice;
import java.util.Random;

public class  Die {
	
    private int faceValue;
	private int numberOfSides;
	
	public Die() 
{
		numberOfSides = 6;
		
}
	
	public Die(int numberOfSides)
	{
		this.numberOfSides = numberOfSides;
	}

public void roll()
{
	faceValue = (int)(Math.random() * numberOfSides ) + 1; 
}


public int getFaceValue()
{
	return faceValue;
}

}





	
	

