package com.Text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ErrorTextTest 
{
	@Test
	void Text()
	{
		assertEquals(20,new Maxjisuan().getMax(new int[]{-2,11,-4,13,-5,-2}),0);
	}
	
	@Test
	void Text1()
	{
		assertEquals(0,new Maxjisuan().getMax(new int[]{-2,-11,-4,-13,-5,-2}),0);
	}
	
	@Test
	void Text2()
	{
		assertEquals(37,new Maxjisuan().getMax(new int[]{2,11,4,13,5,2}),0);
	}
}
