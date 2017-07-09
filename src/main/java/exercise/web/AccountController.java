package exercise.web;

import exercise.domain.Account;
import exercise.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET)
    public Account readAccount(Principal principal) {
        String username = principal.getName();
        Account account = this.accountService.getAccount(username);
        return account;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Account updateAccount(Principal principal, @RequestBody Account input) {
        String username = principal.getName();
        this.accountService.updateAccount(username, input);
        Account account = this.accountService.getAccount(username);
        return account;
    }

}