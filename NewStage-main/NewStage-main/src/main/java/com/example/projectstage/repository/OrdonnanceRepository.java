package com.example.projectstage.repository;

import com.example.projectstage.model.ordonnanceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdonnanceRepository extends JpaRepository<ordonnanceModel,Long> {
}
