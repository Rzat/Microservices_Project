package com.example.mcroservices_project.services;

import com.example.mcroservices_project.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);
}
