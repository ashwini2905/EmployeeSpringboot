package com.example.demo.empaddressrepo;

import java.util.Optional;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.query.Param;

import com.example.demo.empaddressmodel.EmpAddressModel;
@EnableMongoRepositories
public interface EmpAddressRepo extends MongoRepository<EmpAddressModel, String> {
	//Optional<EmpAddressModel> getdata(@Param("id")String id);
}
