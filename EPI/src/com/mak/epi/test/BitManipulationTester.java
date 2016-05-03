package com.mak.epi.test;

import org.junit.Assert;
import org.junit.Test;

import com.mak.epi.bitmanipulation.BitManipulation;

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

	@Test 
	public void testReverseBits(){
		BitManipulation temp= new BitManipulation(6);
		Assert.assertEquals(temp.toBinaryString(),Integer.toBinaryString(6));
		Assert.assertEquals(temp.reverseBits(),Integer.toBinaryString(3));
	}

	@Test
	public void testClosestIntWithSameWeight(){
		BitManipulation temp = new BitManipulation(6);
		Assert.assertEquals(temp.closestIntWithSameWeight(),5);
	}

}
