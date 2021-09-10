package com.Digitinary.CarServiceRecording.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "car")
@EqualsAndHashCode(callSuper = true)
public class Car extends BaseEntity {

	@Column(name = "car_name")
	private String carName;

	@Column(name = "car_vin")
	private String carVin;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

}
