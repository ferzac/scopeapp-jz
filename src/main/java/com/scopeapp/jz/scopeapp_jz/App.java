package com.scopeapp.jz.scopeapp_jz;

import com.scopeapp.jz.scopeapp_jz.part1.ChristmasTree;
import com.scopeapp.jz.scopeapp_jz.part2.DrawX;

/**
 * ScopeApp Test program
 * @author Jorge Zavala
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(run(args));
    }
    
    public static String run (String []args)
    {
    	ChristmasTree tree = new ChristmasTree();
    	DrawX drawX = new DrawX();
    	int height = 0;
    	String sintaxis = "scopeapp-jz.jar <1|2> <height> \r\n";
    	StringBuffer result = new StringBuffer();
    	
    	if (args.length == 0){
    		result.append("Please enter 1 to draw a Tree or 2 to draw a X\r\n");
    		result.append(sintaxis);
    		result.append("Example: \r\n");
    		result.append("      $> java -jar scopeapp-jz.jar 1 10 \r\n");
    		
    	}else{
    		try {
    			int opt = Integer.parseInt(args[0]);
    			
    			switch (opt)
        		{
    	    		case 1: // Part 1
    	    			height = 2;
    	    			
    	    			if (args.length >= 2 )
    	    			height = Integer.parseInt(args[1]) >= 2 ?Integer.parseInt(args[1]):height;
    	    			
    	    			tree.setHeight(height);
    	    			tree.displayTree();
    	    			break;
    	    		case 2: // PART 2
    	    			height = 3;
    	    			
    	    			if (args.length >= 2 )
    	        			height = Integer.parseInt(args[1]) >= 3 ?Integer.parseInt(args[1]):height;
    	        			
    	        		drawX.setHeight(height);
    	    			drawX.drawX();
    	    			break;
    	    		default:
    	    			result.append("Oops!! there is just 2 options 1 or 2 \r\n");
    	    			result.append(sintaxis);
        		}
    		}catch(NumberFormatException e){
    			result.append("Please use just numbers \r\n");
    			result.append(sintaxis);
    		}catch(Exception ex){
    			result.append("Unexpected ERROR happen \r\n");
    			ex.printStackTrace();
    		}
    	}
    	return result.toString();
    }
}
