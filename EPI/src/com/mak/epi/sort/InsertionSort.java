package com.mak.epi.sort;

import java.lang.Comparable;


public class InsertionSort {


	// 5 0 1 4 2
	// step 1 --> 5 0 1 4 2
	// step 2 ---> 0 5 1 4 2
	// step 3 ---> 0 1 5 4 2 
	// step 4 ---> 0 1 4 5 2
	// step 5 ---> 0 1 2 4 5
	public static void sort(Comparable[] val){

		int size = val.length;
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j>0;j--){
				if(less(val[j],val[j-1]))
					swap(val,j,j-1);
			}
		}

	}

	private static boolean less(Comparable a,Comparable b){
		return b.compareTo(a)>0;
	}

	private static void swap(Comparable[] a , int i , int j){
		Comparable temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}