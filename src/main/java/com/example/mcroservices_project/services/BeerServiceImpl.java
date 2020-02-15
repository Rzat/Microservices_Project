package com.example.mcroservices_project.services;

import com.example.mcroservices_project.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(String beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Corono Extra ").
                beerStyle("Pale larger")
                .upc(123L).build();
    }
}