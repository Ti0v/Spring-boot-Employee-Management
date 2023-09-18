package com.TheCompany.Comp.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sec_Role")
public class Role {
    @Id
    private Long id;
    private  String name;
}
