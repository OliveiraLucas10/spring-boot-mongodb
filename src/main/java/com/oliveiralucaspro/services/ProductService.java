package com.oliveiralucaspro.services;

import java.util.List;

import com.oliveiralucaspro.commands.ProductForm;
import com.oliveiralucaspro.domain.Product;

public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
