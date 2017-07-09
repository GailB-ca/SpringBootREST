package exercise.service;

import exercise.domain.Account;

public interface AccountService {
    public Account getAccount(String username);

    public void updateAccount(String username, Account input);
}