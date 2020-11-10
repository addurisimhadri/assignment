package com.simhadri;

public class DataNotAvailble extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final String msg;
	public DataNotAvailble(String msg) {
		super();
		this.msg = msg;
	}	

}
