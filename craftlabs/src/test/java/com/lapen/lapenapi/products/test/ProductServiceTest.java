package com.lapen.lapenapi.products.test;

import com.lapen.lapenapi.products.app.ProductService;
import com.lapen.lapenapi.products.domain.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    @Test
    public void Test01() {
        ProductService service = new ProductService();
        List<Product> productList = service.getAll();
        Assertions.assertFalse(productList.isEmpty());
    }

}
