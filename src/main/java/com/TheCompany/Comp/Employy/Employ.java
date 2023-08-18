package com.TheCompany.Comp.Employy;

import com.TheCompany.Comp.Department.Department;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Employ
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameOfEmp;
    private double salary;
    @ManyToOne
    @JsonIgnore
    private Department department;



}
