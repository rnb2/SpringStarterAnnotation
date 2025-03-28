package com.rnb.database.repository;

import com.rnb.database.entity.Company;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CompanyRepository {

    public Optional<Company> finbyId(Integer id) {
        System.out.println("CompanyRepository.finbyId: " + id);
        return Optional.of(new Company(id));
    }
}
