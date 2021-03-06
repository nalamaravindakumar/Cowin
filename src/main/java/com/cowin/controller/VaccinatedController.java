package com.cowin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cowin.model.Vaccinated;
import com.cowin.service.VaccinatedService;

@RestController
@RequestMapping("/vaccinateddetails")
public class VaccinatedController {

	@Autowired
	private VaccinatedService vaccinatedService;

	@PostMapping("/save")
	public ResponseEntity<Vaccinated> createVaccinationDeteils(@RequestBody Vaccinated Vaccinated) {

		Vaccinated finalVaccinationDetails = vaccinatedService.saveVaccinated(Vaccinated);
		return new ResponseEntity<>(finalVaccinationDetails, HttpStatus.CREATED);
	}

	@GetMapping("/getallvaccinated")
	public List<Vaccinated> getAllVaccinatedDetails() {
		List<Vaccinated> vaccinatedList = vaccinatedService.getAllVaccinatedDetails();

		return vaccinatedList;

	}

	@GetMapping("/getallvaccinatedbydosenumber/{doseNumber}")
	public List<Vaccinated> getAllVaccinatedDetailsByDoseNumber(@PathVariable("doseNumber") int doseNumber) {
		List<Vaccinated> vaccinatedList = vaccinatedService.getAllVaccinatedDetailsByDose(doseNumber);

		return vaccinatedList;
	}

	@GetMapping("/getvaccinatedbyid/{id}")
	public Vaccinated getVaccinatedDetailsById(@PathVariable("id") int id) {
		Vaccinated vaccinated = vaccinatedService.getVaccinatedDetailsById(id);

		return vaccinated;
	}

}
