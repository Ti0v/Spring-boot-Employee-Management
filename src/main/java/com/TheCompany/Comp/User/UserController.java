package com.TheCompany.Comp.User;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
  public final   UserService service;
  public  UserController(UserService service){
      this.service = service;
  }

  @GetMapping("/findById/{id}")
    public User findById( @PathVariable(value = "id") Long id){

        return   service.findById(id);
    }
    @GetMapping("/userName/{username}")
    public Optional<User> findUserName(@PathVariable(value = "username") String username){
     return service.findUserName(username);
    }

    @GetMapping("/users")
    public List<User> GetAllUsers(){

        return  service.GetAllUsers();
    }
   @PostMapping(value = {"/",""})
    public void InsetUser( @RequestBody User user){
       service.InsetUser(user);

    }
    @PutMapping(value = "/edit")
    public User editUser(@RequestBody User user){
        service.edit(user);
        return  user;
    }
    @DeleteMapping("/deleteByID/{id}")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);

    }
}
