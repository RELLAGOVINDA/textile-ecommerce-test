package com.example.SpringSeucrity.Repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringSeucrity.Entity.LoginUser;


public interface UserRepository extends JpaRepository<LoginUser, Long> {

    Optional<LoginUser> findByUsername(String username);

}

