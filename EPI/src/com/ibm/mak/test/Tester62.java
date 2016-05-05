package com.ibm.mak.test;

import org.junit.Assert;
import org.junit.Test;

import com.mak.epi.array.Array62;

import java.util.List;
import java.util.ArrayList;

public class Tester62{
	@Test
	public void testIncrement(){
		Array62 obj= new Array62(init62());
		obj.increment();
		Assert.assertEquals(obj.toString(),"1000");
	}

	private List<Integer> init62(){
		List<Integer> result= new ArrayList<Integer>();
		result.add(9);
		result.add(9);
		result.add(9);
		return result;
	}

}