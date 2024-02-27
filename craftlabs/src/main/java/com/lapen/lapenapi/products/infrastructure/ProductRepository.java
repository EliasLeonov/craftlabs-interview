package com.lapen.lapenapi.products.infrastructure;

import com.lapen.lapenapi.products.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository implements ProductRepositoryI{
    List<Product> products = new ArrayList<>(
            List.of(
                    new Product("a1", "keyboard", "1"),
                    new Product("a2", "mouse", "2"),
                    new Product("a3", "monitor", "3")
            )
    );
    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Optional<Product> getById(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) return Optional.of(p);
        }
        return Optional.empty();
    }
}
