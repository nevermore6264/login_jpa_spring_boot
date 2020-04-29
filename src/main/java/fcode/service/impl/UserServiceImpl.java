package fcode.service.impl;

import fcode.model.User;
import fcode.repository.UserRepository;
import fcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getListUser() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUserById(String id) {
        return this.userRepository.findOne(id);
    }

    @Override
    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User editUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void deleteUser(String id) {
        this.userRepository.delete(id);
    }
}
