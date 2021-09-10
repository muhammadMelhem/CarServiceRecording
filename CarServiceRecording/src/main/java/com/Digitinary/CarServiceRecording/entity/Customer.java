package com.Digitinary.CarServiceRecording.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "customer")
@EqualsAndHashCode(callSuper = true)
@Data
public class Customer extends BaseEntity {

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "customer")
	@JsonIgnore
	private Set<Car> cars;

}
