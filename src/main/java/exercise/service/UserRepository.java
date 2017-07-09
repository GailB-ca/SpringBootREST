package exercise.service;


import exercise.domain.User;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, Integer> {

    User findByUsername(String username);

}