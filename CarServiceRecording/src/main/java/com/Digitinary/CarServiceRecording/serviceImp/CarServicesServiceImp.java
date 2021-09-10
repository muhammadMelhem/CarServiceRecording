package com.Digitinary.CarServiceRecording.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Digitinary.CarServiceRecording.entity.CarService;
import com.Digitinary.CarServiceRecording.exception.BadRequestException;
import com.Digitinary.CarServiceRecording.exception.DateNotFoundException;
import com.Digitinary.CarServiceRecording.payload.ApiResponse;
import com.Digitinary.CarServiceRecording.repository.CarServicesRepository;
import com.Digitinary.CarServiceRecording.service.CarServicesService;
import com.Digitinary.CarServiceRecording.wrapper.CarServiceWrapper;

@Service
public class CarServicesServiceImp implements CarServicesService {

	@Autowired
	CarServicesRepository carServicesRepository;

	@Override
	public List<CarService> findByCustomer(Long id) {
		List<CarService> carServices = carServicesRepository.findByCustomer(id);

		if (carServices.isEmpty()) {
			throw new DateNotFoundException();
		}
		return carServices;
	}

	@Override
	public List<CarService> findByCar(Long id) {
		List<CarService> carServices = carServicesRepository.findByCar(id);

		if (carServices.isEmpty()) {
			throw new DateNotFoundException();
		}
		return carServices;
	}

	@Override
	public void add(CarServiceWrapper request) {
		
		boolean isExists = carServicesRepository.existsServicesCarsQuery(request.getServiceId(), request.getCarId());
		
		if (isExists) {
			ApiResponse apiResponse = new ApiResponse(Boolean.FALSE, "Service is already saved for the car");
			throw new BadRequestException(apiResponse);
		}
		carServicesRepository.add(request.getServiceId(), request.getCarId());
	}

}
