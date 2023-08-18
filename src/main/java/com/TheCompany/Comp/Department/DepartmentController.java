package com.TheCompany.Comp.Department;

import com.TheCompany.Comp.Employy.Employ;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/department")
public class DepartmentController {
    DepartmentService service;
    DepartmentController(DepartmentService service){
        this.service = service;

    }



    @GetMapping( value = {"/departments","departments/"})
    public List<Department> GetAllDep(){
        return  service.GetAllEmp();

    }

    @GetMapping( value = "/empOfDep/{id}")
    public List<Department> GetAlEmpByDepartmentID( @PathVariable int id){
        return  service.GetAlEmpByDepartmentID(id);

    }


    @PostMapping
    public Department InsetDep(@RequestBody Department department) {
        return service.InsetDep(department);

    }




     @DeleteMapping("/deleteByID/{id}")
        public String deleteByID(@PathVariable("id") int id){
            service.deleteByID(id);
            return "The Department Is Deleted";

    }
}
