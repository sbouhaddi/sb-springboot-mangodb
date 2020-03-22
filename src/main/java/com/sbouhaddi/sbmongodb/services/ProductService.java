package com.sbouhaddi.sbmongodb.services;

import java.util.List;

import com.sbouhaddi.sbmongodb.commands.ProductForm;
import com.sbouhaddi.sbmongodb.domain.Product;


/**
 * @author bouhaddisabri
 *
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
