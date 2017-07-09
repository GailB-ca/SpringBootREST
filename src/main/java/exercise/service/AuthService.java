package exercise.service;

import exercise.domain.User;

/**
 * Service methods for authenticating a user
 */
public interface AuthService {

    public Boolean verifyUser(String username);

    public User getUserByUsername(String username);
}