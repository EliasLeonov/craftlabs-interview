package com.lapen.lapenapi.products.app;

import com.lapen.lapenapi.products.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductServiceI {
    List<Product> getAll();
    Optional<Product> getById(String id);
}
