package com.whiteoakindia.whiteoak.common.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RequestParamException extends RuntimeException{
        

	private static final long serialVersionUID = 1L;
	
	private final int statusCode;
	
	public RequestParamException(String statusMessage , int errorCode) {
		super(statusMessage);
		this.statusCode=errorCode;
	}

}
