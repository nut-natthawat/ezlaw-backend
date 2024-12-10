package com.example.Projectezlaw.Auth.repository;

import com.example.Projectezlaw.Auth.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}