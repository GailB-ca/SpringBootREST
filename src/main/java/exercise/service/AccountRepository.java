package exercise.service;

import exercise.domain.Account;
import exercise.domain.User;
import org.springframework.data.repository.Repository;

/**
 * Defines CRUD services for the Account domain
 */
interface AccountRepository extends Repository<Account, Integer> {

    Account findByUser(User user);

    Account save(Account account);
}