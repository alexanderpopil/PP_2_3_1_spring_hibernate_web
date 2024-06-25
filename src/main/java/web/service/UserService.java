package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();
}
