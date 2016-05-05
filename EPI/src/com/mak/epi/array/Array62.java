package com.mak.epi.array;

import java.util.List;


public class Array62 {
	public List<Integer> number;

	public Array62(List<Integer> value){
		this.number=value;
	}

	public void increment(){
		int size=this.number.size();
		this.number.set(size-1,this.number.get(size-1)+1);
		for(int i=size-1;i>0 && this.number.get(i)==10;i-- ){
			this.number.set(i,0);
			this.number.set(i-1,this.number.get(i-1)+1);
		}
		if(this.number.get(0)==10){
			this.number.set(0,0);
			this.number.add(0,1);
		}

	}

	@Override
	public String toString(){
		int size=this.number.size();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<size;i++){
			sb.append(this.number.get(i));
		}
		return sb.toString();
	}
		
}