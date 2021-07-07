package com.example.mcroservices_project.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    /*
        private UUID id;
        private String beerName;
        private BeerStyleEnum beerStyle;
        private Integer version;
        private OffsetDateTime createdDate;
        private OffsetDateTime lastModifiedDate;
        private Long upc;
        private BigDecimal price;
        private Integer quantityOnHand;
    */
    private UUID id;
    private String beerName;
    private Long upc;
}
