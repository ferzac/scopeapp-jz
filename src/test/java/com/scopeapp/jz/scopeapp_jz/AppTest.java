package com.scopeapp.jz.scopeapp_jz;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for App.
 * @author Jorge Zavala
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void exceptionTest()
    {
    	String []in = null;
    	try{
    		App.run(in);
    		assertTrue( false );
    	}catch(Exception e){
    		assertTrue( true );
    	}
    }
    
    @Test
    public void stringParametersTest()
    {
    	String []in ={"a"};
    	String result = "";
    	
    	result = App.run(in);
    	assertTrue(!result.isEmpty());	
    }
    
    @Test
    public void oneParameterTest()
    {
    	String []in ={"1"};
    	String result = "";
    	
    	result = App.run(in);
    	assertTrue(result.isEmpty());
    }
    
    @Test
    public void twoParametersTest()
    {
    	String []in ={"2", "10"};
    	String result = "";
    	
    	result = App.run(in);
    	assertTrue(result.isEmpty());
    }
    
    @Test
    public void wrongSecondParameterTest()
    {
    	String []in ={"1","s"};
    	String result = "";
    	
    	result = App.run(in);
    	assertTrue(!result.isEmpty());	
    }
}
