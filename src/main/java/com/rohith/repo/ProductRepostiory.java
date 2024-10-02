package com.rohith.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohith.binding.Product;

public interface ProductRepostiory extends JpaRepository<Product, Integer> {

}
