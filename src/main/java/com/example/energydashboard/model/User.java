package com.example.energydashboard.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;
    @JsonFormat
    @JdbcTypeCode(SqlTypes.JSON)
    private EnergyMetrics energyConsumption;
    @JsonFormat
    @JdbcTypeCode(SqlTypes.JSON)
    private EnergyMetrics energyGeneration;
    @JsonFormat
    @JdbcTypeCode(SqlTypes.JSON)
    private List<ChartData> chartData;

    public User() {
    }



    // Getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EnergyMetrics getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(EnergyMetrics energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public EnergyMetrics getEnergyGeneration() {
        return energyGeneration;
    }

    public void setEnergyGeneration(EnergyMetrics energyGeneration) {
        this.energyGeneration = energyGeneration;
    }

    public List<ChartData> getChartData() {
        return chartData;
    }

    public void setChartData(List<ChartData> chartData) {
        this.chartData = chartData;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", energyConsumption=" + energyConsumption +
                ", energyGeneration=" + energyGeneration +
                ", chartData=" + chartData +
                '}';
    }
}
