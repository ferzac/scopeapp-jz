package com.scopeapp.jz.scopeapp_jz.part1;

/** 
 * Part 1
 * Outputs a christmas tree of arbitrary height
 * @author Jorge Zavala
 * Minimum height 2
 */
public class ChristmasTree 
{
	private int height;
	private final String character = "*";
	private final String space = " ";
	
	public void displayTree()
	{
		for (int i = 0; i < height; i++) //Rows 
    	{
    		for (int j = 0; j < height - i; j++)
    			System.out.print(space);
    		for (int k = 0; k < (2 * i + 1); k++)
    			System.out.print(character);
    		System.out.println();
    	}
	}

	public int getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}
}
