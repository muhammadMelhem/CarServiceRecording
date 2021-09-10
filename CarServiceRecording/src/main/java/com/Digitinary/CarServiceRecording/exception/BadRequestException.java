package com.Digitinary.CarServiceRecording.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.Digitinary.CarServiceRecording.payload.ApiResponse;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1098936228382004317L;

	private ApiResponse apiResponse;

	public BadRequestException(ApiResponse apiResponse) {
		super();
		this.apiResponse = apiResponse;
	}

	public BadRequestException(String message) {
		super(message);
	}

	public BadRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApiResponse getApiResponse() {
		return apiResponse;
	}
}