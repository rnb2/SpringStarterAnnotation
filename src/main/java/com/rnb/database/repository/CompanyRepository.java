package com.rnb.database.repository;

import com.rnb.database.entity.Company;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CompanyRepository {
    public Optional<Company> finById(Integer id) {
        System.out.println("CompanyRepository.finById: " + id);
        return Optional.of(new Company(id));
    }
}
