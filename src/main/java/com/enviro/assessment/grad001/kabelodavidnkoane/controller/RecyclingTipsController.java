package com.enviro.assessment.grad001.kabelodavidnkoane.controller;

import com.enviro.assessment.grad001.kabelodavidnkoane.model.RecyclingTips;
import com.enviro.assessment.grad001.kabelodavidnkoane.repository.RecyclingTipsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recycling-tips")
public class RecyclingTipsController {

    private final RecyclingTipsRepository repository;

    public RecyclingTipsController(RecyclingTipsRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<RecyclingTips> getAllRecyclingTips() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecyclingTips> getRecyclingTipById(@PathVariable Long id) {
        Optional<RecyclingTips> tip = repository.findById(id);
        return tip.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<RecyclingTips> createRecyclingTip(@RequestBody RecyclingTips recyclingTip) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(recyclingTip));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecyclingTips> updateRecyclingTip(@PathVariable Long id, @RequestBody RecyclingTips updatedTip) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setTip(updatedTip.getTip());
                    return ResponseEntity.ok(repository.save(existing));
                })
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecyclingTip(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
