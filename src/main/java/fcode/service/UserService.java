package fcode.service;

import fcode.model.User;

import java.util.List;

public interface UserService {
    List<User> getListUser();

    User getUserById(String id);

    User createUser(User user);

    User editUser(User user);

    void deleteUser(String id);

}
