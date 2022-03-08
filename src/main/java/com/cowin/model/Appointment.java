package com.cowin.model;

import java.time.LocalDate;

public class Appointment {
	private int appointmentId;
	private String typeOfVaccine;
	private LocalDate dateOfAppointment;
	private int centerId;
	private int doseNumber;

	public int getDoseNumber() {
		return doseNumber;
	}

	public void setDoseNumber(int doseNumber) {
		this.doseNumber = doseNumber;
	}

	public LocalDate getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(LocalDate dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getTypeOfVaccine() {
		return typeOfVaccine;
	}

	public void setTypeOfVaccine(String typrOfVaccine) {
		this.typeOfVaccine = typrOfVaccine;
	}

	public int getCenterId() {
		return centerId;
	}

	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}

	@Override
	public String toString() {
		return "Appointement [appointmentId=" + appointmentId + ", typeOfVaccine=" + typeOfVaccine
				+ ", dateOfAppointment=" + dateOfAppointment + ", centerId=" + centerId + ", doseNumber=" + doseNumber
				+ "]";
	}

}
