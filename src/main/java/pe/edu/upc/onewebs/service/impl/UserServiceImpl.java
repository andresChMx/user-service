package pe.edu.upc.onewebs.service.impl;

import pe.edu.upc.onewebs.entity.User;
import pe.edu.upc.onewebs.exception.ResourceNotFoundException;
import pe.edu.upc.onewebs.repository.UserRepository;
import pe.edu.upc.onewebs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public Page<User> getAllUsersPage(Pageable pageable) {
        return this.userRepository.findAll(pageable);
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(()->
                new ResourceNotFoundException("User with Id: "+userId+" not found"));
    }

    @Override
    public User getUserByUsername(String username) {
        return this.userRepository.findByUsername(username).orElseThrow(()->new ResourceNotFoundException("User with username: "+username+" not found"));
    }
}
