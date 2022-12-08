package com.BikkadIT.Blogging.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.Blogging.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
