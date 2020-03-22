package com.sbouhaddi.sbmongodb.domain;

import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author bouhaddisabri
 *
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private ObjectId _id;
    private String description;
    private BigDecimal price;
    private String imageUrl;

}
