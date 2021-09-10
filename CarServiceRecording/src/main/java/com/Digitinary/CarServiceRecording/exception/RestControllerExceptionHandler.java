package com.Digitinary.CarServiceRecording.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Digitinary.CarServiceRecording.payload.ApiResponse;

@ControllerAdvice
public class RestControllerExceptionHandler {

	@ExceptionHandler(DateNotFoundException.class)
	@ResponseBody
	public ResponseEntity<ApiResponse> resolveException(DateNotFoundException exception) {
		ApiResponse apiResponse = new ApiResponse(false, "No Data found");
		return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(BadRequestException.class)
	@ResponseBody
	public ResponseEntity<ApiResponse> resolveException(BadRequestException exception) {
		ApiResponse apiResponse = exception.getApiResponse();

		return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(DataIntegrityViolationException.class)
	@ResponseBody
	public ResponseEntity<ApiResponse> resolvedddException(DataIntegrityViolationException exception) {
		ApiResponse apiResponse = new ApiResponse(false, "Parameter(s) ID Not Found");

		return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);
	}

}
