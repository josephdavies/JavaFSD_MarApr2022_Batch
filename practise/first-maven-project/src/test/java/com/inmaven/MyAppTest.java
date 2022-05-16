package com.inmaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyAppTest 
{
	@Test
	public void testApp()
    {
        assertEquals(0,new MyApp().calculateSomething());
    }
}
