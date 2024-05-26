package com.example.ReferentielService.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id") // Match the column name in the database
    private int productId;

    @Column(name = "product_name", nullable = false) // Match the column name in the database
    private String productName;

    @Column(name = "supplier_id") // Match the column name in the database
    private int supplierId;

    @Column(name = "category_id") // Match the column name in the database
    private int categoryId;

    @Column(name = "quantity_per_unit") // Match the column name in the database
    private String quantityPerUnit;

    @Column(name = "unit_price") // Match the column name in the database
    private Double unitPrice;

    @Column(name = "units_in_stock") // Match the column name in the database
    private Integer unitsInStock;

    @Column(name = "units_on_order") // Match the column name in the database
    private Integer unitsOnOrder;

    @Column(name = "reorder_level") // Match the column name in the database
    private Integer reorderLevel;

    @Column(name = "discontinued", nullable = false) // Match the column name in the database
    private boolean discontinued;


    // Getters and setters
}

