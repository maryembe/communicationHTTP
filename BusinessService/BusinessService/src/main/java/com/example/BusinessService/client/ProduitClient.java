package com.example.BusinessService.client;

import com.example.BusinessService.model.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "referentielservice", url = "http://localhost:8080")
public interface ProduitClient {
    @PostMapping("/products")
    Produit createProduit(@RequestBody Produit produit);

    @GetMapping ("/products")
    List<Produit> getProduit();
    @PutMapping("/products/{id}")
    Produit updateProduit(@PathVariable("id") Long id, @RequestBody Produit produit);

    @DeleteMapping("/products/{id}")
    void deleteProduit(@PathVariable("id") Long id);
}
