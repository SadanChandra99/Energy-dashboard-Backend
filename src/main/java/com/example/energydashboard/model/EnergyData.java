package com.example.energydashboard.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class EnergyData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonBackReference  // Prevents infinite recursion
    @JsonIgnoreProperties("energyData") // Prevent the circular reference serialization
    private User user;

    private LocalDate date;
    private Double energyConsumption; // in kWh
    private Double energyGeneration;  // in kWh
    private Double minConsumption; // Minimum consumption for the day
    private Double maxConsumption; // Maximum consumption for the day
    private Double minGeneration; // Minimum generation for the day
    private Double maxGeneration; // Maximum generation for the day

    // Getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(Double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public Double getEnergyGeneration() {
        return energyGeneration;
    }

    public void setEnergyGeneration(Double energyGeneration) {
        this.energyGeneration = energyGeneration;
    }

    public Double getMinConsumption() {
        return minConsumption;
    }

    public void setMinConsumption(Double minConsumption) {
        this.minConsumption = minConsumption;
    }

    public Double getMaxConsumption() {
        return maxConsumption;
    }

    public void setMaxConsumption(Double maxConsumption) {
        this.maxConsumption = maxConsumption;
    }

    public Double getMinGeneration() {
        return minGeneration;
    }

    public void setMinGeneration(Double minGeneration) {
        this.minGeneration = minGeneration;
    }

    public Double getMaxGeneration() {
        return maxGeneration;
    }

    public void setMaxGeneration(Double maxGeneration) {
        this.maxGeneration = maxGeneration;
    }

    public EnergyData(Long id, User user, LocalDate date, Double energyConsumption, Double energyGeneration, Double minConsumption, Double maxConsumption, Double minGeneration, Double maxGeneration) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.energyConsumption = energyConsumption;
        this.energyGeneration = energyGeneration;
        this.minConsumption = minConsumption;
        this.maxConsumption = maxConsumption;
        this.minGeneration = minGeneration;
        this.maxGeneration = maxGeneration;
    }

    public EnergyData() {
    }

    @Override
    public String toString() {
        return "EnergyData{" +
                "id=" + id +
                ", user=" + user +
                ", date=" + date +
                ", energyConsumption=" + energyConsumption +
                ", energyGeneration=" + energyGeneration +
                ", minConsumption=" + minConsumption +
                ", maxConsumption=" + maxConsumption +
                ", minGeneration=" + minGeneration +
                ", maxGeneration=" + maxGeneration +
                '}';
    }
}
