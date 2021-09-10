package com.Digitinary.CarServiceRecording.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Digitinary.CarServiceRecording.entity.CarService;
import com.Digitinary.CarServiceRecording.payload.ApiResponse;
import com.Digitinary.CarServiceRecording.service.CarServicesService;
import com.Digitinary.CarServiceRecording.wrapper.CarServiceWrapper;

@RestController
@RequestMapping("/api/carServices/")
public class CarServicesController {

	final Logger logger = LoggerFactory.getLogger(CarServicesController.class);

	@Autowired
	CarServicesService carServices;

	@GetMapping(value = "/customer/{customer_id}")
	public List<CarService> findByCustomer(@PathVariable("customer_id") Long id) {
		logger.info("calling /find By Customer id: {}", id);

		return carServices.findByCustomer(id);

	}

	@GetMapping(value = "/car/{car_id}")
	public List<CarService> findByCar(@PathVariable("car_id") Long id) {
		logger.info("calling /find By Car id: {}", id);

		return carServices.findByCar(id);

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@Valid @RequestBody CarServiceWrapper request) {
		logger.info("calling /create request: {}", request.toString());

		carServices.add(request);

	}

}
