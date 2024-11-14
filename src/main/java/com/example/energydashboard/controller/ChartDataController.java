package com.example.energydashboard.controller;


import com.example.energydashboard.model.ChartData;
import com.example.energydashboard.model.EnergyMetrics;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/chart")
public class ChartDataController {

    @GetMapping("/energy-metrics/generation")
    public EnergyMetrics getEnergyGenerationMetrics() {
        return new EnergyMetrics( 8888.4,  2.2, 4.4);
    }

    @GetMapping("/energy-metrics/consumption")
    public EnergyMetrics getEnergyConsumptionMetrics() {
        return new EnergyMetrics(5555.3,  1.1, 5.5);
    }

    // Mock Chart Data based on period (month, week, year)
    @GetMapping("/chart-data/{period}")
    public ChartData getChartData(@PathVariable String period) {
        switch (period) {
            case "month":
                return new ChartData(
                        Arrays.asList("Week 1", "Week 2", "Week 3", "Week 4"),
                        Arrays.asList(
                                new ChartData.Dataset("Energy Generation", Arrays.asList(400, 500, 600, 550), "blue"),
                                new ChartData.Dataset("Energy Consumption", Arrays.asList(300, 350, 400, 380), "red")
                        )
                );
            case "week":
                return new ChartData(
                        Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"),
                        Arrays.asList(
                                new ChartData.Dataset("Energy Generation", Arrays.asList(70, 80, 60, 75, 85, 90, 95), "blue"),
                                new ChartData.Dataset("Energy Consumption", Arrays.asList(50, 60, 55, 60, 70, 75, 80), "red")
                        )
                );
            case "year":
                return new ChartData(
                        Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"),
                        Arrays.asList(
                                new ChartData.Dataset("Energy Generation", Arrays.asList(300, 280, 320, 400, 450, 470, 480, 460, 450, 440, 420, 410), "blue"),
                                new ChartData.Dataset("Energy Consumption", Arrays.asList(200, 210, 230, 280, 300, 320, 330, 310, 305, 290, 280, 270), "red")
                        )
                );
            default:
                return new ChartData();
        }
    }
}