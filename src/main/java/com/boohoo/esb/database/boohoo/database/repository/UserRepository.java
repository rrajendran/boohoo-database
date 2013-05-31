package com.boohoo.esb.database.boohoo.database.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.boohoo.esb.database.boohoo.database.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
  List<User> findByLastname(String lastname);
  List<User> getUser(@Param("firstName")String firstName);
}