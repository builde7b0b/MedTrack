package com.api.MedTrackAPI.repository;

import com.api.MedTrackAPI.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;


//  specify the entity type and the primary key type: <Medication, Long>
//Medication is specified as the entity type, and Long is specified as the primary key type

//Why do we extend the JPA?
//to inherit the CRUD methods to talk with database and perform operations
public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
