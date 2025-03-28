package com.rnb.config;

import com.rnb.database.repository.UserRepository;
import com.rnb.database.repository.pool.ConnectionPool;
import org.springframework.context.annotation.*;

@ImportResource("classpath:application.xml")
@Configuration
@ComponentScan("com.rnb")
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {

    @Bean("connectionPool")
    public ConnectionPool connectionPool() {
        return new ConnectionPool("postgres", "root2", 2, "jdbc:postgres://localhost:5432/userNameFromConfigurationBean");
    }

    @Bean("connectionPool1")
    public ConnectionPool connectionPool1() {
        return new ConnectionPool("mySql", "123", 20, "jdbc:mysql://localhost:3306/userNameFromConfigurationBean");
    }

    @Bean("userRepository")
    public UserRepository userRepository() {
        return new UserRepository("budukh.rn", connectionPool());
    }

}
