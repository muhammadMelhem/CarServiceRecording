package com.Digitinary.CarServiceRecording;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.Digitinary.CarServiceRecording.controller.CustomerController;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(CustomerController.class)
public class CarServicesControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Autowired
	ObjectMapper mapper;

	@MockBean
	CustomerController customerController;

	@Test
	public void findAllTest() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/api/customer/").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

	}

}