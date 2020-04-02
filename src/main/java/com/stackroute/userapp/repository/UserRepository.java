package com.stackroute.userapp.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.userapp.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

	
}
