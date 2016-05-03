package com.mak.epi.exceptions;

public class UnInitializedException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnInitializedException(){
		super("Object Not Initialized Correctly");
	}
}