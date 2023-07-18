package com.whiteoakindia.whiteoak.common.exceptionHandler;

import com.whiteoakindia.whiteoak.common.exception.ServiceException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Objects;

@ControllerAdvice
public class AppExceptionHandler {



        @ExceptionHandler(value = ServiceException.class)
        public ResponseEntity<Object> handleServiceException(ServiceException ex){

            Object erroMessageDescription = ex.getMessage();

            if(!Objects.isNull(ex.getIndexError())){
                erroMessageDescription=(ex.getIndexError());
            }

            return new ResponseEntity<>(erroMessageDescription,new HttpHeaders(),ex.getStatusCode());

        }


}
