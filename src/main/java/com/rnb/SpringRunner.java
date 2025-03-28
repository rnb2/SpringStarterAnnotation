package com.rnb;


import com.rnb.config.ApplicationConfiguration;
import com.rnb.database.repository.CompanyRepository;
import com.rnb.database.repository.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {

    public static void main(String[] args) {

        //Example of configuration "application.xml"
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        //Example of java configuration
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        UserRepository userRepository = applicationContext.getBean(UserRepository.class);
        System.out.println(userRepository);

        CompanyRepository companyRepository = applicationContext.getBean(CompanyRepository.class);
        System.out.println(companyRepository);

        applicationContext.close();
    }
}
