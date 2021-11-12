package com.vlkozlov.customstarter.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CustomService {
    public String getRandomTemperature() {
        int temperature = new Random().nextInt(100);

        return "Today is " + temperature + " degrees!";
    }
}
