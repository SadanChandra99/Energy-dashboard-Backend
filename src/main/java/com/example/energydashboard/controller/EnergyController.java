//package com.example.energydashboard.controller;
//
//import com.example.energydashboard.model.EnergyData;
//import com.example.energydashboard.model.User;
//import com.example.energydashboard.service.EnergyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDate;
//import java.util.List;
//
//
//@RestController
//@RequestMapping("/api")
//public class EnergyController {
//
//    @Autowired
//    private EnergyService energyService;
//
//    @GetMapping("/user/{userId}/energy/{year}")
//    public List<EnergyData> getEnergyDataForYear(@PathVariable Long userId, @PathVariable int year) {
//        LocalDate yearStart = LocalDate.of(year, 1, 1);
//        return energyService.getEnergyDataForYear(userId, yearStart);
//    }
//
//    @GetMapping("/user/{userId}/energy/{month}/{year}")
//    public List<EnergyData> getEnergyDataForMonth(@PathVariable Long userId, @PathVariable int month, @PathVariable int year) {
//        LocalDate monthStart = LocalDate.of(year, month, 1);
//        return energyService.getEnergyDataForMonth(userId, monthStart);
//    }
//
//    @GetMapping("/user/{userId}/energy/week/{weekStart}")
//    public List<EnergyData> getEnergyDataForWeek(@PathVariable Long userId, @PathVariable String weekStart) {
//        LocalDate weekStartDate = LocalDate.parse(weekStart);
//        return energyService.getEnergyDataForWeek(userId, weekStartDate);
//    }
//
////    @GetMapping("/user/{userId}")
////    public User getUser(@PathVariable Long userId) {
////        return energyService.getUserById(userId);
////    }
////
//
//    // New POST endpoint to create a User
////    @PostMapping("/user")
////    public User createUser(@RequestBody User user) {
////        System.out.println(user.toString());
////        return energyService.saveUser(user);
////    }
//
//    // New POST endpoint to create EnergyData for a specific User
//    @PostMapping("/user/{userId}/energy")
//    public EnergyData createEnergyData(@PathVariable Long userId, @RequestBody EnergyData energyData) {
//        return energyService.saveEnergyData(userId, energyData);
//    }
//
//}
