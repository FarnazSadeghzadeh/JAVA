package com.example.springdatajpa1;

import org.springframework.data.repository.CrudRepository;

public interface productRepository extends CrudRepository<Product,Long> {

}
