package exercise.service;

import exercise.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("authService")
@Transactional
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Boolean verifyUser(String username) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            return true;
        }

        return false;
    }

    public User getUserByUsername(String username) {

        User user = userRepository.findByUsername(username);
        if (user != null) {
            if (user.getStatus().equalsIgnoreCase("N")) {
                return null;
            }
        }

        return user;
    }

}