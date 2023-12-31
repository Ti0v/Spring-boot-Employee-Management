package com.TheCompany.Comp.Employy;

import com.TheCompany.Comp.Department.Department;
import com.TheCompany.Comp.User.User;
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
    @Column(length = 20)
    private String nameOfEmp;
    private double salary;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn( name = "user_Id")
    private User user;


    @ManyToOne(cascade = CascadeType.MERGE)
    private Department department;

}
