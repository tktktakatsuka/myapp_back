package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Data;

@Data
@Entity
public class forums {
    @Id
    private Long id;
    private String title;

    // ゲッターセッターなど...
}
