package abenamor.io.design.patterns.observer.weather.station.observer;

import abenamor.io.design.patterns.observer.weather.station.subject.Subject;
import abenamor.io.design.patterns.observer.weather.station.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject subject) {
        this.weatherData = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast Display: " + "current pressure " + currentPressure +
                " and last pressure "+ lastPressure);
    }

    @Override
    public void update() {
        if (this.weatherData instanceof WeatherData){
            lastPressure = currentPressure;
            currentPressure = ((WeatherData)this.weatherData).getPressure();
            display();
        }

    }
}
