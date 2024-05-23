package com.engeto.computers;

import java.time.LocalDate;

public class Computer implements Comparable<Computer> {
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

    @Override
    public int compareTo(Computer otherComputer) {
        // vrací: záporné číslo, pokud je tento počítač před otherComputer
        //        0, pokud jsou oba počítače na stejném místě
        //        kladné číslo, pokud je tento počítač za otherComputer
        return this.getDescription().compareTo(otherComputer.getDescription());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "description='" + description + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", weight=" + weight +
                '}';
    }
}
