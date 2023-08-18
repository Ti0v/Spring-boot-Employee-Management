package com.TheCompany.Comp.Employy.Eror;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErorController

{
@ExceptionHandler({TheresNoElimests.class})
    public ResponseEntity<?>responseEntity(TheresNoElimests theresNoElimests){
        ResponseExceptions responseExceptions = new ResponseExceptions(theresNoElimests.getName());
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseExceptions);
    }
}
