package com.sbouhaddi.sbmongodb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sbouhaddi.sbmongodb.commands.ProductForm;
import com.sbouhaddi.sbmongodb.converters.ProductFormToProduct;
import com.sbouhaddi.sbmongodb.domain.Product;
import com.sbouhaddi.sbmongodb.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;

/**
 * @author bouhaddisabri
 *
 */
@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;
	private final ProductFormToProduct productFormToProduct;

	@Override
	public List<Product> listAll() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add); 
		return products;
	}

	@Override
	public Product getById(String id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public Product saveOrUpdate(Product product) {
		productRepository.save(product);
		return product;
	}

	@Override
	public void delete(String id) {
		productRepository.deleteById(id);
	}

	@Override
	public Product saveOrUpdateProductForm(ProductForm productForm) {
		Product savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));

		System.out.println("Saved Product Id: " + savedProduct.get_id());
		return savedProduct;
	}
}
