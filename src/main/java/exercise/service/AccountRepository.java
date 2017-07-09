package exercise.service;

import exercise.domain.Account;
import exercise.domain.User;
import org.springframework.data.repository.Repository;

interface AccountRepository extends Repository<Account, Integer> {

    Account findByUser(User user);

    Account save(Account account);
}