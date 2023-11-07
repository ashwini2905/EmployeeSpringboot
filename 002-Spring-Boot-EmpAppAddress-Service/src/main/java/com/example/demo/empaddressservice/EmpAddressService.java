package com.example.demo.empaddressservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.empaddressmodel.EmpAddressModel;
import com.example.demo.empaddressrepo.EmpAddressRepo;
import com.example.demo.empaddressresponse.EmpAddressResponse;

@Service
public class EmpAddressService {
	@Autowired
	EmpAddressRepo repo;
	@Autowired
	private org.modelmapper.ModelMapper mapper;

	public EmpAddressModel savedata(EmpAddressModel emp) {
		return repo.save(emp);
	}

	public EmpAddressResponse getdata(String id) {
		Optional<EmpAddressModel> reps = repo.findById(id);
		EmpAddressResponse empResponse = mapper.map(reps, EmpAddressResponse.class);
		return empResponse;
	}

}
