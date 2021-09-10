package com.Digitinary.CarServiceRecording.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Digitinary.CarServiceRecording.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
	boolean findByCustomer(String id);
}
