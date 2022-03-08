package com.cowin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cowin.model.VaccinationCenter;

@Service
public class VaccinationCenterService {
	@Autowired
	private RestTemplate restTemplate;

	public VaccinationCenter getVaccinationCenterDetails(int centerId) {

		VaccinationCenter vaccinationcenter = null;

		String resourceUrl = null;

		ResponseEntity<VaccinationCenter> vaccinationCenterResponseEntity = restTemplate.getForEntity(resourceUrl,
				VaccinationCenter.class);

		if (vaccinationCenterResponseEntity.getStatusCode() == HttpStatus.OK) {
			vaccinationcenter = vaccinationCenterResponseEntity.getBody();

			return vaccinationcenter;
		}

		return vaccinationcenter;
	}

}
