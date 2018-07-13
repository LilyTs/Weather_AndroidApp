package ru.vsu.weather.di.components;

import javax.inject.Singleton;

import dagger.Component;
//import ru.vsu.weather.di.modules.AppModule;
import ru.vsu.weather.di.modules.NetModule;
import ru.vsu.weather.ui.dayslistscreen.DaysListActivity;

@Singleton
@Component(modules = {/*AppModule.class, */NetModule.class})
public interface NetComponent {
    void inject(DaysListActivity activity);
}
