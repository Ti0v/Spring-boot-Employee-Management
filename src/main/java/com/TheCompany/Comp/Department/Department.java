package com.TheCompany.Comp.Department;

import com.TheCompany.Comp.Employy.Employ;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Department {
    @Id
    @GeneratedValue
    private  int id;


   @Column(length = 20 ,unique = true)
    private  String name;


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmploys(List<Employ> employs) {
        this.employs = employs;
    }

    @OneToMany(mappedBy = "department")
   List<Employ> employs;



}
