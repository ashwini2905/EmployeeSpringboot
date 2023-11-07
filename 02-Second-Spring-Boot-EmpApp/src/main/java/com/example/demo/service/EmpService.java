package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmpModel;
import com.example.demo.repo.EmpRepo;
import com.example.demo.response.EmpResponse;

@Service
public class EmpService {

	@Autowired
	private EmpRepo repo;
	@Autowired
	private org.modelmapper.ModelMapper mapper;

	public EmpModel postDataAll(EmpModel emp) {
		return repo.save(emp);
	}

	public EmpResponse getempById(String id) {
		Optional<EmpModel> emp = repo.findById(id);
		EmpResponse empResponse = mapper.map(emp, EmpResponse.class);
		return empResponse;
	}

}
