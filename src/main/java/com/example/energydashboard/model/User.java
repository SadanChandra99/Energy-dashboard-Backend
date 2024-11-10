package com.example.energydashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference  // Ensures proper serialization
    @JsonIgnoreProperties("user") // Prevent circular references from being serialized
    private List<EnergyData> energyData;

    // Getters and setters

    public Long getUserId() {
        return id;
    }

    public void setUserId(Long userId) {
        this.id = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<EnergyData> getEnergyData() {
        return energyData;
    }

    public void setEnergyData(List<EnergyData> energyData) {
        this.energyData = energyData;
    }

    public User(Long id, String username, String email, List<EnergyData> energyData) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.energyData = energyData;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", energyData=" + energyData +
                '}';
    }
}
