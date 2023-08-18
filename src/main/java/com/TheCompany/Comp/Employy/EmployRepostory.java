package com.TheCompany.Comp.Employy;

import com.TheCompany.Comp.Department.Department;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployRepostory  extends JpaRepository<Employ, Integer> {

    List<Employ> findEmployByDepartment_Id( int id);
}
