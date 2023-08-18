package com.TheCompany.Comp.Department;

import com.TheCompany.Comp.Employy.Employ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepostory extends JpaRepository<Department,Integer>{

 List<Department> findDepartmentById(int id);

}
