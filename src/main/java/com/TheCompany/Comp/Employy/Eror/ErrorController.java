package com.TheCompany.Comp.Employy.Eror;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController

{
@ExceptionHandler({CustomeException.class})
    public ResponseEntity<?>responseEntity(CustomeException customeException){
        ResponseExceptions responseExceptions = new ResponseExceptions(customeException.getName());
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseExceptions);
    }
}
