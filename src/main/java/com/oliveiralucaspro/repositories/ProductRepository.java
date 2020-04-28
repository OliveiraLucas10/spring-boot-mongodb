package com.oliveiralucaspro.repositories;

import org.springframework.data.repository.CrudRepository;

import com.oliveiralucaspro.domain.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
}
