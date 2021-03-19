package com.abreham.demo.controllers;

import com.abreham.demo.domains.Account;
import com.abreham.demo.respositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * HTTP Methods:
 * GET
 * POST - save
 * PUT - update
 * DELETE
 *
 * @author Biniam Asnake
 */
@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @PostMapping(value = "/create", produces = "application/json")
    public Account createAccount(@RequestBody Account account) {
        return accountRepository.save(account);
    }
}
