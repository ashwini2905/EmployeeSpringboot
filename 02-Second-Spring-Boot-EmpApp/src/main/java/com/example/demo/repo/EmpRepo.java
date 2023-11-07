package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.EmpModel;

public interface EmpRepo extends MongoRepository<EmpModel, String> {

}
