package com.esi.w3crud2.products.dto;

import java.math.BigDecimal;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

    public ProductDto(String id) {
        this.id = id;
    }

}