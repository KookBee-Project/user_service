package com.KookBee.userservice.controller;

import com.KookBee.userservice.domain.entity.Company;
import com.KookBee.userservice.domain.request.CompanyFindRequest;
import com.KookBee.userservice.domain.request.CompanyInsertRequest;
import com.KookBee.userservice.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {
    private final CompanyService companyService;
    @PostMapping
    public void insertCompany(@RequestBody CompanyInsertRequest request){
        companyService.insertCompany(request);
    }

    @PostMapping("/companycode")
    public Long findCompany (@RequestBody CompanyFindRequest request) {
        Long companyByCompanyCode = companyService.findCompanyByCompanyCode(request);
        return companyByCompanyCode;

    }
}
