package com.BikkadIT.Blogging.services;

import java.util.List;

import com.BikkadIT.Blogging.entities.User;
import com.BikkadIT.Blogging.payloads.UserDto;



public interface UserService {

  UserDto createUser(UserDto user);

  UserDto updateUser(UserDto user,Integer userId);
  
  UserDto getUserById(Integer userId);
  
  List<UserDto> getAllUsers();
  
  void deleteUser(Integer userId);
  
  
  
  
  
  
}
