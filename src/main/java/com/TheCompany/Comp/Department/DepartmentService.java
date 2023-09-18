package com.TheCompany.Comp.Department;

import com.TheCompany.Comp.Employy.Eror.CustomeException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public Department InsetDep(Department department){
        var x = repostory.findById(department.getId());
        if(x.isEmpty())
        return repostory.save(department);
        else {
            System.out.println("Mazen");
            throw  new CustomeException("Department Is exist");
        }

    }
    public Department Update(Department department){
        return repostory.save(department);

    }
    public void deleteByID(int id){
        repostory.deleteById(id);
    }
}
