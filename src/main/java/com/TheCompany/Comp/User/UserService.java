package com.TheCompany.Comp.User;

import com.TheCompany.Comp.Employy.Eror.CustomeException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService  {
    public final UserRepostory repostory;
    public  UserService(UserRepostory repostory){
        this.repostory= repostory;
    }
    public List<User> GetAllUsers(){
        if(!repostory.findAll().isEmpty()){
            return  repostory.findAll();
        }else
            throw new CustomeException("There is No Users");

}


    public void InsetUser(User user){
        repostory.save(user);

    }
    public Optional<User> findUserName(String username){
        Optional<User> currentUser= Optional.ofNullable(repostory.findByUserName(username));
     if(currentUser.isPresent()){
    return  currentUser;
    }
    else throw  new CustomeException("userName not found");


    }
    public User findById(Long id){
     Optional<User> x =   repostory.findById(id);
     if (x.isPresent()){
         return   repostory.findById(id).get();
     }else
         throw new CustomeException("The Id not Founded");


    }


    public void delete(Long id){
        findById(id);
        repostory.deleteById(id);
    }
    public void edit(User user){
        findById(user.getId());
        User user1 = new User(user.getId(), user.getUserName(), user.getPassword(), user.getRoles());
        repostory.save(user1);

    }

    
}
