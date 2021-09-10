package com.Digitinary.CarServiceRecording.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Digitinary.CarServiceRecording.repository.CustomerRepository;
import com.Digitinary.CarServiceRecording.service.CarService;

@Service
public class CarServiceImp implements CarService {

	@Autowired
	CustomerRepository customerRepository;

}
