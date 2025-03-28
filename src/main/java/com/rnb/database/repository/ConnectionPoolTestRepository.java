package com.rnb.database.repository;

import com.rnb.database.repository.pool.ConnectionPool;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@ToString
public class ConnectionPoolTestRepository {

    //@Autowired
    private ConnectionPool connectionPool1;

    //@Value("${db.pool.size}")   //value annotation is for get values from properties example: db.pool.size
    private Integer poolSize;

    private List<ConnectionPool> connectionPool;

    public ConnectionPoolTestRepository(@Qualifier("connectionPool1") ConnectionPool connectionPool1, @Value("${db.pool.size}") Integer poolSize,
                                        @Qualifier("connectionPool") List<ConnectionPool> connectionPool) {
        this.connectionPool1 = connectionPool1;
        this.poolSize = poolSize;
        this.connectionPool = connectionPool;
    }
}
