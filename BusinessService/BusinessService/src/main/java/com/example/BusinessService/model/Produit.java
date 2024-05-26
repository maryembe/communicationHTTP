package com.example.BusinessService.model;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Produit {
    private int productId;
    private String productName;
    private int supplierId;
    private int categoryId;
    private String quantityPerUnit;
    private Double unitPrice;
    private Integer unitsInStock;
    private Integer unitsOnOrder;
    private Integer reorderLevel;
    private boolean discontinued;

    // Getters and setters

}
