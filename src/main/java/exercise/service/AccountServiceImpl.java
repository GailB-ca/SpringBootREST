package exercise.service;

import exercise.domain.Account;
import exercise.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final UserRepository userRepository;

    public AccountServiceImpl(AccountRepository accountRepository, UserRepository userRepository) {
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Account getAccount(String username) {
        User user = this.userRepository.findByUsername(username);
        return this.accountRepository.findByUser(user);
    }

    @Override
    public void updateAccount(String username, Account input) {
        Account account = this.getAccount(username);
        account.setBalance(input.getBalance());
        this.accountRepository.save(account);
        return;
    }


}