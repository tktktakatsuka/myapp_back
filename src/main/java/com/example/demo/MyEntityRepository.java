package com.example.demo;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface MyEntityRepository extends JpaRepository<forums, Long> {
}
