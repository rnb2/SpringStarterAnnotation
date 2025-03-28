package com.rnb;


import com.rnb.config.ApplicationConfiguration;
import com.rnb.database.repository.ConnectionPoolTestRepository;
import com.rnb.database.repository.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRunner {

    public static void main(String[] args) {

        //Example of configuration "application.xml"
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        //Example of java configuration
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        UserRepository userRepository = applicationContext.getBean(UserRepository.class);
        System.out.println(userRepository);

        ConnectionPoolTestRepository connectionPoolTestRepository = applicationContext.getBean(ConnectionPoolTestRepository.class);
        System.out.println(connectionPoolTestRepository);

        applicationContext.close();
    }
}
