package com.example.d7ooo.homee;

public class user {

    String username;
    String password;
    String eemail;
    String marr;
    String nu;
    String idd;

    public user() {
    }


//    public user( String password, String eemail , String marr , String nu , String idd) {
//        this.username = username;
//        this.password = password;
//        this.eemail = eemail;
//        this.marr = marr;
//        this.nu = nu;
//        this.idd = idd;
//    }

    public user(String password , String eemail){
        this.password=password;
        this.eemail=eemail;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail;
    }

    public String getMarr() {
        return marr;
    }

    public void setMarr(String marr) {
        this.marr = marr;
    }

    public String getNu() {
        return nu;
    }

    public void setNu(String nu) {
        this.nu = nu;
    }

    public String getIdd() {
        return idd;
    }

    public void setIdd(String idd) {
        this.idd = idd;
    }

    }