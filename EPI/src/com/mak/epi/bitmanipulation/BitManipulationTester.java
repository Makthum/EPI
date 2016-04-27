package com.mak.epi.bitmanipulation;

import org.junit.Assert;
import org.junit.Test;
import com.mak.epi.exceptions.InvalidIndexException;

public class BitManipulationTester {
	
	@Test
	public void testcreateBitManipulation(){
		BitManipulation object= new BitManipulation();
		Assert.assertNotNull(object);
	}

	@Test
	public void testcreateBitManipulation1(){
		BitManipulation object= new BitManipulation(12312222);
		Assert.assertNotNull(object);
	}

	@Test
	public void testequals(){
		BitManipulation object= new BitManipulation(123);
		BitManipulation object2= new BitManipulation();
		object2.setValue(123);
		Assert.assertTrue(object.equals(object2));
	}
	@Test
	public void testSwapBits(){
		BitManipulation temp = new BitManipulation(64);
		temp.swapBits(0,6);
		Assert.assertEquals(temp.toBinaryString(),Integer.toBinaryString(1));
	}

}
