package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Book")
@Data
public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String title;
    private String publis;
    private float price;
}
