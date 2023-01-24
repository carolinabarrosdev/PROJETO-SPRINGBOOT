package com.springsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsuperior.userdept.entities.User;

public interface UserRepository  extends JpaRepository<User,Long>{
    
}
