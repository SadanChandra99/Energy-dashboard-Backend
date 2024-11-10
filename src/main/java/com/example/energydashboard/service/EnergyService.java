package com.example.energydashboard.service;

import com.example.energydashboard.exceptions.EnergyDataNotFoundException;
import com.example.energydashboard.model.EnergyData;
import com.example.energydashboard.model.User;
import com.example.energydashboard.repository.EnergyDataRepository;
import com.example.energydashboard.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

@Service
public class EnergyService {

    @Autowired
    private EnergyDataRepository energyDataRepository;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User saveUser(User user) {
        // Optional: Add any validation logic here if required.
        return userRepository.save(user);
    }
    @Transactional
    public EnergyData saveEnergyData(Long userId, EnergyData energyData) {
        // Fetch the User by userId. If not found, throw an exception.
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new EnergyDataNotFoundException("User with ID " + userId + " not found"));

        // Set the user reference in the EnergyData object
        energyData.setUser(user);

        // Save the EnergyData object to the database
        return energyDataRepository.save(energyData);
    }

    public List<EnergyData> getUserEnergyData(Long userId, LocalDate startDate, LocalDate endDate) {
        return energyDataRepository.findByUserIdAndDateBetween(userId, startDate, endDate);
    }

    public List<EnergyData> getEnergyDataForMonth(Long userId, LocalDate month) {
        LocalDate startOfMonth = month.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate endOfMonth = month.with(TemporalAdjusters.lastDayOfMonth());
        return getUserEnergyData(userId, startOfMonth, endOfMonth);
    }

    public List<EnergyData> getEnergyDataForWeek(Long userId, LocalDate weekStartDate) {
        LocalDate weekEndDate = weekStartDate.plusDays(6);
        return getUserEnergyData(userId, weekStartDate, weekEndDate);
    }

    public List<EnergyData> getEnergyDataForYear(Long userId, LocalDate yearStartDate) {
        LocalDate yearEndDate = yearStartDate.plusYears(1).minusDays(1);
        return getUserEnergyData(userId, yearStartDate, yearEndDate);
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    // Additional helper methods for calculations can be added here
}
