package com.Digitinary.CarServiceRecording.service;

import java.util.List;

import com.Digitinary.CarServiceRecording.entity.CarService;
import com.Digitinary.CarServiceRecording.wrapper.CarServiceWrapper;

public interface CarServicesService {

	List<CarService> findByCustomer(Long id);

	List<CarService> findByCar(Long id);

	void add(CarServiceWrapper request);

 }
