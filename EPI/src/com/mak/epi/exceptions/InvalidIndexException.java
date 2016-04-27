package com.mak.epi.exceptions;


public class InvalidIndexException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidIndexException(){
		super("Invalid Index is provided");
	}
}