package com.example.demo.cntls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.empaddressmodel.EmpAddressModel;
import com.example.demo.empaddressresponse.EmpAddressResponse;
import com.example.demo.empaddressservice.EmpAddressService;

@RestController
public class EmpAdderessController {
	@Autowired
	EmpAddressService service;

	@PostMapping("post")
	public EmpAddressModel postData(@RequestBody EmpAddressModel emp) {
		return service.savedata(emp);

	}

	@GetMapping("/get/{id}")
	public ResponseEntity<EmpAddressResponse> getAllData(@PathVariable String id) {
		EmpAddressResponse emp= service.getdata(id);
		return ResponseEntity.status(HttpStatus.OK).body(emp);

	}

}
