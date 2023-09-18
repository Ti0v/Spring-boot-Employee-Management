package com.TheCompany.Comp.Employy;

import com.TheCompany.Comp.Employy.Eror.CustomeException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
      public final EmployRepostory repostory;

    public EmployeeService(EmployRepostory repostory) {
        this.repostory = repostory;
    }

    public List<Employ> GetAllEmp(){
        if(!repostory.findAll().isEmpty()){
            return  repostory.findAll();
        }else {
            throw new CustomeException("The is No Employee");
        }


    }

    public List<Employ> getEmployeeByDepartment(int id){
        return repostory.findEmployByDepartment_Id(id);

    }

    public void InsetEmp(Employ employ){

        repostory.save(employ);

    }
    public Optional<Employ> findByID(int id){
        var current = repostory.findById(id);
        if(current.isPresent())
            return current;
        else
            throw new CustomeException(" The ID: "+id+" Not found");
    }
   public void delete(int id){
        findByID(id);
       repostory.deleteById(id);
   }
}
