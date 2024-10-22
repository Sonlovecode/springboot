package com.example.laptopstore.service;

import com.example.laptopstore.model.Laptop;
import com.example.laptopstore.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;

    public List<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }

    public Laptop addLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public Laptop getLaptopById(Long id) {
        return laptopRepository.findById(id).orElse(null);
    }

    public void deleteLaptop(Long id) {
        laptopRepository.deleteById(id);
    }
}
