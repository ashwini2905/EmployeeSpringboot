package com.example.demo.empaddressconfig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpAddressConfig {

	@Bean
	ModelMapper modelMapperBean() {
		return new ModelMapper();
	}

}
