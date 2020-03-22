package com.sbouhaddi.sbmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sbouhaddi.sbmongodb.domain.Product;


/**
 * @author bouhaddisabri
 *
 */
public interface ProductRepository extends MongoRepository<Product, String> {
}
