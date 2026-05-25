package com.irfan.mubasyir.agents;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

@Component
public class WeatherService {

    @Tool("Gets the current weather for a given city")
    public String getWeather(String city) {
        System.out.println("DEBUG: Executing WeatherService.getWeather tool for " + city);
        switch (city.toLowerCase()) {
            case "pune":
                return "The current temperature in Pune is 28 degrees Celsius, with light rain and moderate humidity.";
            case "london":
                return "The current temperature in London is 15 degrees Celsius, cloudy with a chance of drizzle.";
            case "new york":
                return "The current temperature in New York is 22 degrees Celsius, sunny with a gentle breeze.";
            case "tokyo":
                return "The current temperature in Tokyo is 25 degrees Celsius, humid and partly cloudy.";
            default:
                return "Weather information not available for " + city + ". Please try a major city.";
        }
    }
}