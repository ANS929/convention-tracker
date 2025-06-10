package com.conventiontracker.conventions.repository;

import com.conventiontracker.conventions.model.Convention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConventionRepository extends JpaRepository<Convention, Long> {
}