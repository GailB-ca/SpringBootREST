package exercise.service;

import exercise.domain.User;

public interface AuthService {

    public Boolean verifyUser(String username);

    public User getUserByUsername(String username);
}