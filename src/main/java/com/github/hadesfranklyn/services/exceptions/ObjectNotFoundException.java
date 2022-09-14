package com.github.hadesfranklyn.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException() {
		super();
	}

	
	public ObjectNotFoundException(String message) {
		super(message);
	}


	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}