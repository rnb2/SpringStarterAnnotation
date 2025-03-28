package com.rnb.database.repository;

import com.rnb.database.repository.pool.ConnectionPool;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@ToString
public class UserRepository {
    private String userName;
    private ConnectionPool connectionPool;

    public UserRepository(@Value("userName") String userName, ConnectionPool connectionPool) {
        this.userName = userName;
        this.connectionPool = connectionPool;
    }

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
