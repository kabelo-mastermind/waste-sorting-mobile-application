// filepath: /C:/Users/kabelo/Documents/assessment.grad001.kabelodavidnkoane/waste-sorting-mobile-application/assessment.grad001.kabelodavidnkoane/src/main/java/com/enviro/assessment/grad001/kabelodavidnkoane/model/DisposalGuidelines.java
package com.enviro.assessment.grad001.kabelodavidnkoane.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class DisposalGuidelines {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Guideline is required")
    private String guideline;

    @NotBlank(message = "Waste type is required")
    private String wasteType;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGuideline() {
        return guideline;
    }

    public void setGuideline(String guideline) {
        this.guideline = guideline;
    }

    public String getWasteType() {
        return wasteType;
    }

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
    }
}