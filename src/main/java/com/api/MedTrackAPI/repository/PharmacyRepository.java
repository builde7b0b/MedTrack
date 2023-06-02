package com.api.MedTrackAPI.repository;

import com.api.MedTrackAPI.model.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}
