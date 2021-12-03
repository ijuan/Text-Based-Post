package com.postserver.post.Account;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
@RestController
@RequestMapping("api/accounts")

public class AccountController {
    private final AccountService as; 
    @Autowired
	public AccountController(AccountService postservice) {
		this.as = postservice;
	}
    @GetMapping
    public List<Account> getAccount(){
       return this.as.getData();
    
    }
    @PostMapping
    public boolean newAccount(@RequestBody Account a){
        return as.makeAccount(a);
    }
   

}


