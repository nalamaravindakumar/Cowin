package com.cowin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cowin.model.Appointment;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class AppointmentService {
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getAppointmentFallback", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"), })
	public Appointment getAppointmentDetails(int appointmentId) {

		Appointment appointement = null;

		String resourceUrl = "/cowin/appointdetails/" + appointmentId;

		ResponseEntity<Appointment> appointementResponseEntity = restTemplate.getForEntity(resourceUrl,
				Appointment.class);

		if (appointementResponseEntity.getStatusCode() == HttpStatus.OK) {
			appointement = appointementResponseEntity.getBody();

			return appointement;
		}

		return appointement;
	}

	@SuppressWarnings("unused")
	private Appointment getAppointmentFallback(int appointmentId) {
		Appointment appointment = new Appointment();
		appointment.setAppointmentId(0);
		appointment.setCenterId(0);
		appointment.setDoseNumber(0);
		appointment.setTypeOfVaccine("");

		return appointment;
	}

}
