package com.cowin.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cowin.model.Vaccine;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class VaccineService {
	@Autowired
	private RestTemplate restTemplate;

	
	

	@HystrixCommand(fallbackMethod = "getVaccineFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"), })
	public Vaccine getVaccineDetails(int vaccineId) {

		Vaccine vaccine = null;

		String resourceUrl = "localhost:8087/cowin/vaccinateddetails" + vaccineId;

		ResponseEntity<Vaccine> vaccineResponseEntity = restTemplate.getForEntity(resourceUrl, Vaccine.class);

		if (vaccineResponseEntity.getStatusCode() == HttpStatus.OK) {
			vaccine = vaccineResponseEntity.getBody();

			return vaccine;
		}

		return vaccine;
	}
	@SuppressWarnings("unused")
	private Vaccine getVaccineFallback(int vaccineId) {
	Vaccine vaccine = new Vaccine();
	vaccine.setVaccineId(0);
	vaccine.setVaccineName("");
	vaccine.setCompanyName("");
	vaccine.setExpiryDate(LocalDate.of(0,0,0));
	vaccine.setManufacureDate(LocalDate.of(0,0,0));
	

	return vaccine;
	}

}
