package com.climateapp.climateapp.service;


import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class service {

    private final String API_KEY = "fb23492c2c1647a59f7754e89c83ff04";

    //  Current Weather
    public Map<String, Object> getWeather(String city) {

        String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + city + "&appid=" + API_KEY + "&units=metric";

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        JSONObject json = new JSONObject(response);

        Map<String, Object> weatherData = new HashMap<>();

        weatherData.put("city", city);
        weatherData.put("temp", json.getJSONObject("main").getDouble("temp"));
        weatherData.put("humidity", json.getJSONObject("main").getInt("humidity"));
        weatherData.put("description",
                json.getJSONArray("weather").getJSONObject(0).getString("description"));

        return weatherData;
    }

    // 🔹 5-Day Forecast
    public List<Map<String, Object>> get5DayForecast(String city) {

        String url = "https://api.openweathermap.org/data/2.5/forecast?q="
                + city + "&appid=" + API_KEY + "&units=metric";

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        JSONObject json = new JSONObject(response);
        JSONArray list = json.getJSONArray("list");

        List<Map<String, Object>> forecastList = new ArrayList<>();

        for (int i = 0; i < list.length(); i++) {
            JSONObject obj = list.getJSONObject(i);
            String dateTime = obj.getString("dt_txt");

            // Take one value per day (12:00)
            if (dateTime.contains("12:00:00")) {

                Map<String, Object> dayData = new HashMap<>();

                dayData.put("date", dateTime.split(" ")[0]);
                dayData.put("temp", obj.getJSONObject("main").getDouble("temp"));
                dayData.put("humidity", obj.getJSONObject("main").getInt("humidity"));
                dayData.put("description",
                        obj.getJSONArray("weather").getJSONObject(0).getString("description"));

                forecastList.add(dayData);
            }
        }

        return forecastList;
    }
}




