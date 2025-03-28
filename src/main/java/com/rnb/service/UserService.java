package com.rnb.service;

import com.rnb.database.repository.UserRepository;
import com.rnb.mapper.UserMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Service
@ToString
public class UserService {
    private UserMapper userMapper;
    private UserRepository userRepository;

}
