package com.TheCompany.Comp.Employy;

import com.TheCompany.Comp.Department.Department;
import com.TheCompany.Comp.Department.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
    public EmployeeService service;
    EmployeeController(EmployeeService service){
        this.service = service;

    }
    @GetMapping( value = {"/employees","employees/"})
    public List<Employ> GetAllEmp(){
        return  service.GetAllEmp();

    }
    @GetMapping( value = {"/employees/ByDepartmentId/{id}"})
    public List<Employ> GetEmpByDepartment( @PathVariable("id") int id){
        return service.getEmployeeByDepartment(id);

    }


    @GetMapping(value = "/findByID/{id}")
    public Optional<Employ> findByID( @PathVariable("id") int id){

        return service.findByID(id);
    }
    @PostMapping(value = {"/",""})
    public String InsetEmp( @RequestBody Employ employ){

        service.InsetEmp(employ);
        return "The Employee Is ADD";
    }
    @DeleteMapping("/deleteByID/{id}")
    public void delete(@PathVariable("id") int id){

        service.delete(id);

    }
}
