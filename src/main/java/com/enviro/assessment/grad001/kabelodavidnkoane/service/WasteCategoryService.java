package com.enviro.assessment.grad001.kabelodavidnkoane.service;

import com.enviro.assessment.grad001.kabelodavidnkoane.model.WasteCategory;
import com.enviro.assessment.grad001.kabelodavidnkoane.repository.WasteCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteCategoryService {

    private final WasteCategoryRepository repository;

    public WasteCategoryService(WasteCategoryRepository repository) {
        this.repository = repository;
    }

    public WasteCategory save(WasteCategory category) {
        return repository.save(category);
    }

    public List<WasteCategory> findAll() {
        return repository.findAll();
    }

    public WasteCategory findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
