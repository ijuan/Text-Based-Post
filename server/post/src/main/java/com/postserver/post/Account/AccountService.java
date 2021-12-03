package com.postserver.post.Account;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
@Component
public class AccountService {
    private ArrayList<Account> database;
    public AccountService() {
        this.database = new ArrayList<Account>();
        database.add(new Account("jorge25@gmail.com","555-135-2772","jayavarmen","Sh33pL0v3r!","jorge","whitener","1999","02","22","Im just a man with a plan, I want to change the world :D"));
    }
    public ArrayList<Account> getData() {
        return database;
    }
    public Boolean makeAccount(Account a) {
        if (a.getUsername().length() < 4 || a.getUsername().length() >= 30) {
                System.out.println("Username Is Too Short");
                    return false;
        }   
        for (int i = 0;i < a.getUsername().length();i++) {
            a.getUsername().charAt(i);
                    if (a.getUsername().charAt(i) < 65 || a.getUsername().charAt(i) > 90 ) {
                        if (a.getUsername().charAt(i) < 97 || a.getUsername().charAt(i) > 122 ) {
                            System.out.println("Cannot be a number or special character...");
                            return false;
                        }
                      
                    }
        }
        if (a.getPassword().length() < 8 || a.getPassword().length() > 16) {
            System.out.println("Password was an incorrect length");
            return false;
        }
        int cap = 0;
        int num = 0;
        for(int x = 0; x < a.getPassword().length(); x++) {
            if(a.getPassword().charAt(x) >= 97 || a.getPassword().charAt(x) <= 122 ) {
                cap++;
            }
             if (a.getPassword().charAt(x) <= 48 || a.getPassword().charAt(x) >= 56 ){
                num++;
        }
        }
        if (cap <= 1 || num < 2) {
            System.out.println("This password is Invalid");
                return false;
        }
        return true;
    }
    
}
