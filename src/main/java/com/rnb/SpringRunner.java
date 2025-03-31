package com.rnb;


import com.rnb.config.ApplicationConfiguration;
import com.rnb.database.repository.ConnectionPoolTestRepository;
import com.rnb.database.repository.UserRepository;
import com.rnb.dto.CompanyDto;
import com.rnb.service.CompanyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class SpringRunner {

    public static void main(String[] args) {

        //Example of configuration "application.xml"
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        //Example of java configuration
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        //UserRepository userRepository = applicationContext.getBean(UserRepository.class);
        //System.out.println(userRepository);

        //ConnectionPoolTestRepository connectionPoolTestRepository = applicationContext.getBean(ConnectionPoolTestRepository.class);
        //System.out.println(connectionPoolTestRepository);

        //Example for eventListener:
        CompanyService companyService = applicationContext.getBean(CompanyService.class);
        Optional<CompanyDto> companyServiceById = companyService.findById(1);

        if (companyServiceById.isPresent()) {
            CompanyDto companyDto = companyServiceById.get();
            System.out.println("Found !!! CompanyDto: " + companyDto);

        }

        applicationContext.close();
    }
}
