package com.mak.epi.exceptions;

public class NonPositiveIntegerException extends RuntimeException {

	public NonPositiveIntegerException(){
		super("Number should be a non-negative integer");
	}
}
