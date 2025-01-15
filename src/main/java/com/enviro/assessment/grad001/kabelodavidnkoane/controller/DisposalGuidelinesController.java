package com.enviro.assessment.grad001.kabelodavidnkoane.controller;

import com.enviro.assessment.grad001.kabelodavidnkoane.model.DisposalGuidelines;
import com.enviro.assessment.grad001.kabelodavidnkoane.repository.DisposalGuidelinesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/disposal-guidelines")
public class DisposalGuidelinesController {

    private final DisposalGuidelinesRepository repository;

    public DisposalGuidelinesController(DisposalGuidelinesRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<DisposalGuidelines> getAllDisposalGuidelines() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DisposalGuidelines> getDisposalGuidelineById(@PathVariable Long id) {
        Optional<DisposalGuidelines> guideline = repository.findById(id);
        return guideline.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<DisposalGuidelines> createDisposalGuideline(@RequestBody DisposalGuidelines disposalGuidelines) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(disposalGuidelines));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisposalGuidelines> updateDisposalGuideline(@PathVariable Long id, @RequestBody DisposalGuidelines updatedGuideline) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setGuideline(updatedGuideline.getGuideline());
                    existing.setWasteType(updatedGuideline.getWasteType());
                    return ResponseEntity.ok(repository.save(existing));
                })
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisposalGuideline(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
