package com.nelioalves.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException (String msg) {
		super(msg);
		
	}
	
	//Sobrecarga para quando receber uma exceção anterior
	public ObjectNotFoundException (String msg, Throwable causa) {
		super(msg, causa);
	}

}
