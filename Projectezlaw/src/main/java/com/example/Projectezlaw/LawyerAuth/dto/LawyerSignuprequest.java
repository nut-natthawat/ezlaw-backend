package com.example.Projectezlaw.LawyerAuth.dto;


public class LawyerSignuprequest {
    private String Lawyerfirstname;
    private String Lawyerlastname;
    private String lawyeremail;
    private String password;
    private String phone;
    private String gender;

    public String getFirstname() {
        return Lawyerfirstname;
    }

    public void setFirstname(String firstname) {
        this.Lawyerfirstname = firstname;
    }

    public String getLastname() {
        return Lawyerlastname;
    }

    public void setLastname(String lastname) {
        this.Lawyerlastname = lastname;
    }

    public String getEmail() {
        return lawyeremail;
    }

    public void setEmail(String email) {
        this.lawyeremail = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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