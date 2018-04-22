package com.scopeapp.jz.scopeapp_jz.part2;

/**
 * Outputs a X of arbitrary height
 * @author Jorge Zavala
 * Minimum height 3
 */
public class DrawX 
{
	private int height;
	
	public int getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}
	
	public void drawX()
	{
		for (int row = 0; row < height; row++) {
	        for (int col = 0; col < height; col++) {
	            if (row == col || row + col == height - 1) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}
