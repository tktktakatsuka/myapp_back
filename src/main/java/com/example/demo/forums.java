package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class forums {
    @Id
    private Long id;
    private String title;

    // ゲッターセッターなど...
}
