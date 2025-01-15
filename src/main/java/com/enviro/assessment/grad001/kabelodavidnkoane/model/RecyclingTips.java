package com.enviro.assessment.grad001.kabelodavidnkoane.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class RecyclingTips {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Tip is required")
    private String tip;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}