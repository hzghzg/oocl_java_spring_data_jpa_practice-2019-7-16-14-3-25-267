package com.tw.apistackbase.api;

import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.core.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyResource {
    @Autowired
    private CompanyRepository companyRepository;
    @GetMapping(produces = {"application/json"})
    public Iterable<Company> list() {
        return companyRepository.findAll();
    }
    
    /*@PostMapping(produces = {"application/json"})
    public Company add(@RequestBody Company company) {
        return  companyRepository.save(company);
    }*/
    @PostMapping(produces = {"application/json"})
    public Company add(@RequestBody Company company) {
        return  companyRepository.save(company);
    }
    @PutMapping(produces = {"application/json"})
    public Company update(@RequestBody Company company) {
        return  companyRepository.save(company);
    }
    @DeleteMapping(produces = {"application/json"})
    public void delete(@RequestBody Company company) {
        companyRepository.delete(company);
    }

}
