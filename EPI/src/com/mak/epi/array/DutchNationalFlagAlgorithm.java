package com.mak.epi.array;

import java.util.*;
import com.mak.epi.exceptions.UnInitializedException;


public class DutchNationalFlagAlgorithm{
	private List<Integer> values;
	private int pivot;

	public DutchNationalFlagAlgorithm(List<Integer> values,int pivot){
		this.values=values;
		this.pivot=pivot;
	}

	public void sortValues(){
		if(this.values==null)
			throw new UnInitializedException();
		int smaller=0;
		int equal=0;
		int larger =this.values.size()-1;
		while(equal<larger){
			if(this.values.get(equal)<pivot){
				Collections.swap(this.values,smaller++,equal++);
			}
			else if(this.values.get(equal)==pivot)
				equal++;
			else if(this.values.get(equal)>pivot){
				Collections.swap(this.values,equal,larger--);
			}

		}

	}

	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		for(Integer val:this.values){
			sb.append(val);
			sb.append("\t");
		}
		return sb.toString();
	}



}