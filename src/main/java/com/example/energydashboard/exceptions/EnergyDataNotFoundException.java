package com.example.energydashboard.exceptions;

public class EnergyDataNotFoundException extends RuntimeException{

    public EnergyDataNotFoundException(String msg){
        super(msg);
    }
}
