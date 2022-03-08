package com.cowin.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccinated_tbl")
public class VaccinatedEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vaccinated_Id")
	private int vaccinatedId;

	@Column(name = "appointment_Id")
	private int appointmentId;

	@Column(name = "dose_Number")
	private int doseNumber;

	@Column(name = "center_Id")
	private double centerId;

	@Column(name = "vaccine_Id")
	private int vaccineId;

	@Column(name = "vaccine_Name")
	private String vaccineName;

	@Column(name = "vaccinated_Date")
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
