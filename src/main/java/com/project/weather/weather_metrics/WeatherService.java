//package com.project.weather;
package com.project.weather.weather_metrics ;

import org.springframework.stereotype.Service;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class WeatherService {

    private final HttpClient client = HttpClient.newHttpClient();

    public String getTemperature(String city) throws Exception {
        String apiKey = "b38838bbc67caa442e4e87e6a98eb679"; // Insert your OpenWeatherMap API key
        String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + city + "&appid=" + apiKey + "&units=metric";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
