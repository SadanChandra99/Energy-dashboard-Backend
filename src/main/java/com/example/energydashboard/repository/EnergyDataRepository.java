package com.example.energydashboard.repository;

import com.example.energydashboard.model.EnergyData;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface EnergyDataRepository extends JpaRepository<EnergyData, Long> {

    List<EnergyData> findByUserIdAndDateBetween(Long userId, LocalDate startDate, LocalDate endDate);

    List<EnergyData> findByUserIdAndDateBetweenOrderByDateAsc(Long userId, LocalDate startDate, LocalDate endDate);

    List<EnergyData> findByUserIdAndDate(Long userId, LocalDate date);
}
