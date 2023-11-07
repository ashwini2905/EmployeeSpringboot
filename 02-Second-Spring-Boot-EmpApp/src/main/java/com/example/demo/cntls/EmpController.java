package com.example.demo.cntls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmpModel;
import com.example.demo.response.EmpResponse;
import com.example.demo.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService service;

	
	@PostMapping("/post")
	public ResponseEntity<EmpModel> postdata(@RequestBody EmpModel emp) {
	    EmpModel updatedEmp = service.postDataAll(emp); // Modify emp based on the service result
	    return ResponseEntity.status(HttpStatus.OK).body(updatedEmp);
	}


	@GetMapping("/get/{id}")
	public ResponseEntity<EmpResponse> getdata(@PathVariable("id") String id) {
		EmpResponse employee = service.getempById(id);

		return ResponseEntity.status(HttpStatus.OK).body(employee);

	}

}
