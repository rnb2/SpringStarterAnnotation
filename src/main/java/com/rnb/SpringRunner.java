package com.rnb;


import com.rnb.database.repository.CompanyRepository;
import com.rnb.database.repository.UserRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");

        UserRepository userRepository = xmlApplicationContext.getBean(UserRepository.class);
        System.out.println(userRepository);

        CompanyRepository companyRepository = xmlApplicationContext.getBean(CompanyRepository.class);
        System.out.println(companyRepository);

        xmlApplicationContext.close();
    }
}
