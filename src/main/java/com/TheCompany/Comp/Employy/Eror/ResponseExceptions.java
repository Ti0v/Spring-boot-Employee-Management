package com.TheCompany.Comp.Employy.Eror;

import lombok.Getter;
import lombok.Setter;

import org.springframework.web.servlet.tags.EditorAwareTag;

import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseExceptions {
   private String massege;
   private boolean stause;
   private LocalDateTime date;


   public ResponseExceptions(){

   }
    public  ResponseExceptions(String msg){
        this.massege = msg;
        stause = false;
        date = LocalDateTime.now();


    }

}
