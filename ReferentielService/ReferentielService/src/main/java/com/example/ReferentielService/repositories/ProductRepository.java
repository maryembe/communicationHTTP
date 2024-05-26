package com.example.ReferentielService.repositories;
import com.example.ReferentielService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}