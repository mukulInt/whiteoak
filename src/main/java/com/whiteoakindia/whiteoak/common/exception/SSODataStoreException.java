package com.whiteoakindia.whiteoak.common.exception;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SSODataStoreException extends RuntimeException{
        

	private static final long serialVersionUID = 1L;
	
	private final int statusCode;
	
	public SSODataStoreException(String statusMessage , int errorCode) {
		super(statusMessage);
		this.statusCode=errorCode;
	}

}
