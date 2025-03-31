package com.rnb.service;

import com.rnb.database.repository.CompanyRepository;
import com.rnb.dto.CompanyDto;
import com.rnb.listener.AccessType;
import com.rnb.listener.EntityEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final ApplicationEventPublisher publisher;

    public CompanyService(CompanyRepository companyRepository, ApplicationEventPublisher publisher) {
        this.companyRepository = companyRepository;
        this.publisher = publisher;
    }

    public Optional<CompanyDto> findById(Integer id) {
        //Optional<Company> company = companyRepository.finById(id);
        //return company.map(value -> new CompanyDto(value.id(), "Company " + value.id()));

        return companyRepository.finById(id)
                .map(company -> {

                    /* AccessType.DELETE will not work because of condition in com.rnb.listener.EntityListener.accept*/
                    EntityEvent entityEvent = new EntityEvent(company, AccessType.READ);
                    publisher.publishEvent(entityEvent);

                    return new CompanyDto(company.id(), "Company " + company.id());
                });
    }
}
