package com.postserver.post.Account;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonFormat;

import org.apache.tomcat.jni.Local;

import java.time.Instant;
import java.time.LocalDate;

public class Account {
private String email;

private String phoneNumber;

private String username;

private String password;

private String firstName;  

private String lastName;

private UUID accountNumber;

@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
private LocalDate dob;

private String bio;

public Account(){
    this.email = "";
    this.phoneNumber = "";
    this.username = "";
    this.password = "";
    this.firstName = "";
    this.lastName = "";
    this.bio = "";
    this.dob = LocalDate.now();
    this.accountNumber = UUID.randomUUID();

}

public Account(String e, String pn, String u, String p, String fn, String ln, int year, int month, int day, String b ){
 this.email = e;
    this.phoneNumber = pn;
    this.username = u;
    this.password = p;
    this.firstName = fn;
    this.lastName = ln;
    this.dob = LocalDate.parse(String.valueOf(year) +"-"+ String.valueOf(month) +"-"+ String.valueOf(day));
    this.bio = b;
    this.accountNumber = UUID.randomUUID();
}
public Account(String e, String pn, String u, String p, String fn, String ln, String year, String month, String day, String b ){
    this.email = e;
    this.phoneNumber = pn;
    this.username = u;
    this.password = p;
    this.firstName = fn;
    this.lastName = ln;
    this.dob = LocalDate.parse(year +"-"+ month +"-"+ day);
    this.bio = b;
    this.accountNumber = UUID.randomUUID();
}
public Account(String e, String pn, String u, String p, String fn, String ln, String dob, String b ){
    this.email = e;
    this.phoneNumber = pn;
    this.username = u;
    this.password = p;
    this.firstName = fn;
    this.lastName = ln;
    this.dob = LocalDate.parse(dob);
    this.bio = b;
    this.accountNumber = UUID.randomUUID();
}
public String getEmail() {
    return email;
}
public String getPhoneNumber() {
    return phoneNumber;
}public String getUsername() {
    return username;
}
public String getPassword() {
    return password;
}
public String getFirstName() {
    return firstName;
}
public String getLastName() {
    return lastName;
}
public UUID getAccountNumber() {
    return accountNumber;
}
public LocalDate getDob() {
    return dob;
}
public String getBio() {
    return bio;
}
public void setDOB() { 

}

}


