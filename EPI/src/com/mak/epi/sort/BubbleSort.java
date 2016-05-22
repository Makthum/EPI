package com.mak.epi.sort;

import java.lang.Comparable;

public class BubbleSort {

		// 5 0 1 4 2
		// 0 1 4 2 5
		// 0 1 2 4 5
		// 0 1 2 4 5
		// 0 1 2 4 5

	public static void sort(Comparable[] val){
		int size=val.length;
		for(int i=size-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(less(val[j+1],val[j]))
					swap(val,j,j+1);
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