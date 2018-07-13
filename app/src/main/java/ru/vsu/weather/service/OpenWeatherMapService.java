package ru.vsu.weather.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.vsu.weather.model.Response;
import io.reactivex.Observable;

public interface OpenWeatherMapService {
    final String API_KEY = "fd3dc4ccd4b949864ff25e21014704bd";

    @GET("data/2.5/forecast?q={city name},{country code}&APPID=API_KEY")
    Call<Response> getForecastList(@Query("city name") String cityName,
                                   @Query("country code") String countryCode);
}
