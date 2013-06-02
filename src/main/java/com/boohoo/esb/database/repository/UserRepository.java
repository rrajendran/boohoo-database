package com.boohoo.esb.database.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.boohoo.esb.database.entity.User;
@Component
@Transactional(readOnly = true)

public interface UserRepository extends CrudRepository<User, Long> {
  List<User> findByLastname(String lastname);
  List<User> getUser(@Param("firstName")String firstName);
}