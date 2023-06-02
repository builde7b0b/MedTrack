package com.api.MedTrackAPI.repository;

import com.api.MedTrackAPI.model.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repositorye
public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}
