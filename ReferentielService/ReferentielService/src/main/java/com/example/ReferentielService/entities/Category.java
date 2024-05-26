package com.example.ReferentielService.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID")
    private int categoryId;

    // Other attributes and methods are omitted for simplicity
}