package com.whiteoakindia.whiteoak.common.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ServiceNullException extends RuntimeException{
        

	private static final long serialVersionUID = 1L;

	private final int statusCode;

	private final String succUrl;

	
	public ServiceNullException(String statusMessage , int code, String successUrlStr) {
		super(statusMessage);
		this.statusCode = code;
		this.succUrl = successUrlStr;
	}

}
