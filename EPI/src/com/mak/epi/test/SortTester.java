package com.mak.epi.test;

import org.junit.Assert;
import org.junit.Test;
import com.mak.epi.sort.SelectionSort;
import com.mak.epi.sort.InsertionSort;
import com.mak.epi.sort.BubbleSort;

public class SortTester {

	@Test
	public void testSelectionSort(){
		Integer[] values= new Integer[] {4,2,1,5,0,10,12,3,99};
		SelectionSort.sort(values);
		for(Integer i:values)
			System.out.println(i.intValue());
		System.out.println("---------------------");
	}

	@Test
	public void testInsertionSort(){
		Integer[] values= new Integer[] {4,2,1,5,0,10,12,3,99};
		InsertionSort.sort(values);
		for(Integer i:values)
			System.out.println(i.intValue());
		System.out.println("---------------------");

	}

	@Test
	public void testBubbleSort(){
		Integer[] values= new Integer[] {4,2,1,5,0,10,12,3,99};
		BubbleSort.sort(values);
		for(Integer i:values)
			System.out.println(i.intValue());
		System.out.println("---------------------");
	}
}
