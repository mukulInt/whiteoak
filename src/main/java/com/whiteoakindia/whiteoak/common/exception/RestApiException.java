package com.whiteoakindia.whiteoak.common.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RestApiException extends RuntimeException{
        

	private static final long serialVersionUID = 1L;

	private final int statusCode;
	
	public RestApiException(String statusMessage , int code) {
		super(statusMessage);
		this.statusCode = code;
	}

}
