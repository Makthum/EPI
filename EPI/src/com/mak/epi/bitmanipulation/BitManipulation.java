package com.mak.epi.bitmanipulation;


import com.mak.epi.exceptions.InvalidIndexException;

public class BitManipulation {
	private long value;

	public BitManipulation(long value){
		this.value= value;
	}

	public BitManipulation(){
		super();
	}

	public void setValue(long value){
		this.value=value;
	}

	public long getValue(){
		return this.value;
	}

	// index starts from 0
	public void swapBits(int locA,int locB){
		//create temp value 
		long result= this.value;
		if(locA <0 | locB < 0)
			throw new InvalidIndexException();
		// extract the bits in locA && locB
		// need to swap the bits only if they are not same
		// example let the number be 11101110 and locA & locB be  2 and 5
		// then 1L << locA = 10 1L<< locB = 10000  and ORing both the value = 00010
		// 11101110 ^ 00010010 = 111111100
		if(((result>>locA) & 1 )!= ((result>>locB) & 1)){
			//set the bitmask for both the locations and XOR against the original value
			result=result^((1L<<locA) | (1L << locB));
		}
		this.value=result;
	}

	public String toBinaryString(){
		long bitMask= 1L<< 31;
		StringBuffer sb= new StringBuffer();
		while(bitMask>0){
			char c= (bitMask & this.value)>0 ? '1': '0';
			sb.append(c);
			bitMask=bitMask>>1;
		}
		return sb.toString().replaceFirst ("^0*", "");
	}

	@Override
	public boolean equals(Object o){
		if(o instanceof BitManipulation){
			BitManipulation temp=(BitManipulation)o;
			return this.value==temp.getValue();
		}
		return false;
	}

	 

}