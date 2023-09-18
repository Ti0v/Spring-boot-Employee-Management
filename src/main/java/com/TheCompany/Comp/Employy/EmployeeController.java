package com.TheCompany.Comp.Employy;

import com.TheCompany.Comp.Department.Department;
import com.TheCompany.Comp.Department.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.hibernate.internal.CoreLogging.logger;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);


    public EmployeeService service;
    EmployeeController(EmployeeService service){
        this.service = service;

    }
    @GetMapping( value = {"/employees","employees/"})
    public List<Employ> GetAllEmp(){
        logger.info("The Employyss is call");

        return  service.GetAllEmp();

    }


    @GetMapping(value = "/findByID")
    public Optional<Employ> findByID( @RequestParam int id){
        logger.info("Find By Id Is call");


        return service.findByID(id);
    }
    @PostMapping(value = {"/",""})
    public String InsetEmp( @RequestBody Employ employ){

        service.InsetEmp(employ);
        return "The Employee Is ADD";
    }
    @PutMapping(value = "/update")
    public String update( @RequestBody Employ employ){

        service.InsetEmp(employ);
        return "The Employee Is Updated";
    }
    @DeleteMapping("/deleteByID/{id}")
    public void delete(@PathVariable(value = "id") int id){

        service.delete(id);

    }
}
