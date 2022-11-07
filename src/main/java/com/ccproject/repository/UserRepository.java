package com.ccproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ccproject.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
