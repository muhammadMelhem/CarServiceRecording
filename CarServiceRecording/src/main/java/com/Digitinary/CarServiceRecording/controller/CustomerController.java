package com.Digitinary.CarServiceRecording.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Digitinary.CarServiceRecording.entity.Customer;
import com.Digitinary.CarServiceRecording.service.CustomerService;

@RestController
@RequestMapping("/api/customer/")
public class CustomerController {
	final Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	CustomerService customerService;

	@GetMapping
	public List<Customer> findAll() {
		logger.info("calling find All customer");

		return customerService.findAll();

	}

}
