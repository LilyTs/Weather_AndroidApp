package ru.vsu.weather.ui.dayslistscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import ru.vsu.weather.App;
import ru.vsu.weather.R;
import ru.vsu.weather.model.Response;
import io.reactivex.Observable;
import ru.vsu.weather.service.OpenWeatherMapService;

public class DaysListActivity extends AppCompatActivity {

    @Inject
    Retrofit retrofit;

    private String v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days);
        ((App)getApplication()).getNetComponent().inject(this);

        Call<Response> response = retrofit.create(OpenWeatherMapService.class).getForecastList("Voronezh", "ru");
        response.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                    v = response.body().getList().get(0).getMain().toString();
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }
}
