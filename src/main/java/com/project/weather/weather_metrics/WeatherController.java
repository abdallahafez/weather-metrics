//package com.project.weather;
package com.project.weather.weather_metrics ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
@CrossOrigin(origins = "*")   // <--- allow requests from any origin

public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{city}")
    public String getWeather(@PathVariable String city) throws Exception {
        return weatherService.getTemperature(city);
    }
}