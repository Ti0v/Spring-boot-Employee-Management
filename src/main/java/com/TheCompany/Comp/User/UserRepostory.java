package com.TheCompany.Comp.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostory extends JpaRepository<User, Long> {
     User findByUserName(String user);


}
