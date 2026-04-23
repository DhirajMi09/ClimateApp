package com.climateapp.climateapp.controller;

import com.climateapp.climateapp.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class controller {

    @Autowired
    private service weatherService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/getWeather")
    public String getWeather(@RequestParam String city, Model model) {

        // Current Weather
        Map<String, Object> currentWeather = weatherService.getWeather(city);

        // 5-Day Forecast
        List<Map<String, Object>> forecast = weatherService.get5DayForecast(city);

        model.addAttribute("weatherData", currentWeather);
        model.addAttribute("forecastData", forecast);

        return "index";
    }
}




