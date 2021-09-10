package com.Digitinary.CarServiceRecording.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Digitinary.CarServiceRecording.entity.Customer;
import com.Digitinary.CarServiceRecording.exception.DateNotFoundException;
import com.Digitinary.CarServiceRecording.repository.CustomerRepository;
import com.Digitinary.CarServiceRecording.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		List<Customer> customersList = customerRepository.findAll();

		if (customersList.isEmpty()) {
			throw new DateNotFoundException();
		}

		return customersList;
	}

}
