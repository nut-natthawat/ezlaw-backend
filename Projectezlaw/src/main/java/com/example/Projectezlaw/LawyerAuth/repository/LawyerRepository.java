package com.example.Projectezlaw.LawyerAuth.repository;

import com.example.Projectezlaw.LawyerAuth.model.Lawyer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LawyerRepository extends MongoRepository<Lawyer, String> {
    Lawyer findByLawyerEmail(String email);
}
