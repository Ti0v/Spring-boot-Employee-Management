package com.TheCompany.Comp.Department;

import com.TheCompany.Comp.Employy.Employ;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Department {
     @Id
     @GeneratedValue
     private  int id;
     @Column(length = 20 ,unique = false)
     private  String name;
     @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
     @JsonIgnore
     private List<Employ> employs;

}
