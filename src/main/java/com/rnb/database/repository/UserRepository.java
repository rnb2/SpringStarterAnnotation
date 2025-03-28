package com.rnb.database.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@AllArgsConstructor
@ToString
public class UserRepository {
    private String userName;
    //private Integer poolSize;
    private List<Object> args;
    private Map<String, Object> properties;

    @PostConstruct
    public void init() {
        System.out.println("init userRepository");
    }

    //destroy method runs only when call method close() of the context class
    @PreDestroy
    public void destroy() {

        System.out.println("destroy userRepository");
    }
}
