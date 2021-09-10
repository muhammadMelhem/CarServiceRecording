package com.Digitinary.CarServiceRecording;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.Digitinary.CarServiceRecording.controller.CarServicesController;
import com.Digitinary.CarServiceRecording.entity.CarService;
import com.Digitinary.CarServiceRecording.wrapper.CarServiceWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(CarServicesController.class)
public class CustomerControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Autowired
	ObjectMapper mapper;

	@MockBean
	CarServicesController carServicesController;

	@Test
	public void findByCustomerTest() throws Exception {

		CarService carService = new CarService();
		carService.setServiceName("Oil change");

		List<CarService> carServices = new ArrayList<>(Arrays.asList(carService));

		Mockito.when(carServicesController.findByCustomer(6L)).thenReturn(carServices);

		mockMvc.perform(
				MockMvcRequestBuilders.get("/api/carServices/customer/6").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$[0].serviceName", is(carService.getServiceName())));

	}

	@Test
	public void findByCarTest() throws Exception {

		CarService carService = new CarService();
		carService.setServiceName("Car polish");

		List<CarService> carServices = new ArrayList<>(Arrays.asList(carService));
		Mockito.when(carServicesController.findByCar(5L)).thenReturn(carServices);

		mockMvc.perform(MockMvcRequestBuilders.get("/api/carServices/car/5").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$[0].serviceName", is(carService.getServiceName())));

	}

	@Test
	public void createTest() throws Exception {

		CarServiceWrapper carService = new CarServiceWrapper();
		carService.setCarId(4L);
		carService.setServiceId(1L);

		mockMvc.perform(MockMvcRequestBuilders.post("/api/carServices/").content(asJsonString(carService))
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isCreated());

	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}