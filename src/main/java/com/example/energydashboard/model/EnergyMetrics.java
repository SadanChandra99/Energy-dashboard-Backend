package com.example.energydashboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public class EnergyMetrics {



    private double energy; // Energy generation value
    private double minUsage; // Minimum energy usage
    private double maxUsage; // Maximum energy usage

    // Constructor


    public EnergyMetrics( double energy, double minUsage, double maxUsage) {

        this.energy = energy;
        this.minUsage = minUsage;
        this.maxUsage = maxUsage;
    }


    // Getters and Setters



    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }



    public double getMinUsage() {
        return minUsage;
    }

    public void setMinUsage(double minUsage) {
        this.minUsage = minUsage;
    }

    public double getMaxUsage() {
        return maxUsage;
    }

    public void setMaxUsage(double maxUsage) {
        this.maxUsage = maxUsage;
    }
}