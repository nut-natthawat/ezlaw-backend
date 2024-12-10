package com.example.Projectezlaw.LawyerAuth.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Lawyer")
public class Lawyer {

    @Id
    private String Lawyerid;

    private String lawyerFirstname;
    private String lawyerLastname;
    private String lawyerEmail;
    private String hashedPassword;
    private String role;
    private String phone;
    private String gender;

    public Lawyer(String lawyerFirstname, String lawyerLastname, String lawyerEmail, String hashedPassword, String role, String phone, String gender) {
        this.lawyerFirstname = lawyerFirstname;
        this.lawyerLastname = lawyerLastname;
        this.lawyerEmail = lawyerEmail;
        this.hashedPassword = hashedPassword;
        this.role = role;
        this.phone = phone;
        this.gender = gender;
    }

    public void setLawyerid(String lawyerid){
        this.Lawyerid = lawyerid;
    }

    public String getLawyerid(){
        return Lawyerid;
    }

    public void setLawyerFirstname(String Lawyerfirstname){
        this.lawyerFirstname = Lawyerfirstname;
    }

    public String getLawyerFirstname(){
        return lawyerFirstname;
    }

    public void setLawyerLastname(String Lawyerlastname){
        this.lawyerLastname = Lawyerlastname;
    }

    public String getLawyerLastname(){
        return lawyerLastname;
    }

    public void setLawyerEmail(String Lawyeremail){
        this.lawyerEmail = Lawyeremail;
    }

    public String getLawyerEmail(){
        return lawyerEmail;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
}