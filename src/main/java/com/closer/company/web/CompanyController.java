package com.closer.company.web;

import com.closer.company.domain.Company;
import com.closer.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 公司控制器
 * Created by closer on 2016/1/5.
 */
@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Company get(@PathVariable Long id) {
        return service.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Company save(@RequestBody Company company) {
        return service.save(company);
    }
}
