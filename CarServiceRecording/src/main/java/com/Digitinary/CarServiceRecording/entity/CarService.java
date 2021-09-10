package com.Digitinary.CarServiceRecording.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "car_service")
@EqualsAndHashCode(callSuper = true)
@Data
public class CarService extends BaseEntity {

	@Column(name = "name")
	private String serviceName;

	@ManyToMany
	@JoinTable(name = "services_Cars", joinColumns = @JoinColumn(name = "carService_id"), inverseJoinColumns = @JoinColumn(name = "car_id"))
	@JsonIgnore
	private Set<Car> cars;

}
