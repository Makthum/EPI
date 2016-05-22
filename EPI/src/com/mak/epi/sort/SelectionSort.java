package com.mak.epi.sort;

import java.lang.Comparable;



public class SelectionSort {

	public static void sort(Comparable[] values){
		int size=values.length;
		for(int i=0;i<size;i++){
			for(int j=i;j<size;j++){
				if(less(values[j],values[i]))
					swap(values,i,j);
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