package com.example.Projectezlaw.LawyerAuth.service;

import com.example.Projectezlaw.Auth.model.User;
import com.example.Projectezlaw.LawyerAuth.model.Lawyer;
import com.example.Projectezlaw.LawyerAuth.repository.LawyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LawyerService {

    @Autowired
    private LawyerRepository lawyerRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public Lawyer register(String firstname, String lastname, String email, String password, String phone, String gender) {
        if (lawyerRepository.findByLawyerEmail(email) != null) {
            throw new RuntimeException("Email already exists");
        }

        String hashedPassword = passwordEncoder.encode(password);

        Lawyer lawyer = new Lawyer(firstname,lastname,email,hashedPassword,"Lawyer",phone,gender);
        return lawyerRepository.save(lawyer);
    }

    public Lawyer login(String email, String password) {
        Lawyer lawyer = lawyerRepository.findByLawyerEmail(email);
        if (lawyer == null) {
            throw new RuntimeException("Lawyer not found");
        }
        if (!passwordEncoder.matches(password, lawyer.getHashedPassword())) {
            throw new RuntimeException("Invalid password");
        }
        return lawyer;
    }


    public Lawyer updateProfile(String email, String firstname, String lastname, String phone, String gender) {
        Lawyer lawyer = lawyerRepository.findByLawyerEmail(email);
        if (lawyer == null) {
            throw new RuntimeException("Lawyer not found");
        }

        lawyer.setLawyerFirstname(firstname);
        lawyer.setLawyerLastname(lastname);
        lawyer.setPhone(phone);
        lawyer.setGender(gender);

        return lawyerRepository.save(lawyer);
    }

    public Lawyer getLawyerProfile(String email) {
        Lawyer lawyer = lawyerRepository.findByLawyerEmail(email);
        if (lawyer == null) {
            throw new RuntimeException("Lawyer not found");
        }
        return lawyer;
    }
}
