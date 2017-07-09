package exercise.service;

import exercise.domain.Account;

/**
 * Service methods for managing a user account
 */
public interface AccountService {
    public Account getAccount(String username);

    public void updateAccount(String username, Account input);
}