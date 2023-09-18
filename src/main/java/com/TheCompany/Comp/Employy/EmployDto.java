package com.TheCompany.Comp.Employy;

import com.TheCompany.Comp.Department.Department;
import com.TheCompany.Comp.User.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployDto {
    private int id;
    private String nameOfEmp;
    private double salary;
    private User user;
    private Department department;
}
