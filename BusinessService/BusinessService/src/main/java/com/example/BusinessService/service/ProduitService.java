package com.example.BusinessService.service;

import com.example.BusinessService.client.ProduitClient;
import com.example.BusinessService.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;


@Service
public class ProduitService {
    @Autowired
    private ProduitClient produitClient;

    @Cacheable(value = "productsCache")
    public Produit createProduit(Produit produit) {
        // Log the outgoing request to ReferentielService
        System.out.println("Sending request to ReferentielService to create product: " + produit);
        // Call the ProduitClient to create the product in ReferentielService
        Produit newProduit = produitClient.createProduit(produit);

        // Log the response from ReferentielService
        System.out.println("Received response from ReferentielService: " + newProduit);

        return newProduit;
    }
    @Cacheable(value = "productsCache")
    public List<Produit> GetAllProduit() {
        // Log the outgoing request to ReferentielService
        System.out.println("Sending request to ReferentielService to get all product: " );
        // Call the ProduitClient to create the product in ReferentielService
        List<Produit> newProduit = produitClient.getProduit();

        // Log the response from ReferentielService
        System.out.println("Received response from ReferentielService: " + newProduit);

        return newProduit;
    }
    @Cacheable(value = "productsCache")

    public Produit updateProduit(Long id, Produit produit) {
        return produitClient.updateProduit(id, produit);
    }
    //@CacheEvict(value = "produits", key = "#id")

    public void deleteProduit(Long id) {
        System.out.println("Sending request to ReferentielService to delete product with id: " + id);

        produitClient.deleteProduit(id);
        System.out.println("Product with id " + id + " deleted successfully.");


    }
}
