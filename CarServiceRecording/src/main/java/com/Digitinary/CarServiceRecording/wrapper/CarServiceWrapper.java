package com.Digitinary.CarServiceRecording.wrapper;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class CarServiceWrapper {

	@NotNull
	@Range(min = 1)
	private Long carId;

	@NotNull
	@Range(min = 1)
	private Long serviceId;

}
