package com.Digitinary.CarServiceRecording.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DateNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DateNotFoundException() {
		super("No data found");
	}
}