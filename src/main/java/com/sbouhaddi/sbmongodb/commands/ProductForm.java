package com.sbouhaddi.sbmongodb.commands;


import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author bouhaddisabri
 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductForm {
    private String id;
    private String description;
    private BigDecimal price;
    private String imageUrl;

}
