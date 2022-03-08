package com.cowin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cowin.entity.VaccinatedEntity;

@Repository
public interface VaccinatedRepository extends JpaRepository<VaccinatedEntity, Integer> {

	public List<VaccinatedEntity> findByDoseNumber(int doseNumber);

}
