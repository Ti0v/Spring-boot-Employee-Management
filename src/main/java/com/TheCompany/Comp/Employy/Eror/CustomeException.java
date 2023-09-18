package com.TheCompany.Comp.Employy.Eror;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomeException extends RuntimeException{
    private String name;
}
