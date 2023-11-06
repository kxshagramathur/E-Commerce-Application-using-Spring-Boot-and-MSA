package com.MSA_Poject.productservice.repository;

import com.MSA_Poject.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
