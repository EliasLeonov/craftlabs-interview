package com.lapen.lapenapi.products.infrastructure;

import com.lapen.lapenapi.products.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepositoryI {
    List<Product> getAll();
    Optional<Product> getById(String id);
}
