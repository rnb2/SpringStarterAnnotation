package com.rnb.mapper;

import com.rnb.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
public class UserMapper {
    @Autowired
    private  UserDto userDto;
}
