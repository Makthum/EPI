package com.mak.epi.array;



public class Array64 {
	public int[] values;

	public Array64(int[] val){
		this.values=val;

	}

	// int a[] = {2,3,1,0,4}
	public boolean canWin(){
		int size=this.values.length;
		int maxReach=0;

		for(int i=0;i<size;i++){
			int currentReach=i+this.values[i];
			maxReach=maxReach>currentReach ? maxReach : currentReach;
		}

		if(maxReach>size)
			return true;

		return false;

	}
}