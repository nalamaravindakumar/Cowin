package com.cowin.model;

import java.time.LocalDate;

public class Vaccinated {
	private int vaccinatedId;
	private int appointmentId;
	private int doseNumber;
	private double centerId;
	private int vaccineId;
	private String vaccineName;
	private LocalDate vaccinatedDate;

	public int getVaccinatedId() {
		return vaccinatedId;
	}

	public void setVaccinatedId(int vaccinatedId) {
		this.vaccinatedId = vaccinatedId;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public double getCenterId() {
		return centerId;
	}

	public int getDoseNumber() {
		return doseNumber;
	}

	public void setDoseNumber(int doseNumber) {
		this.doseNumber = doseNumber;
	}

	public int getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}

	public void setCenterId(double centerId) {
		this.centerId = centerId;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public LocalDate getVaccinatedDate() {
		return vaccinatedDate;
	}

	public void setVaccinatedDate(LocalDate vaccinatedDate) {
		this.vaccinatedDate = vaccinatedDate;
	}

}
