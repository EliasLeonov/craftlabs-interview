package com.lapen.lapenapi.products.app;

import com.lapen.lapenapi.products.domain.Product;
import com.lapen.lapenapi.products.infrastructure.ProductRepository;
import com.lapen.lapenapi.products.infrastructure.ProductRepositoryI;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements ProductServiceI{
    private ProductRepositoryI repository = new ProductRepository();
    @Override
    public List<Product> getAll() {
        return repository.getAll();
    }

    @Override
    public Optional<Product> getById(String id) {
        return repository.getById(id);
    }
}
