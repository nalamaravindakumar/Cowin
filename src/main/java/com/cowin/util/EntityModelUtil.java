package com.cowin.util;

import java.util.ArrayList;
import java.util.List;

import com.cowin.entity.VaccinatedEntity;
import com.cowin.model.Vaccinated;

public class EntityModelUtil {
	public static VaccinatedEntity vaccinatedModelToEntity(Vaccinated vaccinated) {

		VaccinatedEntity vaccinatedEntity = new VaccinatedEntity();
		vaccinatedEntity.setVaccinatedId(vaccinated.getVaccinatedId());
		vaccinatedEntity.setAppointmentId(vaccinated.getAppointmentId());
		vaccinatedEntity.setDoseNumber(vaccinated.getDoseNumber());
		vaccinatedEntity.setCenterId(vaccinated.getCenterId());
		vaccinatedEntity.setVaccineId(vaccinated.getVaccinatedId());
		vaccinatedEntity.setVaccineName(vaccinated.getVaccineName());
		vaccinatedEntity.setVaccinatedDate(vaccinated.getVaccinatedDate());

		return vaccinatedEntity;
	}

	public static Vaccinated vaccinatedEntityToModel(VaccinatedEntity vaccinatedEntity) {

		Vaccinated vaccinated = new Vaccinated();
		vaccinated.setVaccinatedId(vaccinatedEntity.getVaccinatedId());
		vaccinated.setAppointmentId(vaccinatedEntity.getAppointmentId());
		vaccinated.setDoseNumber(vaccinatedEntity.getDoseNumber());
		vaccinated.setCenterId(vaccinatedEntity.getCenterId());
		vaccinated.setVaccineId(vaccinatedEntity.getVaccineId());
		vaccinated.setVaccineName(vaccinatedEntity.getVaccineName());
		vaccinated.setVaccinatedDate(vaccinatedEntity.getVaccinatedDate());

		return vaccinated;

	}

	public static List<Vaccinated> vaccinatedEntityToModelList(List<VaccinatedEntity> entityList) {

		List<Vaccinated> vaccinatedList = new ArrayList<>();

		entityList.forEach(entity -> {
			Vaccinated vaccinated = new Vaccinated();
			vaccinated.setVaccinatedId(entity.getVaccinatedId());
			vaccinated.setAppointmentId(entity.getAppointmentId());
			vaccinated.setDoseNumber(entity.getDoseNumber());
			vaccinated.setCenterId(entity.getCenterId());
			vaccinated.setVaccineId(entity.getVaccineId());
			vaccinated.setVaccineName(entity.getVaccineName());
			vaccinated.setVaccinatedDate(entity.getVaccinatedDate());

			vaccinatedList.add(vaccinated);
		});

		return vaccinatedList;

	}
}
