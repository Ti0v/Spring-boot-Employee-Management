package com.TheCompany.Comp.Employy.Eror;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TheresNoElimests extends RuntimeException{
    private String name;
}
