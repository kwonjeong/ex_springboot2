package com.example.ex_springboot2.web;

public class UserProfile {
    private String email;
    private String pw;
    private String name;
    private String status;

    public UserProfile(String email, String pw, String name, String status){
        super();
        this.email = email;
        this.pw = pw;
        this.name = name;
        this.status = status;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPw(){
        return pw;
    }

    public void setPw(String pw){
        this.pw = pw;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}