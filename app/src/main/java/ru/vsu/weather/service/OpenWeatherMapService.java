package ru.vsu.weather.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.vsu.weather.model.DayForecast;

public interface OpenWeatherMapService {
    private final String API_KEY = "fd3dc4ccd4b949864ff25e21014704bd";

    @GET("data/2.5/forecast?q={city name},{country code}&APPID=API_KEY")
    Call<List<DayForecast>> dayForecastList(@Query("city name") String cityName,
                                            @Query("country code") String countryCode);
}
