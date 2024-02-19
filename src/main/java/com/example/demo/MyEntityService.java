package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MyEntityService {

    @Autowired
    private MyEntityRepository repository;

    public List<forums> getAllEntities() {
        return repository.findAll();
    }
}
