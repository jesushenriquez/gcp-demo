package com.jesushenriquez.gcpdemoservices;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;

    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}
