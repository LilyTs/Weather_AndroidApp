package ru.vsu.weather;

import android.app.Application;

import ru.vsu.weather.di.components.DaggerNetComponent;
import ru.vsu.weather.di.components.NetComponent;
//import ru.vsu.weather.di.modules.AppModule;
import ru.vsu.weather.di.modules.NetModule;

public class App extends Application {
    private static NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        netComponent = DaggerNetComponent.create();
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }
}
