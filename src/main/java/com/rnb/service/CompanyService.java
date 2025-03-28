package com.rnb.service;

import com.rnb.database.entity.Company;
import com.rnb.database.repository.CompanyRepository;
import com.rnb.dto.CompanyDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Optional<CompanyDto> findById(Integer id) {
        //Optional<Company> company = companyRepository.finbyId(id);
        //return company.map(value -> new CompanyDto(value.id(), "Company " + value.id()));

        return companyRepository.finbyId(id)
                .map(value -> new CompanyDto(value.id(), "Company " + value.id()));
    }
}
