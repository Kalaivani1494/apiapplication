package io.example.api.service;

import io.example.api.model.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(Account account);
    Account findByUsername(String username);
    List<Account> getAccounts();
}
