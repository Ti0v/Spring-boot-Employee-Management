package com.TheCompany.Comp.Department;

import com.TheCompany.Comp.Employy.Employ;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    public final DepartmentRepostory repostory;

    public DepartmentService(DepartmentRepostory repostory) {
        this.repostory = repostory;
    }



    public List<Department> GetAlEmpByDepartmentID(int id){
        return  repostory.findDepartmentById(id);

    }
    public List<Department> GetAllEmp(){
        return  repostory.findAll();

    }
    public Department InsetDep(Department department){
        return repostory.save(department);

    }
    public void deleteByID(int id){
        repostory.deleteById(id);
    }
}
