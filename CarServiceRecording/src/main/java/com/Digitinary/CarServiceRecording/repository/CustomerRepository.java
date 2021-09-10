package com.Digitinary.CarServiceRecording.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Digitinary.CarServiceRecording.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
