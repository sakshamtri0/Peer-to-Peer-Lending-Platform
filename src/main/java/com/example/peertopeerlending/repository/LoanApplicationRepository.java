package com.example.peertopeerlending.repository;

import com.example.peertopeerlending.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
}