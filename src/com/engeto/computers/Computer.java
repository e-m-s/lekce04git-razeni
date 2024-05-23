package com.engeto.computers;

import java.time.LocalDate;

public class Computer {
    private String description;
    private LocalDate purchaseDate;
    private double weight;

    public Computer(String description, LocalDate purchaseDate, double weight) {
        this.description = description;
        this.purchaseDate = purchaseDate;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
