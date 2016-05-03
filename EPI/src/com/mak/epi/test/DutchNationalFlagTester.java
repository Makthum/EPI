package com.mak.epi.test;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;
import com.mak.epi.array.DutchNationalFlagAlgorithm;

public class DutchNationalFlagTester {
	@Test
	public void testCreateObject(){
		Integer[] a={0,2,1,2,1,0,2,1,2};
		DutchNationalFlagAlgorithm obj = new DutchNationalFlagAlgorithm(Arrays.asList(a),1);
		Assert.assertEquals(a[1].intValue(),2);
	}

	@Test
	public void testSortArray(){
		Integer[] a={0,2,1,2,1,0,2,1,2};
		DutchNationalFlagAlgorithm obj = new DutchNationalFlagAlgorithm(Arrays.asList(a),0);
		obj.sortValues();
		System.out.println(obj.toString());
		Assert.assertEquals(a[a.length-1].intValue(),2);
	}
}